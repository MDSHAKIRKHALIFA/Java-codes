package oops;

import java.awt.CardLayout;

public class ObjectCar {
	
	String model;
	int year;
	String color;
	String type;

	public static void main(String[] args) {
		ObjectCar a = new ObjectCar();
		ObjectCar b = new ObjectCar();
		ObjectCar c = new ObjectCar();
		
		
		
		a.model="Toyota";
		a.year=2019;
		a.color="Black";
		a.type="Suv";
		System.out.println(" ");
		System.out.println(a.model+a.year+a.color+a.type);
		
		a=b;
		b=c;
		c=a;
		
		a.model="Bmw";
		System.out.println(a.model);
	}

}
