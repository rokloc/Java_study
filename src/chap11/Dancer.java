package chap11;

public class Dancer extends Character {
	
	public void dance() {
		System.out.println(this.name + "は、踊った！");
	}
	
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵に10ポイントのダメージ！");
		m.hp -= 10;
	}

}
