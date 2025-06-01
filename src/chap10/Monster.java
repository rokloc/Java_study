package chap10;

public class Monster {
	
	//属性　フィールド
	String name;
	int hp;
	
	//操作　メソッド
	public void attack() {
		System.out.println(this.name + "は、攻撃した");
	}
	
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
	
	
	//コンストラクタ 宣言時に1回実行
	public Monster(String name, int hp) {
		this.name = name;
		this.hp = hp;
		System.out.println(this.name + "が、現れた。HPは" + this.hp);
	}
	public Monster(String name) {
		this(name, 100);
	}
	public Monster(int hp) {
		this("汎用兵器", hp);
	}
	public Monster() {
		this("汎用兵器", 100);
	}
	
	
}
