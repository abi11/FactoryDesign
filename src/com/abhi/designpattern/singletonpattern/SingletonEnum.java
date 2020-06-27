package com.abhi.designpattern.singletonpattern;

public class SingletonEnum {

	public static void main(String[] args) {
		Bcd obj1= Bcd.INSTANCE;
		obj1.i=5;
		obj1.show();
		
		Bcd obj2= Bcd.INSTANCE;
		obj2.i=6;
		obj2.show();
	}
}

enum Bcd// special Type of class
{
	INSTANCE;
	int i;
	public void show() {
		System.out.println(i);
	}
}