package Array;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add(100);//1
		ar.add(200);//2
		ar.add(300);//3
		
		System.out.println(ar.size());
		
		ar.add(400);//4
		ar.add(500);//5
		System.out.println(ar.size());
		
		ar.add("shakir");//6
		ar.add("Md");
		ar.add(12.33);
		ar.add(12);
		ar.add('s');
		
		System.out.println(ar.size());
		
		ar.remove(9);
		System.out.println(ar.size());//after removed 9th elements

		
		System.out.println(ar.get(5));
		System.out.println(ar.get(3));
		
		
		//to print all values of an array or arraylist we need a for loop
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
			
		}
		
		ArrayList<Integer> ar1= new ArrayList();
		
		ar1.add(123);
		ar1.add(234);
		ar1.add(345);
		
		for (int i = 0; i < ar1.size(); i++) {
			System.out.println(ar1.get(i));
			
		}
		
		ArrayList<String> ar2 = new ArrayList();
		ar2.add("Shakir");
		ar2.add("Md");
		
		System.out.println(ar2.get(0));
		
		
		
		
		
		
	}

}
