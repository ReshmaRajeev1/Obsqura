package com.obsqura.training.topic29;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowExample {
	 void checkAge(int age){
			if(age<18)
			   throw new ArithmeticException("Not Eligible for voting");
			else
			   System.out.println("Eligible for voting");
		   }
		   public static void main(String[] args){
			   ThrowExample obj = new ThrowExample();
			obj.checkAge(13);
			System.out.println("End Of Program");
		   }

}
