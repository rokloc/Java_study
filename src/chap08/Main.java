package chap08;

public class Main {

	//mainメソッド
	public static void main(String[] args) {
		
		//属性（フィールド）（メンバ）
		Hero h = new Hero();//インスタンス生成
		h.name = "ミナト";
		h.hp = 100;
		System.out.println("勇者" + h.name + "を、生み出しました！");
		
		
		//操作（メソッド）（メンバ）
		h.sit(5);
		h.slip();
		h.sit(25);
		h.run();
	}
}