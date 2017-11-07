package com.asurion.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.apache.commons.lang3.time.DateUtils;

public class FraudCheckAPI_Controller {
	
	public int getIntRandomValue() {
		Random random = new Random();
		int randomInt = random.nextInt();
		return randomInt;
	}

	public String getStringRandomValue() {
		Random random = new Random();
		String randomInt = random.toString();
		return randomInt;
	}

	public String getRandomValue() {
		Random random = new Random();
		int randomInt = random.nextInt(100000);
		return Integer.toString(randomInt);
	}

	public int getRandomPhoneNumber() {
		Random random = new Random();
		int randomInt = random.nextInt(100000000);
		return randomInt;
	}

	public int warranty_price_low() {
		Random random = new Random();
		int randomInt = random.nextInt(10);
		return randomInt;
	}

	public int warranty_price_high() {
		Random random = new Random();
		int randomInt = random.nextInt(100);
		return randomInt;
	}

	public int purchase_price() {
		Random random = new Random();
		int randomInt = random.nextInt(100);
		return randomInt;
	}

	public String getTime() {

		Calendar c = Calendar.getInstance();
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String datetime = dateformat.format(c.getTime());
		return datetime;
		// System.out.println(datetime);

	}

	// =============Abt Utility
	// file==================================================

	private static String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";

	public String generateUUID() {
		return UUID.randomUUID().toString();
	}

	public String getRadomID() {
		// return Long.toString(System.currentTimeMillis()) + (new
		// Random().nextInt(1000)) + (new Random().nextInt(1000));
		return Long.toString(System.nanoTime()) + (new Random().nextInt(1000)) + (new Random().nextInt(1000));
	}

	public String getCurrentDateTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(DATE_FORMAT);
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now);
	}

	public String getUpdatedDate(int days) {
		Date updatedDate = DateUtils.addDays(new Date(), days);
		SimpleDateFormat dtf = new SimpleDateFormat(DATE_FORMAT);
		return dtf.format(updatedDate);
	}

	public String getPreviousDate(int days) {
		Date updatedDate = DateUtils.addDays(new Date(), days);
		SimpleDateFormat dtf = new SimpleDateFormat(DATE_FORMAT);
		return dtf.format(updatedDate);
	}
	
	
	
	


}
