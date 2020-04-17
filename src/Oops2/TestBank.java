package Oops2;

import javax.swing.text.AbstractDocument.BranchElement;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println(USBank.min_bal);
		
		HSBCBank b = new HSBCBank();
		
		b.credit();
		b.debit();
		b.transferMoney();
		b.educationLian();
		b.carLoan();
		
		//dynamic polymarphism
		//child class object can be referred by parent interface reference var
		
		USBank hr = new HSBCBank();
		
		hr.credit();
		hr.debit();
		hr.transferMoney();
		
		//only over written 

	}

}
