package com.obsqura.training.assignments;

public class CreditCardCustomer extends Customer {
	public static void main(String[] argv) {
		Customer brad = new CreditCardCustomer();
		brad.customerId = "12122";
		//System.out.print(brad.getCustomerId());
	}

	String getCustomerId() {
		return customerId;
	}
}
