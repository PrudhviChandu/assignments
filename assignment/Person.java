package com.te.assignment;

public class Person {
	int id;
	String name;
		Person(int id,String name){
		this.id=id;
		this.name=name;
		}
		
public static void main(String[] args) {
	Person person=new Person(100,"chandu") ;
	System.out.println(person);
}
}
