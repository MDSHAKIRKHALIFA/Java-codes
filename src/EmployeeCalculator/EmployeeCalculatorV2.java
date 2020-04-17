package EmployeeCalculator;
import java.util.Scanner;

public class EmployeeCalculatorV2 {
	
	//Declar Variables
	static String Nameofemployee;
	static double Hoursworked, Hourlypayrate, grosspay;
	
	public static void Welcome() {
		
		System.out.println("Please follow the inistaction for calculatting the gross pay of the Employees\n");
		
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
		
		grosspay=Hoursworked * Hourlypayrate;
	}
	
	
	
	//to display output
	public static void displayoutput() {
		System.out.println("*************************************************\n");
		System.out.println("The name of the Employee is: "+ Nameofemployee+"\n");
		System.out.println("Total hours worked: "+ Hoursworked+"\n");
		System.out.println("Employee's hourly Rate is: "+ Hourlypayrate+"\n");
		System.out.println("Total Gross pay of "+Nameofemployee+" is: "+ grosspay+"\n");
		
	}
	public static void exittheprogram() {
		
	}



	public static void main(String[] args) {
		Welcome();
		input();
		CalculateGrossPay();
		displayoutput();
		
		
	}

}
