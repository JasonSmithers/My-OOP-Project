package task7;
import java.util.Scanner;
public class Poise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
		// menu
		System.out.println("What would you like to do?\n"
				+ "1- Add new project\n"
				+ "2- Add new person\n"
				);
		
		int userSelection = userInput.nextInt();
		// creating new project
		if(userSelection == 1) 
		{
			System.out.println("What is the project number?");
			String projectNum = userInput.next();
			userInput.nextLine();
			System.out.println("What is the name of the project?");
			String projectName = userInput.nextLine();
			System.out.println("What is the type of building?");
			String buildingType = userInput.nextLine();
			System.out.println("What is the building address?");
			String projectAddress = userInput.nextLine();
			System.out.println("What is the ERF number?");
			String erfNum = userInput.nextLine();
			System.out.println("What is the total fee of the project?");
			float totalFee = userInput.nextFloat();
			userInput.nextLine();
			System.out.println("What is the total amount paid to date?");
			float amountToDate = userInput.nextFloat();
			userInput.nextLine();
			System.out.println("What is the deadline of the project?");
			String deadLine = userInput.nextLine();
			
			// calling NewProject Function
			NewProject newPro = new NewProject(projectNum, projectName, buildingType, projectAddress, erfNum, totalFee, amountToDate, deadLine);
			
			System.out.print(newPro+"\n");
			// next menu
			System.out.println("1 -Would you like to change the deadline?\n"
					+ "2 - Would you like to change the amount of the fee paid to date? ");
			int choice = userInput.nextInt();
			// to change deadline date
			if(choice == 1) 
			{
				System.out.println("What would you like the new date to be?");
				String newDeadLine = userInput.next();
				newPro.getDeadLine();
				newPro.setDeadline(newDeadLine);
			}
			
			if(choice == 2) 
			{
				// to change amount of the fee paid to date
				System.out.println("What would you like the new amount to be?");
				float newAmount = userInput.nextFloat();
				newPro.getAmount();
				newPro.setAmount(newAmount);
			}
		
		}
		
		if(userSelection == 2) 
		{
			// to create a new person
			System.out.println("What Person Type would you like to create? (Architect, Contractor, Customer)");
			String userType = userInput.next();
			userInput.nextLine();
			System.out.println("What is the name of the person?");
			String userName = userInput.next();
			userInput.nextLine();
			System.out.println("What is the telephone number of the person?");
			String userTelephone = userInput.next();
			userInput.nextLine();
			System.out.println("What is your email address of the person?");
			String userEmail = userInput.next();
			userInput.nextLine();
			System.out.println("What is your physical address of the person?");
			String userAddress = userInput.nextLine();
	
			NewPerson newUser = new NewPerson(userType, userName, userTelephone, userEmail, userAddress); 
			
	
			System.out.println(newUser);
	
			// to update personels details
			System.out.println("Would you like to update your contact details? (1- Yes, 2- No)");
			int YesOrNo = userInput.nextInt();
			
			if(YesOrNo == 1) 
			{
				System.out.println("What is the name of the person?");
				String NewName = userInput.next();
				userInput.nextLine();
				System.out.println("What is the telephone of the person?");
				String NewTelephone = userInput.next();
				userInput.nextLine();
				System.out.println("What is the email address of the person?");
				String NewEmail = userInput.next();
				userInput.nextLine();
				System.out.println("What is the physical address of the person?");
				String NewAddress = userInput.nextLine();
				
				NewPerson newDetails = new NewPerson(userType, userName, userTelephone, userEmail, userAddress); 
				newDetails.setDetails(NewName, NewTelephone, NewEmail, NewAddress);
			}
			else 
			{
				System.out.println("No changes have been made");
			}
	}
	}
}
	
