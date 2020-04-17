package Array;

import java.io.UTFDataFormatException;
import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		h.put("A", "Test");
		h.put("B", "AUTOMATION");
		h.put("C", "Java");
		System.out.println(h.size());
		System.out.println(h);
		
		
		h.put(1, 23);
		h.put(2, 29);
		System.out.println(h.size());
		
		System.out.println(h.get(2));
		System.out.println(h.get("C"));
		
		h.put(3, "tom");
		
		
		Hashtable<Integer, Integer> h1 = new Hashtable<Integer, Integer>();
		h1.put(1, 222);
		
		Hashtable<Integer, String> h2 = new Hashtable<Integer, String>();
		
		h2.put(1, "Shakir");
		
		
		
	}

}
