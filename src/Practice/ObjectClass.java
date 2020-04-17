package Practice;

public class ObjectClass {
	
	String shakir;
	String md;
	int toll;
	double money;

	public static void main(String[] args) {
		
		ObjectClass msk = new ObjectClass();
		
		System.out.println(" ");
		
		msk.shakir="Shakir is not so good";
		System.out.println(msk.shakir);
		
		msk.md="Today";
		System.out.println(msk.md);

		msk.toll =20;
		System.out.println(msk.toll);
		
		msk.money=19.34;
		System.out.println(msk.money);
		
	}
}