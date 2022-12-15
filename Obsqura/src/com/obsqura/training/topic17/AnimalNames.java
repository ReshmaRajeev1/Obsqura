package com.obsqura.training.topic17;

public class AnimalNames {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder("Cat");

		builder = new StringBuilder("Cow");// Cat will be modified as Cow
		System.out.println(builder);

		StringBuilder builder1 = new StringBuilder();

		builder1 = new StringBuilder("Dog");

		StringBuilder builder2 = new StringBuilder(30);
		builder2 = new StringBuilder("Fox");
		System.out.println(builder2.capacity());
		System.out.println(builder2.length());

		System.out.println(builder + ", " + builder1 + " " + builder2);

	}

}
