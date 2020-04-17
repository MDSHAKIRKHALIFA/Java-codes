package oops;

public class Encapsulation {
	
	private int getcode;
	
	
	public int getGetcode() {
		return getcode;
	}


	public void setGetcode(int getcode) {
		this.getcode = getcode;
	}


	public String getStudent() {
		return student;
	}


	public void setStudent(String student) {
		this.student = student;
	}


	private String student;
	

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setGetcode(567);
		obj.setStudent("shakir");
		
		System.out.println((obj.getcode )+" "+obj.getStudent());
		

	}

}
