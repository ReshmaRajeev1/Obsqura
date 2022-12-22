package com.obsqura.training.topic27;

public class StaticBlockExample {
	final static int age;
	
	  //Constructor
	   StaticBlockExample(){
	       System.out.println("Constructor is called");
	       System.out.println("Object is created");
	   }
	   
	//Static block
	   static {
	       age=10;
	       System.out.println("Static block");
	       System.out.println("age "+age);
	   }
	 
	   //Instance block
	   {
	       System.out.println("Instance block");
	       System.out.println("Object creation is going to happen");
	   }

	   public static void main(String[] args) {
		   System.out.println("Main method");
	       StaticBlockExample obj = new StaticBlockExample();
	   }

}
