package com.api.qa;

import java.util.Random;

public class PriceFunctionCheck {

public static void main(String[] args) {
		

		warranty_price_high();

	}
	
	public static void warranty_price_high() {
		Random random = new Random();
		int randomInt = random.nextInt(300);
		System.out.println(randomInt);
	}


}
