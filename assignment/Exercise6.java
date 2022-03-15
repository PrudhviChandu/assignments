package com.te.assignment;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size");
		int n = scanner.nextInt();
		for (int i = 1; i <= n; i++) {
			int z = i;
			for (int j = 1; j <= i; j++) {
				System.out.print(z + " ");
				z = z + n - j;
			}
			System.out.println();
		}
	}
}
