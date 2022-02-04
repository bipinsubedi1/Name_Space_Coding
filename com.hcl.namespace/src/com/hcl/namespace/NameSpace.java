package com.hcl.namespace;

import java.util.Scanner;

public class NameSpace {
	public static void main(String[] args) {
		Scanner nameInput = new Scanner(System.in);
		String fullName, firstName, middleName, lastName;
		int underScore1, underScore2;
		System.out.println("Please enter your full name with _ in between.");
		fullName = nameInput.nextLine();

		underScore1 = fullName.indexOf('_');
		underScore2 = fullName.lastIndexOf('_');
		firstName = fullName.substring(0, underScore1);
		middleName = fullName.substring(underScore1 + 1, underScore2);
		lastName = fullName.substring(underScore2 + 1);

		System.out.println(firstName + ' ' + middleName + ' ' + lastName);
	}
}
