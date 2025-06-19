package chap16;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		//ArrayList p576
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("tanaka");
		names.add("suzuki");
		names.add("saito");
		
		for (String array : names) {
			System.out.println(array);
		}		
		
		//ラッパークラス
		ArrayList<Integer> points = new ArrayList<Integer>();
		
		points.add(95);
		points.add(100);
		points.add(98);
		
		for(int i : points) {
			System.out.println(i);
		}
		ArrayList<Boolean> judge = new ArrayList<Boolean>();
		
		judge.add(true);
		judge.add(false);
		judge.add(true);
		
		for(boolean b : judge) {
			System.out.println(b);
		}
		
		
	}

}
