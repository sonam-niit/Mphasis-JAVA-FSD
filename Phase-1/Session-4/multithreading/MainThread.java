package com.simplilearn.multithreading;

public class MainThread implements Runnable{

	public static int count=0;
	
	public void run()
	{
		while(MainThread.count<=10)
		{
			try {
				
				System.out.println("My Thread "+ (++MainThread.count));
				Thread.sleep(1000);
				
			} catch (Exception e) {
				System.out.println("Error Occured "+e);
			}
		}
	}
	
	public static void main(String[] args) {
		MainThread  ins=new MainThread();
		Thread mythread=new Thread(ins);
		mythread.start();
		
		while(MainThread.count<=10)
		{
			try {
				
				System.out.println("Main Thread "+ (++MainThread.count));
				Thread.sleep(1000);
				
			} catch (Exception e) {
				System.out.println("Error Occured "+e);
			}
		}
		
		System.out.println("Main thread completed");
	}
}
