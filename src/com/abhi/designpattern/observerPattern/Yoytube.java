package com.abhi.designpattern.observerPattern;

public class Yoytube {

	public static void main(String[] args) {

		 Channel  tele= new Channel();
		 
		 Subscriber s1=new Subscriber("Akshay");
		 Subscriber s2=new Subscriber("Sonam");
		 Subscriber s3=new Subscriber("Harsh");
		 Subscriber s4=new Subscriber("Kuran");
		 Subscriber s5=new Subscriber("Praveen");
		 
		 tele.subscribe(s1);
		 tele.subscribe(s2);
		 tele.subscribe(s3);
		 tele.subscribe(s4);
		 tele.subscribe(s5);
		 
		 tele.unSubscribe(s3);
		 s1.subscribeChannel(tele);
		 s2.subscribeChannel(tele);
		 s3.subscribeChannel(tele);
		 s4.subscribeChannel(tele);
		 s5.subscribeChannel(tele);
		 
		 tele.upload("Learn how to think");
	}

}
