package com.abhi.designpattern.observerPattern;

public interface Subject {

	void subscribe(Subscriber sub);

	void unSubscribe(Observer sub);

	void notifySubscriber();

	void upload(String title);

}