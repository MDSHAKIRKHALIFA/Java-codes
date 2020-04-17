package oops;

public class LocalVsGolobalVariables {
	
	//golobal veriable ---class variable
	//whatever variable we creat in between class main is global variables
	
	String name = "Shakir";
	int age= 25;

	public static void main(String[] args) {
		
		//whatever variable we create inside of a method is became local variable for that method 
		int i=10; //local variable for main method
		System.out.println(i);
		LocalVsGolobalVariables obj = new LocalVsGolobalVariables();
		System.out.println(obj.age);
		System.out.println(obj.name);
	}
	public void name() {
		
		int i=15; //local var for sum method
		int j=10;
		
	}

}