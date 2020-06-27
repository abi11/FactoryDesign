package com.abhi.designpattern.observerPattern;

public interface Observer {

	void update();

	void subscribeChannel(Channel ch);

}