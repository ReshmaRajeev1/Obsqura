package com.obsqura.training.assignments;

import java.util.Random;
import java.util.UUID;

public class RandomNumber {
	public static void main(String[] args) {
		System.out.println(UUID.randomUUID().toString().replace("-",""));
		Random random = new Random();
		System.out.println(random.nextInt(504582));
		
	}

}
