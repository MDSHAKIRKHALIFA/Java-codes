package EmployeeCalculator;
import java.util.Scanner;

public class EmployeeCalculatorV3 {
	
	//Declar Variables
	static String Nameofemployee;
	static double Hoursworked, Hourlypayrate, grosspay, netPay;
	
	public static void Welcome() {
		
		System.out.println("Please follow the inistaction for calculatting the netpay of the Employees\n");
		
	}
	//to take user unput
	public static void input() {
		Scanner myscanner=new Scanner(System.in);
		
		System.out.println("Enter The name of the Employee: ");
		Nameofemployee=myscanner.nextLine();
		
		System.out.println("Enter Total hours worked: ");
		Hoursworked=myscanner.nextDouble();
		
		System.out.println("Enter Hourly rate of the employee: ");
		Hourlypayrate=myscanner.nextDouble();
		
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
		System.out.println("Total Netpay of  "+Nameofemployee+" is: "+ (grosspay-netPay)+"\n");
		System.out.println("*************************************************\n");

		
	}
	
	
	public static void exittheprogram() {
		//it is optional we can use it or can write inside if the code 
		
	}
	public static void main(String[] args) {
		Welcome();
		
		//for loop is to give user a limit that how many times the user wants to run the code
		for(int i=0; i<2; i++) {
		input();
		CalculateGrossPay();
		displayoutput();
		
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

		
		}
		
		
	}

}
