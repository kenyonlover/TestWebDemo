package com.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作者：administrator
 * 时间：2019年3月15日 下午5:41:40
 * 说明：
 */
public class test {

	public static void main(String[] args) {
		int compare_date = compare_date("2019-05-10 10:46:17", "2019-05-10 12:42:17");
		System.out.println(compare_date);
	}
	
	public static int compare_date(String DATE1, String DATE2) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			Date dt1 = df.parse(DATE1);
			Date dt2 = df.parse(DATE2);
			System.out.println(dt1);
			System.out.println(dt2);
			System.out.println(dt1.getTime());
			System.out.println(dt2.getTime());
			if (dt1.getTime() > dt2.getTime()) {
				return 1;
			} else if (dt1.getTime() < dt2.getTime()) {
				return -1;
			} else {
				return 0;
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return 0;
	}

}
