package com.abhi.designpattern.factorypatten;
public class FactoryMain {

	public static void main(String[] args) {

//		OS obj = new Android();
//		obj.spec();
		OperactingSystemFactory osf = new OperactingSystemFactory();
		OS obj =osf.getInstance("IOS");
		obj.spec();
	}

}
