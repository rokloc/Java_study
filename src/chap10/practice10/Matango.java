package chap10.practice10;

//10-1	②、③、⑤
//10-2
/*
 * ア	electronicEquipment
 * イ	smartPhone
 * ウ	vehicle
 * エ	gasolineCar
 * オ	book
 * カ	englishDictionary
 */

//10-3
public class Matango {

	int hp = 50;
	char suffix;
	

	
	public void attack(Hero h) {
		System.out.println("キノコ" + this.suffix + "の攻撃");
		System.out.println("10のダメージ");
		h.hp -= 10;
	}
	
	public Matango(char suffix) {
		this.suffix = suffix;
	}
	
	public Matango() {
		
	}

}
