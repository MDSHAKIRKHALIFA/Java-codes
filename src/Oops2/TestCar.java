package Oops2;

public class TestCar {//has a relationship

	public static void main(String[] args) {
		
		//static polymarphism--compile time polymarphism
		
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafety();
		b.engine();
		System.out.println("\n*******************\n");
		
		CarInharitance c = new CarInharitance();
		c.start();
		c.stop();
		c.refuel();
		
		System.out.println("*************");
		
		CarInharitance c1 = new BMW();//child class object can be referred by parent class reference variable is called dynamic polymolohism or run time polymorphism 
		c1.start();
		c1.stop();
		c1.refuel();
		
		//down casting
		BMW b1=(BMW)new CarInharitance();//Class cast exception
		
		
		
	}

}
