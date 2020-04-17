package Oops2;

public class HSBCBank implements USBank, BrazilBank {//we are chieveng multiple inheritance 
	//is-a relationship
	
	
	//if a class is implementing any interface, then its mandatory to defined all the methord
	public void credit(){
		System.out.println("hsbc credit");
		
	}
	
	
	public void debit(){
		System.out.println("hsbc debit");
		
	}
	
	public void transferMoney(){
		System.out.println("hsbc transfermoney");
		
	}
	
	//seperate mathod of hsbc class
	public void educationLian() {
		System.out.println("HSBCBank educationlon");
	}
	public void carLoan() {
		System.out.println("hsbc carloan");
	}
	//brazil bank methid:: overriding from brazilbank
	public void mutualfund() {
		System.out.println("hsbc---mutal fund");
	}
	
	

}
