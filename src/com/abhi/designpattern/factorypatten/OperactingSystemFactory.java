package com.abhi.designpattern.factorypatten;

public class OperactingSystemFactory {

	public OS getInstance(String str) {
		if(str.equals("IOS")) {
			return new IOS();
		}else if(str.equals("Android")) {
			return new Android();
		}else
			return new Windows();
	}
}
