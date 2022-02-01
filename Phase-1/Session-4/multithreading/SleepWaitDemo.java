package com.simplilearn.multithreading;

public class SleepWaitDemo {

	private static Object LOCK = new Object();
	
	public static void main(String[] args) {
		
		try {
			
			//lets put a main thread for sleep
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " is woke up after"
					+ "1 second of sleep");
			
			synchronized (LOCK) {
				LOCK.wait(2000);
				System.out.println("Object is woke up after wait of 2 seconds");
			}
		} catch (InterruptedException e) {
			System.out.println("Error occured "+e);
		}
	}
}
