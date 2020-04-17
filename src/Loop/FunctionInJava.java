package Loop;

public class FunctionInJava {

	public static void main(String[] args) {
		FunctionInJava obJ = new FunctionInJava();
		
		obJ.add();
		obJ.sub();
		int i = obJ.div(30, 3);
		System.out.println("The answer is:"+i);
		
	}
	
	
	public int add() {
		System.out.println("Addition function: ");
		int a=12;
		int b=11;
		System.out.println("The answer is: "+(a+b));
		return 0;
	}
	public double sub() {
		double a=15;
		double b=10;
		System.out.println("sub function: \n");
		System.out.println("The answer is: "+(a-b));
		return 0;
		
		
	}
	public int multi() {
		int a=5;
		int b=5;
		System.out.println("The answer is: "+(a*b));
		return 0;
	}
	
	public int div(int x, int y) {
		System.out.println("\ndivision function: ");
		int d=x/y;
		return d;
	}
	

}
