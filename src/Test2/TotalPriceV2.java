package Test2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class TotalPriceV2 {
	
	static String NameOfProducts;
	static double unitPrice, Quantity, TotalPrice, discount ;
	
	//weclome  
	static void welcome(){
		System.out.println("Follow the steps below to calculate total amount to be paid...");
		
	}
	//to get user input
	static void getuserinput() {
		Scanner myscanner=new Scanner(System.in);
		
		System.out.println("\nEnter the name of the products: ");
		NameOfProducts=myscanner.nextLine();
		
		System.out.println("Enter unit price: ");
		unitPrice=myscanner.nextDouble();
		
		System.out.println("Enter the quantity: ");
		Quantity=myscanner.nextDouble();
		
		
		
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
		
		
		if(TotalPrice<1500) {
			discount=(TotalPrice*10)/100;
		}else if (TotalPrice>1500 && TotalPrice<3000 ) {
			discount=(TotalPrice*20)/100;
		}else if (TotalPrice>3000 && TotalPrice<4500) {
			discount=(TotalPrice*30)/100;
		}else if (TotalPrice>4500 && TotalPrice<6000) {
			discount=(TotalPrice*40)/100;
		}else if(TotalPrice>6000){
			discount=(TotalPrice*50)/100;
			
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
		System.out.println("\n*************************************************\n");

		
	}

	public static void main(String[] args) {
		
		welcome();
		
		//this for loop help the program to run for as many time as I want
		//what ever i write inside of the for loop it will run that many time
		for (int i=0; i<5; i++) {
		
		getuserinput();
		
		calculate();
		DateTime();
		display();
		}

	}

}
