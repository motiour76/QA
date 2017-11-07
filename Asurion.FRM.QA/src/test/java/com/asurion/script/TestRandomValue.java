package com.asurion.script;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

import org.apache.commons.lang3.time.DateUtils;

public class TestRandomValue {

	public static void main(String[] args) {
		
		
		System.out.println("Creat a Random Phone number : " +getRandomPhoneNumber());
	    //System.out.println("Price shows in 10 : " +warranty_price_low());
		//System.out.println("This will create String value : " +getStringRandomValue());
		//System.out.println("This cretae a Random value : " +getIntRandomValue());
		//System.out.println("Create Today date : " +getTime());
		System.out.println("Create Previous date : " +getPreviousDate(3));


	}

	
	public static  String getPreviousDate(int days) {
		
	 String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";

		Date updatedDate = DateUtils.addDays(new Date(), days);
		SimpleDateFormat dtf = new SimpleDateFormat(DATE_FORMAT);
		return dtf.format(updatedDate);
	}
	
	public static String getTime() {

		Calendar c = Calendar.getInstance();
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String datetime = dateformat.format(c.getTime());
		return datetime;
		// System.out.println(datetime);

	}
	public static int getRandomPhoneNumber() {
		Random random = new Random();
		int randomInt = random.nextInt(100000000);
		return randomInt;
	}

	
	public static int getIntRandomValue() {
		Random random = new Random();
		int randomInt = random.nextInt();
		return randomInt;
	}
	public static  String getStringRandomValue() {
		Random random = new Random();
		String randomInt = random.toString();
		return randomInt;
	}
	public static int warranty_price_low() {
		Random random = new Random();
		int randomInt = random.nextInt(10);
		return randomInt;
	}

}
