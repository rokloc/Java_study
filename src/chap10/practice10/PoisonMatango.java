package chap10.practice10;

public class PoisonMatango extends Matango {
	
	int attack_count;
	int damageAmount;
	
	//操作
	public void attack(Hero h) {
		super.attack(h);
		
		if(this.attack_count != 0) {	
			System.out.println("さらに毒の胞子をばらまいた！");
			damageAmount = h.hp / 5;
			h.hp -= damageAmount;
			System.out.println(damageAmount + "ポイントのダメージ！");
			this.attack_count--;
		}
	}
	
	
	//コンストラクタ
	public PoisonMatango(char c) {
		super(c);
		attack_count = 5;
	}
}
