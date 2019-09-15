package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 作者：administrator 时间：2019年4月24日 下午3:31:07 说明：
 */
public class TestDate {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		int compareWithNow = compareWithNow("2020-01","2019-11");
		System.out.println(compareWithNow);
	}

	/**
	 * 比较时间与当前时间距离几个月
	 *
	 * @param dateStr 传入时间字符串，格式yyyyMMddHHmmss
	 * @return
	 * @throws ParseException
	 */
	private static int compareWithNow(String date1, String date2) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		Calendar afferent = Calendar.getInstance();
		Calendar now = Calendar.getInstance();

		afferent.setTime(sdf.parse(date1));
		now.setTime(sdf.parse(date2));

		int year = (now.get(Calendar.YEAR) - afferent.get(Calendar.YEAR)) * 12;
		int month = now.get(Calendar.MONTH) - afferent.get(Calendar.MONTH);
		return Math.abs(year + month);
	}
}
