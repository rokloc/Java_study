package chap10;

public class SuperHero extends Hero {
	boolean flying;
	
	public void flying() {
		this.flying = true;
		System.out.println(this.name + "は、上空に飛んだ");
	}
	public void land() {
		this.flying = false;
		System.out.println(this.name + "は、着地した");
	}
	
	//再定義
	public void attack() {
		System.out.println(this.name + "ものすごい攻撃をした");
		if(this.flying) {
			super.attack();//親インスタンス部分のメソッド呼び出し
		}
	}
	
	
	//コンストラクタ
	public SuperHero(String name, int hp) {
		super(name, hp);
		this.flying = false;
	}
	public SuperHero(String name) {
		super(name);
		this.flying = false;
	}
	public SuperHero(int hp) {
		super(hp);
		this.flying = false;
	}
	public SuperHero() {
		super();
		this.flying = false;
	}
}
