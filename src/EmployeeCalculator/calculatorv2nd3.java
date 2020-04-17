package EmployeeCalculator;
import java.util.Scanner;
public class calculatorv2nd3 {
	

	//variable Decleration

	static String productName;

	static double quantity,  netPay, total, unitPrice;

//	static double unitPrice;

	//static double total;

	//static double netPay;

	//Module 1 : welcome

		public static void welCome() {



			System.out.println("welCome to EMP Cal - Please Fallow Instuctions.....");

			System.out.println("");

			System.out.println("");

				

		}

		

		 //module2      //input

		public static void getinput() {

			//Taking an object Refrence for scanning information from any input system

			Scanner hrscan = new Scanner(System.in);

			

			System.out.println("productName: ");

			productName= hrscan.nextLine();

			

			System.out.println("quantity");

			quantity = hrscan.nextDouble();

			

			System.out.println("unitPrice ");

			unitPrice = hrscan.nextDouble();

	

		}

       

           //module3 

		public static void calculateUnitPrice() {

			//process 

			total = quantity * unitPrice;

			

			if(total>0 && total<=1500) {

				netPay = total - (total*10)/100;

	        }else if(total > 1500 && total <=3000 ) {

			     netPay = total - (total*20)/100;

	        }else if(total > 3000 && total <=4500) {

	        	netPay =(total - (total*30)/100);

	        }else if(total > 4500 && total >=6000) {

	        	netPay = total - (total*40)/100;

	        }else if(total > 6000) { 

	             netPay = total -(total*50)/100;

	        }

	        else {

	        	netPay = 0;

	        	System.out.println("invalid input captured!!!! ");

	        }		
		}

	

		

		

		

		//module4

		//display out put

		public static void diplayOutput() {



			//display output

			System.out.println("productName: "+ productName);

			System.out.println("quantity: "+ quantity);

			System.out.println("unitPrice: "+ unitPrice);

			System.out.println("===========================================");

			System.out.println("Total:"+ total);

			System.out.println("netPay:"+ netPay);

			

		

		}

		       //module 4 Exit program

		public static void exitProgram() {

			System.out.println("");

			System.out.println("");

			System.out.println("Thank You For Using EMP Cal - GOODBYE");

		}
		

	           //driver of the car>> main

		public static void main(String[]args) {

		//calling all other module to properly run the class

		

			welCome();

			 //local variable
//int int is to decler how many times this loop will run
			int maxreciepts=10;{
//if you put0+1 the receipt # will start from 1 of 0 then start fro 0
		    int	recieptcounter= 0+1;
			boolean choice=false;
			//boolean chice=true;

	 do {

		System.out.println("processing reciept number: "+recieptcounter);		

			getinput();

			calculateUnitPrice();

			diplayOutput();

			

			String continueYesNo;

			Scanner myscanner = new Scanner(System.in);

			System.out.println("\nDo You WAnt TO ContinueYes/NO");

			continueYesNo = myscanner.nextLine();
			
			//if(continueYesNo.equals("no")) {
			//	System.out.println("\nThanks for using our calculator!");

				//break;

	 if(recieptcounter < maxreciepts && continueYesNo.equals("yes")) {

		choice=true; 
		recieptcounter = recieptcounter+1;
		
		
	 }else {

		 choice = false;

	 }
//you will have to put the choice two equal sign in while loop to make the statement true
	 }while(choice == true);

	 exitProgram() ;
			}
	 }
		}
	 