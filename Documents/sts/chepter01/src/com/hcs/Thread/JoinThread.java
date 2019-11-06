package com.hcs.Thread;

public class JoinThread extends Thread{
	public JoinThread(String name) {
		super(name);
	}
	

	@Override
	public void run() {
		for(int i =0;i<100;i++) {
			System.out.println(getName() + " " + i);
		}
	}

	public static void main(String[] args) throws Exception {
		//启动子线程
		new JoinThread("新线程").start();
		for(int i = 0;i<100;i++) {
			if(i==20) {
				JoinThread jt = new JoinThread("被join的线程");
				jt.start();
				//main线程调用了jt的join方法()方法，main线程
				//必须等jt执行结束才会向下执行
				jt.join();
				JoinThread jt2 = new JoinThread("线程二");
				jt2.start();
				jt2.join();
			}
			System.out.println(Thread.currentThread().getName() + " " +i);
		}

	}

}
