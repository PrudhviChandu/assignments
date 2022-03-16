package com.te.comporator;

public class Student {
int rollNo;
String name;
String address;
int age;
int marks;
public Student(int rollNo, String name, String address, int age, int marks) {
	this.rollNo = rollNo;
	this.name = name;
	this.address = address;
	this.age = age;
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", Name=" + name + ", Address=" + address + ", age=" + age + ", marks=" + marks
			+ "]";
}

}
