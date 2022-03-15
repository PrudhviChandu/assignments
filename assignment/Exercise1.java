//no of days in february in a leap year and non leap year
package com.te.assignment;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the month");
		String month = scanner.next();
		System.out.println("enter the year");
		int year = scanner.nextInt();
		switch (month) {
		case "february":

			if ((year % 4 == 0) && (year % 400 == 0 || year % 100 != 0)) {

				System.out.println("no of days in february is 29");
			} else {

				System.out.println("no of days in february is 28");

			}

			break;
		case "january":
			System.out.println("no of days in january is 31");
			break;
		case "march":
			System.out.println("no of days in march is 31");
			break;
		case "april":
			System.out.println("no of days in april is 30");
			break;
		case "may":
			System.out.println("no of days in may is 31");
			break;
		case "june":
			System.out.println("no of days in june is 30");
			break;
		case "july":
			System.out.println("no of days in july is 31");
			break;
		case "august":
			System.out.println("no of days in august is 31");
			break;
		case "september":
			System.out.println("no of days in september is 30");
			break;
		case "october":
			System.out.println("no of days in october is 31");
			break;
		case "november":
			System.out.println("no of days in november is 30");
			break;
		case "december":
			System.out.println("no of days in december is 31");
			break;
		default:
			System.out.println("invalid input");
		}
		if ((year % 4 == 0) && (year % 400 == 0 || year % 100 != 0)) {
			System.out.println(year + "is a leap year");
		} else {
			System.out.println(year + "is not a leap year");
		}

	}

}
