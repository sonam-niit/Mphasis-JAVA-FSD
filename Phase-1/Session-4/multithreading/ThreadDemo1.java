package com.simplilearn.multithreading;

public class ThreadDemo1 extends Thread{
	
	public void run()
	{

		System.out.println("Thread Started");
		/* for(int i=1;i<=5;i++)
		{
			System.out.println(i+ " "+Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} */
	}
	
	public static void main(String[] args) {
		ThreadDemo1 t1=new ThreadDemo1();
		ThreadDemo1 t2=new ThreadDemo1();
		
		//t1.setName("first");
		//t2.setName("Second");
		t1.start();
		t2.start();
	}
}
