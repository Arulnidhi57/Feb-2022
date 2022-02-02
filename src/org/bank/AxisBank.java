package org.bank;

import org.omg.CORBA.Current;

public class AxisBank {
	public void saving() {
		System.out.println("In my savings account i have one lakh rupees");
	}

	public void fixed() {
		System.out.println("Minimum amount for fixed deposit id RS.50,000/-");
	}

	public void current() {
		System.out.println("I have no current account");
	}
}
