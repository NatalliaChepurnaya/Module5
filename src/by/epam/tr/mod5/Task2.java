package by.epam.tr.mod5;

import by.epam.tr.mod5.Record;
import by.epam.tr.mod5.RecordBook;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task2 {	
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		List<Record> records = new ArrayList<Record>();
		RecordBook book;
		
		
		String lastName = "Holms";
		String firstName = "Kate";
		
		//Add records
		records.add(new Record("Holms","Sherlock",new Date("1991/12/29"),"123456"));
		records.add(new Record("Watson","John",new Date("1978/02/06"),"898392"));
		records.add(new Record("Holms","Kate",new Date("1980/10/07"),"345456456"));
		records.add(new Record("Parker","Peter",new Date("1970/11/20"),"4234"));
		
		book = new RecordBook("Book 1",records);
		
		System.out.println("First creation");
		book.printBook();
		
		//Search and Remove records
		book.removeRecord(lastName, firstName);
		System.out.println();		
		System.out.println(lastName + " " + firstName 
				+ " was deleted. Updated record book:");
		book.printBook();
		
		//Sorted by date
		book.sortByDate();
		System.out.println("Sorted by date of birth:");
		book.printBook();
		
		//Sorted by date
		book.sortByLastName();
		System.out.println("Sorted by last name:");
		book.printBook();
			
		
	}

}
