package chap11;

public abstract class Character {
	
	//属性
	String name;
	int hp;
	
	//操作
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
	}
	
	public abstract void attack(Matango m);//抽象メソッド（詳細不明）

}



//抽象メソッドを使うと、詳細不明として明示している事になる
//抽象メソッドを含むクラス宣言にはメソッド同様abstractを付ける
