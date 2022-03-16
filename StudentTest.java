package com.te.comporator.noduplicates;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class StudentTest {
	public static void main(String[] args) {
		boolean flag = true;
		HashSet<Student> hashset = new HashSet<Student>();
		hashset.add(new Student(1, "Mutyala", "Bhimavaram", 80, 15));
		hashset.add(new Student(2, "Prudhvi", "Akividu", 90, 13));
		hashset.add(new Student(3, "Chandu", "Undi", 65, 16));
		hashset.add(new Student(3, "Chandu", "Undi", 65, 16));
		hashset.add(new Student(4, "Deepthi", "Palakollu", 67, 17));
		hashset.add(new Student(5, "Ramana", "Tpg", 68, 18));
	
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter 1 to sort by Rollno");
			System.out.println("Enter 2 to sort by Name");
			System.out.println("Enter 3 to sort by Address");
			System.out.println("Enter 4 to sort by Marks");
			System.out.println("Enter 5 to sort by Age");
			int z = scanner.nextInt();
			ArrayList<Student> arrayList =new ArrayList<Student>(hashset);
			switch (z) {
			case 1:
				Collections.sort(arrayList, new CompareByRollno());
				for (Student student : arrayList) {
					System.out.println(student);
				}
				break;

			case 2:
				Collections.sort(arrayList, new CompareByName());
				for (Student student1 : arrayList) {
					System.out.println(student1);
				}
				break;

			case 3:
				Collections.sort(arrayList, new CompareByAddress());
				for (Student student2 : arrayList) {
					System.out.println(student2);
				}
				break;

			case 4:
				Collections.sort(arrayList, new CompareByMarks());
				for (Student student3 : arrayList) {
					System.out.println(student3);
				}
				break;

			case 5:
				Collections.sort(arrayList, new CompareByAge());
				for (Student student4 : arrayList) {
					System.out.println(student4);
				}
				break;
			default:
				System.out.println("Error!!! : Please enter a value between 1 to 5 ");
				continue;
			}
			Scanner sc1 = new Scanner(System.in);
			System.out.println();
			System.out.println("If you wish to continue, type YES");
			System.out.println("If you wish to quit, type NO");
			String str = sc1.next();
			if (str.equalsIgnoreCase("yes")) {
				flag = true;
			} else if (str.equalsIgnoreCase("no")) {
				flag = false;
				System.out.println("Program Terminated. Thank you");
			} else {
				System.out.println("Error!!! : Please type only YES or NO ");
			}
		} while (flag);
	}
}

