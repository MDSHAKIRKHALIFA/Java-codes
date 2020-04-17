package EmployeeCalculator;
import java.util.Scanner;
public class EmployeeCalculatorV1 {

	public static void main(String[] args) {
		
		String Nameofemployee;
		double HoursWorked, HourlyRate, grossPay;
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("Enter the name of the employee: ");
		Nameofemployee=myscanner.nextLine();
		
		System.out.println("Enter the hours worked: ");
		HoursWorked=myscanner.nextDouble();
		
		System.out.println("enter horly pay rate: ");
		HourlyRate=myscanner.nextDouble();
		
		grossPay=HoursWorked*HourlyRate;
		
		System.out.println("\nThe name of the employee is : "+Nameofemployee);
		System.out.println("Total Hours worked : "+HoursWorked);
		System.out.println("the Hourly Rate is: "+HourlyRate);
		System.out.println("Total gross pay is: "+grossPay);
		

	}

}
