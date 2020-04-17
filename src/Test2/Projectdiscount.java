//package Test2;

//public class Projectdiscount {
	package Test2;



	import java.util.Scanner;



	public class Projectdiscount {





				//Declare Variables

				static String eProduct;

				static int totalQuantity;

				static double priceProduct;

				static double amountPaid;

				

				public static void start () {

				System.out.println("Product Calculator Please Follow the instruction...\n");

				}

				//Module 1

				public static void getInput() {

				

				//Initialization --- a code that will fill the variable

				@SuppressWarnings("resource")

				Scanner myscanner = new Scanner(System.in);

				

				System.out.println("Enter the product name: ");

				eProduct = myscanner.nextLine();

				System.out.println("Enter quantity of the product: ");

				totalQuantity = myscanner.nextInt();

				System.out.println("Enter price of the product: ");

				priceProduct = myscanner.nextDouble();

				}

			

				

				//Module 2 Process

				public static void Process () {

				amountPaid = totalQuantity * priceProduct;

				}

			

				//module 3 Display Output

			public static void displayOutPut () {

			System.out.println("\nThe product name is: " + eProduct);

			System.out.println("The quantity of product is: " + totalQuantity);

			System.out.println("The price of product is: " + priceProduct);

			System.out.println("The amount paid is: " + amountPaid);

				}

			

				//module 4

				public static void exitProgram() {

				System.out.println("\nThanks for using Bye Bye!!!");

				}

				

				//Driver of the car


	public static void main(String[] args) {
		start ();
		getInput();
		Process ();
		displayOutPut ();
		exitProgram();

	}

}
