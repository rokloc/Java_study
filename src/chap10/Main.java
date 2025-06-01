package chap10;

public class Main {


	public static void main(String[] args) {
		Hero h1 = new Hero("ロト", 500);
		Hero h2 = new Hero();
		Monster m1 = new Monster("スライム", 10);
		Monster m2 = new Monster("ギガンテス", 500);
		
		h1.attack();
		h2.attack();
		m2.attack();
		
		SuperHero h3 = new SuperHero("ピーマン");
		h3.attack();
		h3.flying();
		h3.attack();
		
	}

}
