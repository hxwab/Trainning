package com.javasource.concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Mutex  implements Lock ,java.io.Serializable{
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2787001560276453776L;

	private static  class Sync extends AbstractQueuedSynchronizer{

		/**
		 * 
		 */
		private static final long serialVersionUID = -7273377766157514077L;

		@Override
		protected boolean tryAcquire(int arg) {
			
			assert arg==1;
			
			if(compareAndSetState(0,1)){
				setExclusiveOwnerThread(Thread.currentThread());
				return true;
			}
			return false;
		}

		@Override
		protected boolean tryRelease(int arg) {
			assert arg==1; 
			if(getState()==0)  throw new IllegalMonitorStateException();
			setExclusiveOwnerThread(null);
			setState(0);
			return true;
		}

		

		@Override
		protected boolean isHeldExclusively() {
			
			return getState()==1;
		}
		
		  Condition newCondition() { return new ConditionObject(); }
		
		
	}
	
	
	private final Sync sync = new Sync();

	@Override
	public void lock() {
		sync.acquire(1);
		
	}

	@Override
	public void lockInterruptibly() throws InterruptedException {
		sync.acquireInterruptibly(1);
		
	}

	@Override
	public boolean tryLock() {
	
		return	sync.tryAcquire(1);
	}

	

	@Override
	public void unlock() {
		sync.release(1);
		
	}

	@Override
	public Condition newCondition() {
		return sync.newCondition();
	}

	@Override
	public boolean tryLock(long time, TimeUnit unit)
			throws InterruptedException {
		return sync.tryAcquireNanos(1, unit.toNanos(time));
	}

}
