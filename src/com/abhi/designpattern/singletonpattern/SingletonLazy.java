package com.abhi.designpattern.singletonpattern;

public class SingletonLazy {

	public static void main(String[] args) {

		A1 obj = A1.getInstance();
		A1 obj2 = A1.getInstance();
	}

}
class A1{
	//public static Abc obj= new Abc();//Eager;
	public static A1 obj;
	int i;
	private A1() {
		System.out.println("Instance created");
	}
	public static A1 getInstance() {
		if(null==obj)
			obj= new A1();
		return obj;
	}
}
