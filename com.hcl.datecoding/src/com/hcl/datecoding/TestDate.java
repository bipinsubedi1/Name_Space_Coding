package com.hcl.datecoding;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
	public static void main(String[] args) {
		//String month, date, year;
		Date thisDate = new Date();
		SimpleDateFormat dateForm = new SimpleDateFormat("MM/DD/YYYY");
		System.out.println(dateForm.format(thisDate));

		// int slash1, slash2;
		int slash1 = dateForm.format(thisDate).indexOf('/');
		int slash2 = dateForm.format(thisDate).lastIndexOf('/');
		String month = dateForm.format(thisDate).substring(0, slash1);
		String date = dateForm.format(thisDate).substring(slash1 + 1, slash2);
		String year = dateForm.format(thisDate).substring(slash2 + 1);

		System.out.println("Month: " + month);
		System.out.println("Date: " + date);
		System.out.println("Year: " + year);
	}
}
