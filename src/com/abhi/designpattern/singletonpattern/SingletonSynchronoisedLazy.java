package com.abhi.designpattern.singletonpattern;

public class SingletonSynchronoisedLazy {

	public static void main(String[] args) {
Thread t1 = new Thread(new Runnable() {
	
	@Override
	public void run() {
		Abc obj = Abc.getInstance();
		
	}
});
		
Thread t2 = new Thread(new Runnable() {
	
	@Override
	public void run() {
		Abc obj = Abc.getInstance();
		
	}
});

t1.start();
t2.start();
	}

}
class Abc{
	public static Abc obj;
	int i;
	private Abc() {
		System.out.println("Instance created");
	}
//	public static synchronized Abc getInstance() {
//		if(null==obj)
//			obj= new Abc();
//		return obj;
//	}
	
	public static  Abc getInstance() {// double checked Locking
			if(null==obj) {
				synchronized(Abc.class) {
					if(null==obj)
						obj= new Abc();
				 }
			}
		return obj;
	}
	
	//Enum ->= 1.5
}
