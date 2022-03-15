package com.te.assignment;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the num");
	int num = scanner.nextInt();
	if(num%1==0&& num%num==0) {
		System.out.println("num is prime");
	}
	else {
		System.out.println("num is not prime");
	}
}
}
