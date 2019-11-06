package com.hcs.Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class ThreadThree{

	public static void main(String[] args) {
		//创建对象
		ThreadThree tr = new ThreadThree();
		//使用FutureTask来包装Callable对象
		FutureTask<Integer> task = new FutureTask<Integer>(new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				int i =0;
				for(;i<100;i++) {
					System.out.println(Thread.currentThread().getName() + " " + i);
				}
				return i;
			}});
		for(int i = 0;i<100;i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
			new Thread(task,"返回值线程").start();
		}
		try {
			int tsk =task.get();
			System.out.println("返回值："+tsk);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	

}
