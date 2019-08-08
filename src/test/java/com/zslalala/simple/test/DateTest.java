package com.zslalala.simple.test;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

public class DateTest {

	@Test
	public void test() {
		String format = "yyyyMMdd";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		String nowDate = LocalDateTime.now().format(formatter);
		System.out.println(nowDate);
		int random = (int)((Math.random()*9+1)*100000);
		String randomstr = Integer.toString(random);
		System.out.println(randomstr);
	}
	

}
