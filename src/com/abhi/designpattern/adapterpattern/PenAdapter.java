package com.abhi.designpattern.adapterpattern;

import com.abhi.designpattern.adapterpatternhelper.PilotPen;

public class PenAdapter implements Pen {
	
	PilotPen pp= new PilotPen();

	@Override
	public  void write(String str) {
		pp.mark(str);
	}

}
