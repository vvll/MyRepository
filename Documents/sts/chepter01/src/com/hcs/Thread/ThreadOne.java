package com.hcs.Thread;

public class ThreadOne extends Thread {
	private int i;
	//重写run()方法，run()方法的方法体就是线程执行体
	@Override
	public void run() {
	for(;i<100;i++) {
		/**
		 * 当线程类继承Thread类时，直接使用this即可获取当前线程
		 * Thread对象的getName()返回当前线程的名字，可以直接调用getName()方法获取当前线程的名字
		 */
		System.out.println(getName() + "  " + i);	
	}	
	}
	public static void main(String[] args) {
		new ThreadOne().start();
		for(int i = 0; i<100; i++) {
			//调用crrentThread()方法，获取当前线程
			 System.out.println(Thread.currentThread().getName() +" "+ i);
			if(i==20) {
				new ThreadOne().start();
			}
		}

	}

}
