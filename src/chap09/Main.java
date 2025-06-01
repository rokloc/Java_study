package chap09;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("ロト", 500);
		Hero h2 = new Hero();
		Monster m1 = new Monster("スライム", 10);
		Monster m2 = new Monster("ギガンテス", 500);
		
		h1.Attack();
		h2.Attack();
		m2.Attack();
	}

}
