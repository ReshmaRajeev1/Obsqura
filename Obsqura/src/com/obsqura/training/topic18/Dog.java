package com.obsqura.training.topic18;

public class Dog {
	Dog(){
	Animal animal = new Animal(this);
	animal.displayAnimal();
	}
	public static void main(String[] args) {
		Dog dogObj = new Dog ();
	}

}
