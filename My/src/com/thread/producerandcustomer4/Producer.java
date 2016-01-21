package com.thread.producerandcustomer4;

public class Producer extends AbsFactory {

	
	public Producer(Factory factory) {
		super(factory);
	}

	@Override
	protected void execute() {
		factory.create();
	}

}
