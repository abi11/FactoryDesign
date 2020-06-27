package com.abhi.designpattern.prototypepattern;

public class DemoProto {

	public static void main(String[] args)throws CloneNotSupportedException {

		BookShop bs= new BookShop();
		bs.setShopName("Novelty");
		bs.loadData();
		
		
		
		BookShop bs1= (BookShop)bs.clone();
		bs.getBooks().remove(2);
		
		bs1.setShopName("A-1");
		bs1.loadData();
		
		System.out.println(bs);
		System.out.println(bs1);
	}

}
