package Array;

public class ArrayConcept {
	public static void main(String[] args) {
		int i[]= new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[2]);
		System.out.println(i[3]);
		
		
		
		System.out.println(i.length);
		
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
			
		}
		
		double d[]= new double[3];
		d[0]=10.10;
		d[1]=20.20;
		d[2]=30.30;
		
		System.out.println(d[2]);
		for (int j = 0; j < d.length; j++) {
			System.out.println(d[j]);
			
		}
		
		char c[] = new char[5];
		
		c[0]='s';
		c[1]='h';
		c[2]='a';
		for (int j = 0; j < c.length; j++) {
		System.out.println(c[j]);	
		}
		
		
		boolean b[]=new boolean[2];
		
		b[0]=true;
		b[1]=false;
		
	}

}
