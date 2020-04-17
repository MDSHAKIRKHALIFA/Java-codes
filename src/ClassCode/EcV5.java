package ClassCode;

import java.util.Scanner;

public class EcV5 {
	
	// Declare Variables 
	 static String eName;
	 static double totalHour;
	 static double hourlyRate;
	 static double grossPay;
	 static double netPay;

	 
	 // FInal Variable 
	 final static int maxEmployee=2;
	 
	 
	 public static void initiateCalculator() {
			// Calling all Other Module to Properly RUn the Class 
			start();
			
		
			// Start a loop to continue untill Max Number Hit 
			for(int i=0;i<maxEmployee;i++) {
				
				System.out.println("Processing Employee " + i);
				
				getInput();
				calculateSalary();
				displayOutPut();
				
				
				// Starting calling the Do you continue module 
				if(doYouwantToContinue()==false) {
					break;
				}
				
			}
	 }
	 
	
	public static void start() {
		System.out.println("Employee Calcualtor Please Follow the Instruction ...\n");
	
	}
	
	//Module 1 
	public static void  getInput() {
		
		// Initialization Of Variable 
		
		Scanner  myscanner  = new Scanner(System.in);
		boolean isDataValid = true; //null

		
		do {
			System.out.println("Enter Name : ");
			eName = myscanner.nextLine();
			
			for(int i=0;i<eName.length();i++) {
				char data = eName.charAt(i);
				if(Character.isDigit(data)) {
					System.out.println(i + " th character is a Digit No Name can start with digit please ennter a valid name  ");
					isDataValid = false;
					break;
				} else {
					isDataValid = true;
				}
				
			}		
		}while(isDataValid==false);

		
		
		// Validate Totoal Hour Input 
		do {
			try {
				myscanner = new Scanner(System.in); // It will Re-initialized 
				System.out.println("Enter Total Hour  : ");
				totalHour = myscanner.nextDouble();
				if(totalHour >=0 && totalHour <= 80 ) {
					isDataValid = true;
				} else {
					System.out.println("Invalid Hour - Please Enter 0 to 80");
					isDataValid = false;
				}
			} catch (Exception e) {
				
				System.out.println("Invalid Entry - - Please Enter 0 to 80 ");
				isDataValid = false;
				
				e.printStackTrace();
			}
		
		}while(isDataValid==false);
		
		
		// Hourly Rate Validation 
		do {
			try {
				myscanner = new Scanner(System.in); // It will Re-initilized 
				System.out.println("Enter Hourly Rate : ");
				hourlyRate = myscanner.nextDouble();
				if(hourlyRate >=10 && hourlyRate <= 50 ) {
					isDataValid = true;
				} else {
					System.out.println("Invalid Rate - Please Enter 10 to 50");
					isDataValid = false;
				}
			} catch (Exception e) {
				System.out.println("Invalid Entry - - Please Enter10 to 50 ");
				isDataValid = false;
			}
		
		}while(isDataValid==false);
		
		
	}
	
	//Module 2 
	public static void calculateSalary() {
		grossPay = totalHour * hourlyRate;
		
	
		if(grossPay>0 && grossPay<=1500) {
			netPay = grossPay - (grossPay*10)/100;
		} else if(grossPay > 1500 &&  grossPay<=3000 ) {
			netPay = grossPay - (grossPay*20)/100;
		} else if(grossPay > 3000 &&  grossPay<=4500 ) {
			netPay = grossPay - (grossPay*30)/100;
		} else if(grossPay > 4500 &&  grossPay<=6000 ) {
			netPay = grossPay - (grossPay*40)/100;
		} else if(grossPay > 6000  ) {
			netPay = grossPay - (grossPay*50)/100;
		} 
		else {
			netPay = 0;
			System.out.println("Invalid Input Captured!!!!");
		}
	}
		
	//Module 3 
	public static void displayOutPut() {
	// Display Out Put 
		
		System.out.println("\nEmployee Name Is : "  + eName );
		System.out.println("Total Hour Worked : "  + totalHour );
		System.out.println("Hourly Rate Of the Employee  : "  + hourlyRate );
		System.out.println("Gross Pay for the employee  : "  + grossPay );
		System.out.println("Net Pay for the employee  : "  + netPay );
	}
	
	//Module 4 
	public static void exitProgram() {
		System.out.println("\nThanks for using Bye Bye !!!");
	}
	
	
	// A REturanable Module / Function 
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
	
	
	public static void main(String[] args) {
		// Calling all Other Module to Properly RUn the Class 
		start();
		
	
		// Start a loop to continue untill Max Number Hit 
		for(int i=0;i<maxEmployee;i++) {
			
			System.out.println("Processing Employee " + i);
			
			getInput();
			calculateSalary();
			displayOutPut();
			
			
			// Starting calling the Do you continue module 
			if(doYouwantToContinue()==false) {
				break;
			} else  {
				if(i==maxEmployee-1) {
					System.out.println("Sorry You Reached the Max Calculation !!!");
					break;
				}
			}
			
		}
	}

}