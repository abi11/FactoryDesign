package com.abhi.designpattern.observerPattern;

public class Subscriber implements Observer {

	private String name;
	private Channel channel = new Channel();
	
	@Override
	public void update() {
		System.out.println("Hey !" + name +", Video updated " + channel.title);
	}

	public Subscriber(String name, Channel channel) {
		super();
		this.name = name;
		this.channel = channel;
	}

	public Subscriber(String name) {
		super();
		this.name = name;
	}
	
@Override
public void subscribeChannel(Channel ch) {
	channel=ch;
}
}
