package com.test;

/**
 * 作者：administrator
 * 时间：2019年6月20日 下午5:44:20
 * 说明：
 */
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class testCallableLambda {

	public static void main(String[] args) {
		// 先使用Lambda表达式创建Callable<Integer>对象，
		// 并使用FutureTask来包装Callable对象
		FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>) () -> {
			int i = 0;
			for (; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + "====" + i);
			}
			// call()方法可以有返回值
			return i;
		});
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + "====" + i);
			if (i == 5) {
				Thread t1 = new Thread(task, "有返回值的线程");
				t1.start();
			}
		}
		try {
			System.out.println("子线程的返回值：" + task.get());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}