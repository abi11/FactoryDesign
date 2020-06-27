package com.abhi.designpattern.singletonpattern;

public class Singleton {

	public static void main(String[] args) {

		A obj = A.getInstance();
		A obj2 = A.getInstance();
	}

}
class A{
	static A obj= new A();
	private A() {
		
	}
	public static A getInstance() {
		return obj;
	}
}
