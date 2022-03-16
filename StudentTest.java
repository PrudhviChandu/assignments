package com.te.comporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentTest {
	static ArrayList<Student> al = new ArrayList<Student>();

	public static void sortByChoice() {
		Scanner scn = new Scanner(System.in);
		System.out.print("-------------Sort By Choice------------- \nSort By Rollno- 1\nSort By Name - 2\n"
				+ "Sort By Age - 3\nSort By Marks - 4\nsort by address-5\nSelect Sorting Type: ");
		
		switch (scn.nextInt()) {
			case 1:
				Collections.sort(al, new CompareByRollno());
				break;
			case 2:
				Collections.sort(al, new CompareByName());
				break;
			case 3:
				Collections.sort(al, new CompareByAge());
				break;
			case 4:
				Collections.sort(al, new CompareByMarks());
				break;
			case 5:
				Collections.sort(al, new CompareByAddress());
				break;
			default:
				break;
		}

		for (Student sd : al) {
			System.out.println(sd);
		}
		
		System.out.print("Wanna Continue Sorting?(y/n): ");
		String y = "y";
		if(scn.next().equals(y)) {
			sortByChoice();
		}else {
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		al.add(new Student(101, "Mutyala","Bhimavaram", 25, 81));
		al.add(new Student(104, "Prudhvi","Akividu", 24, 71));
		al.add(new Student(102, "Chandu","Undi" ,22, 90));
		al.add(new Student(103, "Ramana","Palakollu", 23, 95));

		System.out.println(al);
		System.out.println("=============================");
		System.out.println("-------------Using foreach(B4-Sorting)-------------");
		for (Student sd : al) {
			System.out.println(sd);
		}
		sortByChoice();
	}
}
