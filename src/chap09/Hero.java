package chap09;

public class Hero {

	//属性
	String name;
	int hp;
	
	//操作
	public void Attack() {
		System.out.println(this.name + "は、攻撃した！");
	}
	
	
	//コンストラクタ
	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
		System.out.println("勇者" + this.name + "が誕生した！");
		System.out.println("HPは" + this.hp);
	}
	
	public Hero(String name) {
		this(name, 100);
	}
	
	public Hero(int hp) {
		this("ヨシヒコ", hp);
	}
	
	public Hero() {
		this("ヨシヒコ", 100);
	}


}
