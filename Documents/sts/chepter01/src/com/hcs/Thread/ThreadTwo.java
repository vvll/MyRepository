package com.hcs.Thread;

public class ThreadTwo implements Runnable{

	@Override
	public void run() {
		for(int i = 0;i<100;i++) {
			//要调用Thread的currentThread()方法获取当前线程 
			System.out.println(Thread.currentThread().getName() +"："+ i);
		}
		
	}
	public static void main(String[] args) {
		ThreadTwo tt =  new ThreadTwo();
		ThreadTwo tt2 =  new ThreadTwo();
		new Thread(tt,"线程一").start();
		new Thread(tt2,"线程二").start();
		for(int i = 0 ; i < 100;i++) {
		System.out.println(Thread.currentThread().getName() + " "+i);
		}
	}


}
