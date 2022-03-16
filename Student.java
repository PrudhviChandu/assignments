package com.te.comporator.noduplicates;

import java.util.Objects;

public class Student {
@Override
	public int hashCode() {
		return Objects.hash(rollNo,name,address,age,marks);
	}
	@Override
	public boolean equals(Object obj) {
		Student other = (Student) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (marks != other.marks)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}
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
