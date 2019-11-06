package com.hcs.Thread;

public class PriorityTest extends Thread {
	public PriorityTest(String name) {
		super(name);
	}
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(getName() + "其优先级是： " +getPriority()+" 循环变量："+ i);
		}
	}

	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			if(i == 20){
			PriorityTest low = new PriorityTest("低级");
			low.start();
			System.out.println("创建之初的优先级：" +low.getPriority());
			low.setPriority(Thread.MIN_PRIORITY);
			}
			if(i == 50) {
				PriorityTest high = new PriorityTest("高级");
				high.start();
				System.out.println("已建的优先级：" + high.getPriority());
				high.setPriority(MAX_PRIORITY);
			}
		}
		
		
		
	}

}
