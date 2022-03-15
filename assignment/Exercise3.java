//differentiate b/w static,non static and local variables
package com.te.assignment;

public class Exercise3 {
int a=10;
static int b=20;
public void test1() {
	int c=50;//local variable cant be used only inside the scope of method
	System.out.println(c+"=>local variable");

}
public void test2() {  //non static method can call both static and non static variables
	System.out.println(a+"=>instance or non static variable");
	System.out.println(b+"=>static variable");
}
public static void test3() {
	//System.out.println(a); static method cannot call non static variable.Even if it is there one non static variable make the method as non static
	System.out.println(b+"=>static variable");
}
public static void main(String[] args) {
	Exercise3 exercise3=new Exercise3();
	exercise3.test1();
	exercise3.test2();
	test3();
	//System.out.println(c);
}
}
