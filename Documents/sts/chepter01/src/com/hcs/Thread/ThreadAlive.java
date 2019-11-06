package com.hcs.Thread;

public class ThreadAlive extends Thread{
	
	@Override
	public void run() {
		for(int i = 0;i < 100;i++) {
			printMsg();
		}
	}
	
	public void printMsg() {
		 Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("name:"+name);
	}

	public static void main(String[] args) {
		ThreadAlive ta = new ThreadAlive();
		ta.setName("Thread");
		System.out.println("开启线程前：" + ta.isAlive());
		ta.start();
		System.out.println("开启线程后：" + ta.isAlive());
		for(int i = 0;i<10;i++) {
			ta.printMsg();
		}
		System.out.println("主线程结束后："+ta.isAlive());
	}

}
