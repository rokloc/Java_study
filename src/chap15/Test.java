package chap15;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

//15-1
public class Test {

	public static void main(String[] args) {
		//15-1 練習問題
		StringBuilder s = new StringBuilder();
		s.append("1,");
		for(int i = 2; i <= 100; i++) {
			s.append(i + ",");
		}
		System.out.println(s.toString());
		
		String[] a = s.toString().split(",");
		for (String b : a) {
			System.out.println(b);
		}
		
		//15-2
		String folder1 = "c\\javadef";
		String folder2 = "c\\user\\";
		String file = "readme.txt";
		
		System.out.println(TestClass.ConcatenationString(folder1, file));
		System.out.println(TestClass.ConcatenationString(folder2, file));
		
		//15-4
		//①
		Date d = new Date();
		//②
		Calendar c = Calendar.getInstance();
		c.setTime(d);
		//③
		int day = c.get(Calendar.DAY_OF_MONTH);
		//④
		c.set(Calendar.DAY_OF_MONTH, day + 100);
		//⑤
		Date d2 = c.getTime();
		//⑥
		SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(f.format(d2));
		
		//15-5 TimeAPI
		LocalDate now = LocalDate.now();
		LocalDate future = now.plusDays(100);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		System.out.println(future.format(fmt));
	}

}

//15-3
/*
(1)すべての文字列	「.*」
(2)最初A、2文字目数字、3文字目数字か無し	「A\d{1,2}」
(3)最初U、2～4文字目は英大文字「U[A-Z]{3}」



*/