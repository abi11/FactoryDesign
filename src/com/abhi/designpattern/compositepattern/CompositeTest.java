package com.abhi.designpattern.compositepattern;


public class CompositeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Components hd = new Leaf(4000,"hdd");
  Components mouse = new Leaf(2000,"mouse");
  Components moniter = new Leaf(6000,"moniter");
  Components ram = new Leaf(3000,"ram");
  Components cpu = new Leaf(9000,"cpu");
  
  Composite ph= new Composite("Peri");
  Composite cabinet= new Composite("Cabinet");
  Composite mb= new Composite("MB");
  Composite computer= new Composite("Computer");
  
  mb.addComponent(cpu);
  mb.addComponent(ram);
  ph.addComponent(mouse);
  ph.addComponent(moniter);
  cabinet.addComponent(hd);
  cabinet.addComponent(mb);
  computer.addComponent(ph);
  computer.addComponent(cabinet);
  ram.showPrice();
  ph.showPrice();
  computer.showPrice();
	}

}
