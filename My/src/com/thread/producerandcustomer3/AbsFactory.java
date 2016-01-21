package com.thread.producerandcustomer3;

public abstract class AbsFactory implements Runnable {

	
	protected  Factory factory =null;
	
	public AbsFactory(Factory factory) {
		this.factory =factory;
	}
	
	abstract  protected void execute();
	
	@Override
	public void run() {

		while(true){
			execute();
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	
}
