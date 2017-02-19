package by.epam.tr.mod5;

import java.util.GregorianCalendar; 
import java.util.Calendar; 
import java.text.DateFormatSymbols;

public class Task1 {
	public static void main(String[] args){
		int year = 2017;
		for (int i = 0; i < 12; i++){
			Task1.CalendarMonth(year, i, 1);
		}
	}
	
	public static void CalendarMonth(int _year, int _month, int _day)     {         
		GregorianCalendar d = new GregorianCalendar(_year,_month,_day); 		
		String monthName = new DateFormatSymbols().getMonths()[_month];
		System.out.println(monthName);
		int weekday = d.get(Calendar.DAY_OF_WEEK); 
        System.out.println("Вс Пн Вт Ср Чт Пт Сб");         
        for(int i = Calendar.SUNDAY; i<weekday; i++)             
        	System.out.print("   "); 
 
        do  {   
        	int day = d.get(Calendar.DAY_OF_MONTH);             
        	if(day < 10) System.out.print(" ");            
        	System.out.print(day); 
 
            System.out.print(" ");
            
            if(weekday == Calendar.SATURDAY)                 
            	System.out.println();  
  
            d.add(Calendar.DAY_OF_MONTH,1);             
            weekday = d.get(Calendar.DAY_OF_WEEK);         
            }while(d.get(Calendar.MONTH) == _month); 
 
        if(weekday != Calendar.SUNDAY)             
        	System.out.println();   
        System.out.println();
        } 
}
