package oops;

public class StaticAndNonStaticConcept {
	
	//global variable ---> the scop of global vaes will ve availabel across all the functions with some conditions 
	//whatever variable we create in between class main is global variables
	
	String name = "Shakir"; //non static global var
	static int age= 25; //static global var

	public static void main(String[] args) {
		//how to call static methods and vars?
		//1.direct calling
		sum()	;
		//whatever variable we create inside of a method is became local variable for that method 
		int i=10; //local variable for main method
		System.out.println(i);
		
		System.out.println(age);//static variable can be called from any static method
		
		//2.calling by classname
		StaticAndNonStaticConcept.sum();
		
		
		//how to call non static methods and vars?
		//>>by create an object we can call non static methods
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();
		System.out.println(obj.age);
		System.out.println(obj.name);
	}
	
	
	public static void sum() {//static method
		System.out.println("sum number");
	}
	public void name() { //non static mehod
		
		System.out.println("hello java");
	}
}