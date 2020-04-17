package Array;

import javax.sound.midi.Soundbank;

public class Myarray {
	static double a[]= {10.00, 11.22, 12.33,11.55};

	static int array[]= {1, 2 ,3 ,4 ,5};
	public static void main(String[] args) {
		for (int i = 0; i < array.length; i++) {
			
		System.out.println(array[i]);
	}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		double s[]=new double [3];
		s[0]=10.00;
		s[1]=20.00;
		s[2]=30.00;
		for (int i = 0; i < s.length; i++) {
			System.out.println(" ");
			System.out.println(s[i]);
			
		}
		Object m[]=new Object[7];
		m[0]="Shakir";
		m[1]=25;
		m[2]='m';
		for (int i = 0; i < m.length; i++) {
			System.out.println(m[i]);
			
		}
		

}
}
