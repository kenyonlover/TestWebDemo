package com.test;

/**
 * 作者：administrator 时间：2019年6月12日 下午10:18:53 说明：
 */
public class test2 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Object o1 = true ? new Integer(1) : new Double(2.0);
		Object o2;
		if (true) {
			o2 = new Integer(1);
		} else {
			o2 = new Double(2.0);
		}
		System.out.print(o1);
		System.out.print(" ");
		System.out.print(o2);
		
		String info = "推送数据到资金系统成功。";
		System.out.println(info);
		System.out.println(info.substring(0, info.length()-1) + "！");
	}

}
