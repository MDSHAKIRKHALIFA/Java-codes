package Test2;
import java.util.Scanner;

public class TotalPrice {

	public static void main(String[] args) {
		
		String NameOfProducts;
		double unitPrice, Quantity, TotalPrice;
		
		System.out.println("Please Follow These Steps Below To Calculate Total Price Of The Product...\n");
		
		Scanner myscanner=new Scanner(System.in);
		
		
		System.out.print("Enter Name Of The Product: \n");
		NameOfProducts=myscanner.nextLine();
		
		System.out.print("Enter The Unit Price: \n");
		unitPrice=myscanner.nextDouble();
		
		System.out.print("Enter The Quantity: \n");
		Quantity=myscanner.nextDouble();
		
		
		TotalPrice= unitPrice * Quantity;
		
		System.out.println("**************************************\n");
		
		System.out.println("The Name Of The Product Is: "+ NameOfProducts);
		System.out.println("The Unit Price is: "+ unitPrice);
		System.out.println("The Quantity is: "+ Quantity);
		System.out.println("Total Price is: "+ TotalPrice);
		
		
	
		
		
		
		
		
		
		
		
		
	}

}
