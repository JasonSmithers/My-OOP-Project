package task7;

import java.util.Scanner;

public class NewProject 
{
	String projectNum;
	String projectName;
	String buildingType;
	String projectAddress;
	String erfNum;
	float totalFee;
	float amountToDate;
	String deadLine;
	
	// Methods
	public NewProject(String projectNum, String projectName, String buildingType, String projectAddress, String erfNum, float totalFee, float amountToDate, String deadLine) 
	{
		this.projectNum = projectNum;
		this.projectName = projectName;
		this.buildingType = buildingType;
		this.projectAddress = projectAddress;
		this.erfNum = erfNum;
		this.totalFee = totalFee;
		this.amountToDate = amountToDate;
		this.deadLine = deadLine;
	}
	// getters
	public String getDeadLine() 
	{
		return deadLine;
	}
	
	public float getAmount() 
	{
		return amountToDate;
	}
	// setters
	public void setDeadline(String newDeadLine) 
	{	
		deadLine = newDeadLine;
	}
	
	public void setAmount(float newAmount)
	{
		amountToDate = newAmount;
	}
		
	// toString
	public String toString() 
	{
		String newProjectString = "Project Number: " + projectNum;
		newProjectString += "\nProject Name: " + projectName;
		newProjectString += "\nBuilding Type: " + buildingType;
		newProjectString += "\nProject Address: " + projectAddress;
		newProjectString+= "\nERF Number: " + erfNum;
		newProjectString += "\nTotal Fee: " + totalFee;
		newProjectString += "\nAmount Paid To Date: " + amountToDate;
		newProjectString += "\nDeadline: " + deadLine;
				
		return newProjectString;
	}
	
	

}
