package com.test;

import java.math.BigDecimal;

/**
 * 作者：administrator
 * 时间：2019年4月15日 下午2:26:56
 * 说明：
 */
public class TestBigDecimal {
	public static void main(String[] args) {
		BigDecimal big = new BigDecimal("764716347");
		System.out.println(big);
		String A = big.toString();
		System.out.println(A);
	}
}
