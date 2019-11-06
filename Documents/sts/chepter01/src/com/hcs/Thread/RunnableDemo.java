package com.hcs.Thread;

public class RunnableDemo implements Runnable {
	private Thread t;
	private String ThreadName;

	public RunnableDemo(String threadName) {
		ThreadName = threadName;
	}

	@Override
	public void run() {
		System.out.println(ThreadName + " running...");
		for (int i = 4; i > 0; i--) {
			System.out.println("Thread:" + ThreadName + " " + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(ThreadName + " exiting...");

	}

	public void start() {
		System.out.println(ThreadName + " starting...");
		if (t == null) {
			t = new Thread(this, ThreadName);
			t.start();
		}
	}

}
