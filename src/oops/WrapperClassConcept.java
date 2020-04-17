package oops;

public class WrapperClassConcept {
	
	

	public static void main(String[] args) {
		
		String x ="100";
		System.out.println(x+20);
		
		int i = Integer.parseInt(x);
		System.out.println(i+10);
		
		String y = "12.34";
		double z =Double.parseDouble(y);
		System.out.println(z+11);
		
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		
		int j =250;
		System.out.println(j+12);
		
		String s = String.valueOf(j);
		System.out.println(s+122);
		
		
	}

}
