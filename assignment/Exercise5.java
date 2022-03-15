package com.te.assignment;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size");
		int size = scanner.nextInt();
		for (int r = 1; r <= size; r++) {

			for (int s = 1; s <= size - r; s++) {
				

				System.out.print(" ");
			}
			for (int c = 1; c <= r; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
}
