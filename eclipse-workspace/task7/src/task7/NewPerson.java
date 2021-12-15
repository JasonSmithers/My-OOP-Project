package task7;

import java.util.Scanner;

public class NewPerson 
{
	// attributes
	String personType;
	String name;
	String telephone;
	String email;
	String physicalAddress;
	
	// Methods
	public NewPerson(String personType, String name, String telephone, String email, String physicalAddress) 
	{
		this.personType = personType;
		this.name = name;
		this.telephone = telephone;
		this.email = email;
		this.physicalAddress = physicalAddress;
	}
	

	// setters
	public void setDetails(String personType, String NewName, String NewTelephone, String NewEmail, String NewAddress)
	{	
		name = NewName;
		telephone = NewTelephone;
		email = NewEmail;
		physicalAddress = NewAddress; 
		
		
	}

	// toString
	public String toString() 
	{
		String newPersonString = "Type: " + personType;
		newPersonString += "\nName: " + name;
		newPersonString += "\nTelephone: " + telephone;
		newPersonString += "\nEmail: " + email;
		newPersonString+= "\nPhysical Address: " + physicalAddress;
			
		return newPersonString;
	}
}
