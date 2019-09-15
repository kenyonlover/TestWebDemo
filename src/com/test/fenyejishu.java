package com.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 作者：administrator
 * 时间：2019年6月11日 下午3:05:38
 * 说明：
 */
public class fenyejishu {
	public static void main(String[] args) {
		/*
		 * int a = 1728; long b = Math.round(a * 1.00 / 100); System.out.println(b);
		 * 
		 * BigDecimal setScale = new BigDecimal(a * 1.00 /
		 * 100).setScale(0,RoundingMode.UP); System.out.println(setScale);
		 * 
		 * int x = 194; int y = 8; int ceil = (int) Math.ceil(x * 1.00 / y);
		 * System.out.println(ceil); for (int i = 0; i < ceil; i++) { for (int j = 0; j
		 * < y; j++) { if(i*y+j < x) System.out.println(i*y+j); }
		 * System.out.println("===================="); }
		 */
		Map map = new HashMap();
		map.size();
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < 194; i++) {
			list.add(""+i);
		}
		
		int size = list.size();
		int length = 8;
		int xhcs = (int) Math.ceil(size * 1.00 / length);
		for (int i = 1; i <= xhcs; i++) {
			List<String> listDetail = list.subList((i-1)*length, i*length<size?i*length:size);
			System.out.println(listDetail);
		}
	}
}
