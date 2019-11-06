package com.hcs.Thread;

public class InvokeRun extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) {
		for(int i = 0;i<100;i++ ) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		InvokeRun r1 =  new InvokeRun();
		r1.setName("线程一");
		r1.start();
		//9new InvokeRun().start();
//		new InvokeRun().start();
		//new InvokeRun().run();
	}

}
