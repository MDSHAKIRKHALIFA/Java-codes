package Array;

public class Myarray2d {

	public static void main(String[] args) {

		int a[][] = new int[1][5];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[0][3]=5;
		a[0][4]=9;
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[0].length; j++) {
				System.out.println(a[i][j]);

			}

		}
	}
}
