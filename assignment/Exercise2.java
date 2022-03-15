//no of days in february in a leap year and non leap year
package com.te.assignment;
import java.util.Scanner;
public class Exercise2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the month");
		String month = scanner.next();
		switch (month) {
		case "february":
			System.out.println("enter the year");
			int year = scanner.nextInt();
			if ((year % 4 == 0) && (year % 400 == 0 || year % 100 != 0)) {
				System.out.println(year + "is a leap year");
				System.out.println("enter no of month");
				int noOfMonth = scanner.nextInt();
				switch (noOfMonth) {
				case 1:
					System.out.println("month is january");
					break;
				case 2:
					System.out.println("month is february");
					break;
				case 3:
					System.out.println("month is march");
					break;
				case 4:
					System.out.println("month is april");
					break;
				case 5:
					System.out.println("month is may");
					break;
				case 6:
					System.out.println("month is june");
					break;
				case 7:
					System.out.println("month is july");
					break;
				case 8:
					System.out.println("month is august");
					break;
				case 9:
					System.out.println("month is september");
					break;
				case 10:
					System.out.println("month is october");
					break;
				case 11:
					System.out.println("month is november");
					break;
				case 12:
					System.out.println("month is december");
					break;
				}
				if ((noOfMonth % 2 != 0 && noOfMonth <= 7) & (noOfMonth != 2)) {
					System.out.println("no of days is 31");
				}
				if ((noOfMonth % 2 == 0 && noOfMonth <= 7) & (noOfMonth != 2)) {
					System.out.println("no of days is 30");
				}
				if (noOfMonth == 2) {
					System.out.println("no of days is 29");
				}
				if ((noOfMonth > 7 && noOfMonth <= 12) & (noOfMonth % 2 != 0)) {
					System.out.println("no of days is 30");
				}
				if ((noOfMonth > 7 && noOfMonth <= 12) & (noOfMonth % 2 == 0)) {
					System.out.println("no of days is 31");
				}
			} else {
				System.out.println(year + "is not a leap year");
				System.out.println("enter no of month");
				int noOfMonth = scanner.nextInt();
				switch (noOfMonth) {
				case 1:
					System.out.println("month is january");
					break;
				case 2:
					System.out.println("month is february");
					break;
				case 3:
					System.out.println("month is march");
					break;
				case 4:
					System.out.println("month is april");
					break;
				case 5:
					System.out.println("month is may");
					break;
				case 6:
					System.out.println("month is june");
					break;
				case 7:
					System.out.println("month is july");
					break;
				case 8:
					System.out.println("month is august");
					break;
				case 9:
					System.out.println("month is september");
					break;
				case 10:
					System.out.println("month is october");
					break;
				case 11:
					System.out.println("month is november");
					break;
				case 12:
					System.out.println("month is december");
					break;
				}
				if ((noOfMonth % 2 != 0 && noOfMonth <= 7) & (noOfMonth != 2)) {
					System.out.println("no of days is 31");
				}
				if ((noOfMonth % 2 != 0 && noOfMonth <= 7) & (noOfMonth != 2)) {
					System.out.println("no of days is 31");
				}
				if ((noOfMonth % 2 == 0 && noOfMonth <= 7) & (noOfMonth != 2)) {
					System.out.println("no of days is 30");
				}
				if (noOfMonth == 2) {
					System.out.println("no of days is 28");
				}
				if ((noOfMonth > 7 && noOfMonth <= 12) & (noOfMonth % 2 != 0)) {
					System.out.println("no of days is 30");
				}
				if ((noOfMonth > 7 && noOfMonth <= 12) & (noOfMonth % 2 == 0)) {
					System.out.println("no of days is 31");
				}
			}
			break;
		}
	}
}
