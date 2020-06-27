package com.abhi.designpattern.builderpattern;

public class Shop {
	public static void main(String []args) {
		
		//Phone p= new Phone("Android",2,"Qualcom",5.5,3100);
	Phone p= new PhoneBuilder().setOs("Android").setRam(2).setProcessor("Qualcomm").getPhone();
	System.out.println(p);
	}

}
