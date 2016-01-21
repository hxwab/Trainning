package com.thread.producerandcustomer4;

public class Customer extends AbsFactory {

	public Customer(Factory factory) {
		super(factory);
	}

	@Override
	protected void execute() {
		factory.consume();
	}

}
