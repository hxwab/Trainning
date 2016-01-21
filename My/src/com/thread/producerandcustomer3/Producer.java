package com.thread.producerandcustomer3;

public class Producer extends AbsFactory {

	
	public Producer(Factory factory) {
		super(factory);
	}

	@Override
	protected void execute() {
		factory.create();
	}

}
