package by.epam.tr.mod5;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Collections;

import by.epam.tr.mod5.Record;

public class RecordBook {
	private List<Record> recBook;
	private String name;
	
	public RecordBook(){
		recBook = null;
		name = "";
	}
	public RecordBook(String _name,List<Record> _recBook){
		recBook = _recBook;
		name = _name;
	}
	
	public String getName(){
		return this.name;
	}

	public void setName(String name){
		this.name = name;
	}
	
	
	public  List<Record> getRecBook(){
		return this.recBook;
	}

	public void setRecBook(List<Record> recBook){
		this.recBook = recBook;
	}
	
	public Record search(String lastName, String firstName){
		for (Record rec : this.getRecBook()){
			if(lastName.equals(rec.getLastName()) == true &&
					firstName.equals(rec.getFirstName())){
				System.out.println(rec.toString());
				return rec;
			}
		}
		return null;
	}
	
	public Record search(String phone){
		for (Record rec : this.getRecBook()){
			if(phone.equals(rec.getPhone()) == true){
				System.out.println(rec.toString());
				return rec;
			}
		}
		return null;
	}
	
	public Record search(Date date){
		for (Record rec : recBook){
			if(date.equals(rec.getDateOfBirth()) == true){
				System.out.println(rec.toString());
				return rec;
			} 							
		}
		return null;
	}
	
	public void removeRecord(String lastName, String firstName){
		Record rec = search(lastName, firstName);
		recBook.remove(rec);
		
	}
	
	public void sortByDate(){
		Collections.sort(recBook, new Comparator<Record>(){
			public int compare(Record rec1, Record rec2){
				return rec1.getDateOfBirth().compareTo(rec2.getDateOfBirth());
			}
		});
	}
	
		
	public void sortByLastName(){
		Collections.sort(recBook, new Comparator<Record>(){
			public int compare(Record rec1, Record rec2){
				return rec1.getLastName().compareTo(rec2.getLastName());
			}
		});
	}
	
	public void printBook(){
		for (Record rec : recBook){
			System.out.println(rec.toString());
		}
		System.out.println();		
	}
}
