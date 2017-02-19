package by.epam.tr.mod5;

import java.util.Date;

public class Record {
	private String lastName;
	private String firstName;
	private Date dateOfBirth;
	private String phone;
	
	public Record(String _lastName, String _firstName, Date _date){
		lastName = _lastName;
		firstName = _firstName;
		dateOfBirth = _date;
		phone = "";
				
	}
	
	public Record(String _lastName, String _firstName, Date _date, String _phone){
		this(_lastName,_firstName,_date);
		phone = _phone;
				
	}
	
	public String getLastName(){
		return this.lastName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getPhone(){
		return this.phone;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}
	
	public Date getDateOfBirth(){
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date date){
		this.dateOfBirth = date;
	}
	
	public String toString(){
		return firstName + " " + lastName + "\nPhone number: "
				+ phone + "\nDate of Birth: " + dateOfBirth;
	}
	

}
