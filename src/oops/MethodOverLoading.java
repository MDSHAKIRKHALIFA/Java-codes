package oops;

public class MethodOverLoading {

	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		
		obj.name();
		obj.name(0);
		obj.name(1, 2);
	}
	
	public static void main(int k) {
		
	}
	public static void main(double k) {
		
	}
	public static void main(int s, int k) {

	}
	
	//we can overload main method also
	
	// we can not create a method inside of a method
	//duplicate methods--i.e. same method name with same number of arguments are not allowed
	
	
	//method overloading--> when the method name is same with different arguments or input parameters whiting the same class
	public void name() { //0 input program 
		System.out.println("0 input parameter");
		
	}
	public void name(int x) { //1 input program
		System.out.println("1 input parameter");
		System.out.println(x);

	}
	public void name(int x, double b) { //2 input program
		System.out.println("2 input parameter");
		System.out.println(x+b);

	}
	

}
