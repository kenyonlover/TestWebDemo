package com.test;
/**
 * 作者：administrator
 * 时间：2019年5月14日 下午3:25:50
 * 说明：
 */
public class GetCPUNum {

	public static void main(String[] args) {
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		System.out.println(availableProcessors);
	}

}
