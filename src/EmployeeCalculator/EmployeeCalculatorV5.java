package EmployeeCalculator;
import java.util.Scanner;
public class EmployeeCalculatorV5 {
	//Declar Variables
	static String Nameofemployee;
	static double Hoursworked, Hourlypayrate, grosspay, netPay;
	final static int maxEmployee=5;
	public static void initiateCalculator() {
		// Calling all Other Module to Properly RUn the Class 
		Welcome();			

		// Start a loop to continue until Max Number Hit 
		for(int i=0;i<maxEmployee;i++) {

			System.out.println("Processing Employee " + i);

			input();
			CalculateGrossPay();
			displayoutput();
			// Starting calling the Do you continue module 
			if(doYouwantToContinue()==false) {
				break;
			}

		}
	}

	public static void Welcome() {

		System.out.println("Please follow the inistaction for calculatting the netpay of the Employees\n");

	}
	//to take user unput
	public static void input() {

		Scanner myscanner=new Scanner(System.in);
		boolean continuetonextstep=true;


		do {

			System.out.println("Enter The name of the Employee: ");
			Nameofemployee=myscanner.nextLine();
			for (int i = 0; i < Nameofemployee.length(); i++) {
				char data = Nameofemployee.charAt(i);

				if(Character.isDigit(data)) {
					System.out.println(i+"th character is a Digit, please start with letter...");
					continuetonextstep=false;
					break;
				}else {
					continuetonextstep=true;
				}

			}
		}while(continuetonextstep==false);

		//to get the correct input from the user and loop back if user unput a invalid input

		do {
			try {
				myscanner=new Scanner(System.in);

				System.out.println("Enter Total hours worked: ");
				Hoursworked=myscanner.nextDouble();


				if(Hoursworked>=0 && Hoursworked<=80) {
					continuetonextstep=true;

				}else {
					System.out.println("invalid input Please enter hours 0 to 80");
					continuetonextstep=false;
				}
			}catch(Exception e) {
				System.out.println("invalid input Please enter hours 0 to 80");
				continuetonextstep=false;
			}
		}while(!continuetonextstep);
		//here the loop finish for the how many hours worked 

		//to start new loop the get the valid input for hourly rate of the employee 
		do {
			try {
				myscanner=new Scanner(System.in);
				System.out.println("Enter Hourly rate of the employee: ");
				Hourlypayrate=myscanner.nextDouble();
				//to get the correct input from the user and loop back if user unput a invalid input

				if(Hourlypayrate>=10 && Hourlypayrate<=50) {
					continuetonextstep=true;

				}else {
					System.out.println("invalid input Please enter hours 10 to 50");
					continuetonextstep=false;
				}
			}catch(Exception e){
				System.out.println("invalid input Please enter hours 10 to 50");
				continuetonextstep=false;
			}
		}while(!continuetonextstep); //to loo[ back to the do if user inout an invalid input
	}
	public static void CalculateGrossPay() {


		//it is to calculate the tax of the employee 
		grosspay=Hoursworked * Hourlypayrate;
		if(netPay>0&&netPay<1500) {
			netPay=(grosspay*10)/100;
		}else if(netPay>1500 && netPay<3000) {
			netPay=(grosspay*20)/100;
		}else if(netPay>3000 && netPay<4500) {
			netPay=(grosspay*30)/100;
		}else if(netPay>4500 && netPay<6000) {
			netPay=(grosspay*40)/100;
		}else if (netPay<6000) {
			netPay=(grosspay*50)/100;
		}
		else {
			netPay-=0;
			System.out.println("Invalid input");
		}
	}


	//to display output
	public static void displayoutput() {

		System.out.println("*************************************************\n");
		System.out.println("The name of the Employee is: "+ Nameofemployee+"\n");
		System.out.println("Total hours worked: "+ Hoursworked+"\n");
		System.out.println("Employee's hourly Rate is: "+ Hourlypayrate+"\n");
		System.out.println("Total Gross pay of "+Nameofemployee+" is: "+ grosspay+"\n");
		System.out.println("Total Tax paid by "+Nameofemployee+" is: "+ netPay+"\n");
		System.out.println("Total Netpay of  "+Nameofemployee+" is: "+(grosspay- netPay)+"\n");
		System.out.println("*************************************************\n");


	}
	public static boolean doYouwantToContinue() {

		String choice;
		Scanner choiceScanner = new Scanner(System.in);		
		System.out.println("Do You Want To COntinue ?? yes/No : ");
		choice = choiceScanner.nextLine();

		if(choice.equals("yes")) {
			return true;
		} else {
			return false;
		}
	}
	/*public static void exittheprogram() {
		System.out.println("Thanks for using our calculator Bye Bye!!!");
	}*/
	public static void main(String[] args) {
		Welcome();

		//for loop is to give user a limit that how many times the user wants to run the code
		for(int i=0; i<5; i++) {
			input();
			CalculateGrossPay();
			displayoutput();
			doYouwantToContinue();

			//this string is to give user a option if he/she wants to continue
			String Choiceoption;
			Scanner option=new Scanner(System.in);

			//just to print out the the question and know the choice
			System.out.println("Press any key to continue. Type 'no' to stop the program \n");
			Choiceoption=option.nextLine();

			//this if statement is to break the code is user type "no"
			if(Choiceoption.equals("no")) {
				System.out.println("\nThanks for using our calculator!");

				break;
			}
			//exittheprogram();
		}

	}
}
