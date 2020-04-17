package Test2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class TotalPriceV5 {

	static String NameOfProducts;
	static double unitPrice, Quantity, TotalPrice, discount ;
	final static int maxreceipt=5;
	public static void initiateCalculator() {
		// Calling all Other Module to Properly RUn the Class 
		welcome();		

		// Start a loop to continue until Max Number Hit 
		for(int i=0;i<maxreceipt;i++) {

			System.out.println("Processing receipt " + i);
			getuserinput();

			calculate();
			DateTime();
			display();
			// Starting calling the Do you continue module 
			if(doYouwantToContinue()==false) {
				break;
			}

		}
	}
	//weclome  
	static void welcome(){
		System.out.println("Follow the steps below to calculate total amount to be paid...");

	}
	//to get user input
	static void getuserinput() {
		Scanner myscanner=new Scanner(System.in);
		boolean continuetonextstep=false;


		do {

			System.out.println("Enter The name of the product: ");
			NameOfProducts=myscanner.nextLine();
			for (int i = 0; i < NameOfProducts.length(); i++) {
				char data = NameOfProducts.charAt(i);

				if(Character.isDigit(data)) {
					System.out.println(i+"th character is a Digit, please start with letter...");
					continuetonextstep=false;
					break;
				}else {
					continuetonextstep=true;
				}

			}
		}while(continuetonextstep==false);

		do {
			try {
				myscanner=new Scanner(System.in);

				System.out.println("Enter unitprice for the product: ");
				unitPrice=myscanner.nextDouble();


				if(unitPrice>=0 && unitPrice<=80) {
					continuetonextstep=true;

				}else {
					System.out.println("invalid input Please enter 1 to 800");
					continuetonextstep=false;
				}
			}catch(Exception e) {
				System.out.println("invalid input Please enter hours 1 to 800");
				continuetonextstep=false;
				e.printStackTrace();
			}
		}while(!continuetonextstep);
		do {
			try {
				myscanner=new Scanner(System.in);
				System.out.println("Enter quantity for the product: ");
				Quantity=myscanner.nextDouble();
				//to get the correct input from the user and loop back if user unput a invalid input

				if(Quantity>=0 && Quantity<=500) {
					continuetonextstep=true;

				}else {
					System.out.println("invalid input Please enter Quantity 1 to 500");
					continuetonextstep=false;
				}
			}catch(Exception e){
				System.out.println("invalid input Please quantity 1 to 500");
				continuetonextstep=false;
				e.printStackTrace();
			}
		}while(!continuetonextstep);

	}
	static void DateTime() {
		//this mathord is to print time and date
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime local =LocalDateTime.now();
		System.out.println(dtf.format(local));
	}
	//to calculate the price and discount
	static void calculate() {
		discount=TotalPrice-discount;
		TotalPrice=unitPrice*Quantity;


		if(TotalPrice>0 && TotalPrice<100) {
			discount=(TotalPrice*10)/100;
		}else if (TotalPrice>100 && TotalPrice<300 ) {
			discount=(TotalPrice*20)/100;
		}else if (TotalPrice>300 && TotalPrice<500) {
			discount=(TotalPrice*30)/100;
		}else if (TotalPrice>500 && TotalPrice<800) {
			discount=(TotalPrice*40)/100;
		}else if(TotalPrice>1000){
			discount=(TotalPrice*50)/100;
		}else {
			TotalPrice =0;
			System.out.println("Invalid input");
		}

	}
	public static boolean doYouwantToContinue() {

		String choice;
		Scanner choiceScanner = new Scanner(System.in);		
		//System.out.println("Do You Want To COntinue ?? yes/No : ");
		choice = choiceScanner.nextLine();

		if(choice.equals("yes")) {
			return true;
		} else {

			System.out.println("Thanks for using our calculator ");
			return false;
		}
	}
	//to display output
	static void display(){
		System.out.println("\n*************************************************\n");
		//to display to time and date which is local to the 
		DateTime();
		System.out.println("The name of the product is: "+NameOfProducts);
		System.out.println("The unit price is : "+unitPrice);
		System.out.println("The quantity is : "+Quantity);
		System.out.println("Discount Price is: "+discount);
		System.out.println("Total Amount before discount: "+TotalPrice);
		System.out.println("Total Amount to be paid: "+(TotalPrice-discount));
		System.out.println("\n**********Coustomer Copy**********");
		System.out.println("\n*************************************************\n");


	}


	public static void main(String[] args) {

		//welcome();

		//this for loop help the program to run for as many time as I want
		//what ever i write inside of the for loop it will run that many time
		for (int i=0; i<5; i++) {
			initiateCalculator();
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