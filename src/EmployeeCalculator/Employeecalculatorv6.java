package EmployeeCalculator;

//module
import java.util.Scanner; //FUNCTIONS
							//METHODS
							//MODULES

public class Employeecalculatorv6 {

	// variable Declaration//module
	static int processcounter = 0;

	final static int maxemployees = 5;

	static String[] ename = new String[maxemployees];
	static double[] numberOfHourWorked = new double[maxemployees];
	static double[] hourlyPayRate = new double[maxemployees];
	static double[] grossPay = new double[maxemployees];
	static double[] netPay = new double[maxemployees];

	public static void initiateCalculator() {
		// Calling all Other Module to Properly RUn the Class
		welcome();
		start();

		// Start a loop to continue until Max Number Hit
		for (int i = 0; i < maxemployees; i++) {

			System.out.println("Processing Employee " + i);
			getInPut();
			calculatehourlyPayRate();
			displayoutput();

			// Starting calling the Do you continue module
			if (doYouwantToContinue() == false) {
				break;
			}

		}
		exitprogram();
	}

	public static void start() {
		System.out.println("Employee Calcualtor Please Follow the Instruction ...\n");

	}

	public static void welcome() {
		System.out.println("Welcome to EMP Cal - Please Fallow Instuctions.....");

		System.out.println("");

		System.out.println("");
	}

	public static void getInPut() {

		// Initialization Of Variable

		Scanner myscanner = new Scanner(System.in);
		boolean isDataValid = true; // null

		do {
			System.out.println("Employee name: ");
			ename[processcounter] = myscanner.nextLine();

			for (int i = 0; i < ename[processcounter].length(); i++) {
				char data = ename[processcounter].charAt(i);
				if (Character.isDigit(data)) {
					System.out.println(
							i + " the character is a Digit No Name can start with digit please ennter a valid name  ");
					isDataValid = false;
					break;
				} else {
					isDataValid = true;
				}

			}
		} while (isDataValid == false);

		// Validate Totoal Hour Input
		do {
			try {
				myscanner = new Scanner(System.in); // It will Re-initialized
				System.out.println("Total amout of hours  : ");
				numberOfHourWorked[processcounter] = myscanner.nextDouble();
				if (numberOfHourWorked[processcounter] >= 0 && numberOfHourWorked[processcounter] <= 80) {
					isDataValid = true;
				} else {
					System.out.println("Invalid amount - Please Enter 0 to 80");
					isDataValid = false;
				}
			} catch (Exception e) {

				System.out.println("Invalid Entry - - Please Enter 0 to 80 ");
				isDataValid = false;

				e.printStackTrace();
			}

		} while (isDataValid == false);

		// Hourly Rate Validation
		do {
			try {
				myscanner = new Scanner(System.in); // It will Re-initilized
				System.out.println("hourly pay rate : ");
				hourlyPayRate[processcounter] = myscanner.nextDouble();
				if (hourlyPayRate[processcounter] >= 10 && hourlyPayRate[processcounter] <= 50) {
					isDataValid = true;
				} else {
					System.out.println("Invalid Rate - Please Enter 10 to 50");
					isDataValid = false;
				}
			} catch (Exception e) {
				System.out.println("Invalid Entry - - Please Enter10 to 50 ");
				isDataValid = false;
			}

		} while (isDataValid == false);

	}

	public static void editinput(int slno) {

		// Initialization Of Variable

		Scanner myscanner = new Scanner(System.in);
		boolean isDataValid = true; // null

		do {
			System.out.println("EDIT NAME: ");
			ename[slno] = myscanner.nextLine();

			for (int i = 0; i < ename[slno].length(); i++) {
				char data = ename[slno].charAt(i);
				if (Character.isDigit(data)) {
					System.out.println(
							i + " the character is a Digit No Name can start with digit please ennter a valid name  ");
					isDataValid = false;
					break;
				} else {
					isDataValid = true;
				}

			}
		} while (isDataValid == false);

		// Validate Totoal Hour Input
		do {
			try {
				myscanner = new Scanner(System.in); // It will Re-initialized
				System.out.println(" EDIT Total amout of hours  : ");
				numberOfHourWorked[slno] = myscanner.nextDouble();
				if (numberOfHourWorked[slno] >= 0 && numberOfHourWorked[slno] <= 80) {
					isDataValid = true;
				} else {
					System.out.println("Invalid amount - Please Enter 0 to 80");
					isDataValid = false;
				}
			} catch (Exception e) {

				System.out.println("Invalid Entry - - Please Enter 0 to 80 ");
				isDataValid = false;

				e.printStackTrace();
			}

		} while (isDataValid == false);

		// Hourly Rate Validation
		do {
			try {
				myscanner = new Scanner(System.in); // It will Re-initilized
				System.out.println(" EDIT hourly pay rate : ");
				hourlyPayRate[slno] = myscanner.nextDouble();
				if (hourlyPayRate[slno] >= 10 && hourlyPayRate[slno] <= 50) {
					isDataValid = true;
				} else {
					System.out.println("Invalid Rate - Please Enter 10 to 50");
					isDataValid = false;
				}
			} catch (Exception e) {
				System.out.println("Invalid Entry - - Please Enter10 to 50 ");
				isDataValid = false;
			}

		} while (isDataValid == false);

	}

	public static void deleteData(int slno) {
		ename[slno] = null;
		numberOfHourWorked[slno] = 0.00;
		hourlyPayRate[slno] = 0.00;
		grossPay[slno] = 0.00;
		netPay[slno] = 0.00;

	}

	public static void calculatehourlyPayRate() {

		// process
		grossPay[processcounter] = hourlyPayRate[processcounter] * numberOfHourWorked[processcounter];

		if (grossPay[processcounter] > 0 && grossPay[processcounter] <= 1500) {
			netPay[processcounter] = grossPay[processcounter] - (grossPay[processcounter] * 10) / 100;
		} else if (grossPay[processcounter] > 1500 && grossPay[processcounter] <= 3000) {
			netPay[processcounter] = grossPay[processcounter] - (grossPay[processcounter] * 20) / 100;
		} else if (grossPay[processcounter] > 3000 && grossPay[processcounter] <= 4500) {
			netPay[processcounter] = (grossPay[processcounter] - (grossPay[processcounter] * 30) / 100);
		} else if (grossPay[processcounter] > 4500 && grossPay[processcounter] >= 6000) {
			netPay[processcounter] = grossPay[processcounter] - (grossPay[processcounter] * 40) / 100;
		} else if (grossPay[processcounter] > 6000) {
			netPay[processcounter] = grossPay[processcounter] - (grossPay[processcounter] * 50) / 100;
		} else {
			netPay[processcounter] = 0;
			System.out.println("invalid input captured!!!! ");
		}

	}

	public static void calculateEditedhourlyPayRate(int slno) {

		// process
		grossPay[slno] = hourlyPayRate[slno] * numberOfHourWorked[slno];

		if (grossPay[slno] > 0 && grossPay[slno] <= 1500) {
			netPay[slno] = grossPay[slno] - (grossPay[slno] * 10) / 100;
		} else if (grossPay[slno] > 1500 && grossPay[slno] <= 3000) {
			netPay[slno] = grossPay[slno] - (grossPay[slno] * 20) / 100;
		} else if (grossPay[slno] > 3000 && grossPay[slno] <= 4500) {
			netPay[slno] = (grossPay[slno] - (grossPay[slno] * 30) / 100);
		} else if (grossPay[slno] > 4500 && grossPay[slno] >= 6000) {
			netPay[slno] = grossPay[slno] - (grossPay[slno] * 40) / 100;
		} else if (grossPay[slno] > 6000) {
			netPay[slno] = grossPay[slno] - (grossPay[slno] * 50) / 100;
		} else {
			netPay[slno] = 0;
			System.out.println("invalid input captured!!!! ");
		}

	}

	public static void displayoutput() {
		System.out.println("\n=========================PAY SLIP=======================:");
		System.out.println("\nEmployee name is:" + ename[processcounter]);
		System.out.println("Employee Total Hour is:" + numberOfHourWorked[processcounter]);
		System.out.println("Employee Hourly Rate is:" + hourlyPayRate[processcounter]);
		System.out.println("Employee groospay is:" + grossPay[processcounter]);
		System.out.println("Empl0yees tax deduction" + (grossPay[processcounter] - netPay[processcounter]));
		System.out.println("Employee netPay is:" + netPay[processcounter]);
		System.out.println("\n=========================PAY SLIP=======================:");
	}

	public static void displayEDITEDoutput(int slno) {
		System.out.println("\n=========================PAY SLIP=======================:");
		System.out.println("\nEmployee name is:" + ename[processcounter]);
		System.out.println("Employee Total Hour is:" + numberOfHourWorked[processcounter]);
		System.out.println("Employee Hourly Rate is:" + hourlyPayRate[processcounter]);
		System.out.println("Employee groospay is:" + grossPay[processcounter]);
		System.out.println("Empl0yees tax deduction" + (grossPay[processcounter] - netPay[processcounter]));
		System.out.println("Employee netPay is:" + netPay[processcounter]);
		System.out.println("\n=========================PAY SLIP=======================:");
	}

	public static void displayTable() {

		System.out.println("\n===============================================================");
		System.out.println(" EMPLOYEE NAME | TOTAL HOURS | HOURLY RATE | GROSSPAY |  NETPAY |");

		for (int i = 0; i < processcounter; i++) {

			System.out.println(ename[i] + "       |  " + "   "+numberOfHourWorked[i] + "    |       " + hourlyPayRate[i] + "  | " + grossPay[i] + "   |   "
					+ netPay[i] + "|");
		}
		System.out.println("\n===============================================================");
	}

	public static void exitprogram() {

		System.out.println("");

		System.out.println("");

		System.out.println("Thank You For Using EMP Cal - GOODBYE");
	}

	public static boolean doYouwantToContinue() {

		String choice;
		Scanner choiceScanner = new Scanner(System.in);
		System.out.println("Do You Want To COntinue ?? yes/No : ");
		choice = choiceScanner.nextLine();

		if (choice.equals("yes")) {
			return true;
		} else {
			return false;
		}
	}

	public static void showmenu() {
		String menuoptionselected;
		if (processcounter == maxemployees) {

			Scanner scan = new Scanner(System.in);
			System.out.print("\nplease select A option A-add/E-Edit/D-Delete/X-Stop:\t");
			menuoptionselected = scan.nextLine();
			if (menuoptionselected.equals("A")) {
				System.out.println("MAX HAS REACHED NOT ALLOWED TOO ADD MORE CALCULATION PLEASE SELECT FROM MENU");
				showmenu();
			}

		} else {

			Scanner scan = new Scanner(System.in);
			System.out.print("\nplease select A option A-add/E-Edit/D-Delete/X-Stop:\t");
			menuoptionselected = scan.nextLine();
		}
		switch (menuoptionselected) {

		case "A":
			System.out.println("starting Add operation");
			// code to complete add operation
			getInPut();
			calculatehourlyPayRate();
			displayoutput();
			processcounter++;
			displayTable(); // this will show aggragated table

			showmenu();

		case "E":
			System.out.println("starting Edit operation");
			int slno;
			Scanner editchoisescanner = new Scanner(System.in);
			System.out.print("PLEASE GIVE ME SERIAL NUMBER YOU'LL LIKE TO EDIT");
			slno = editchoisescanner.nextInt();

			editinput(slno);// method call with argument of a parameter
			calculateEditedhourlyPayRate(slno);
			displayEDITEDoutput(slno);

			displayTable();
			showmenu();

		case "D":
			System.out.println("starting Delete operation");
			int slnofordelete;
			Scanner deletechoisescanner = new Scanner(System.in);
			System.out.print("PLEASE GIVE ME SERIAL NUMBER YOU'LL LIKE TO DELETE");
			slnofordelete = deletechoisescanner.nextInt();

			deleteData(slnofordelete);
			displayEDITEDoutput(slnofordelete);
			displayTable();

			showmenu();

		case "X":
			System.out.println("Exiting out from the program");
			System.exit(0);

		default:
			System.out.println("something is wrong please fallow instrctions.....");
			showmenu();
		}
	}

	public static void main(String[] args) {

		showmenu();
	}

}