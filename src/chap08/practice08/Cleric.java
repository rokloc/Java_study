package chap08.practice08;

//8-1.2.3

//聖職者クラス
public class Cleric{
	String	name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	//操作　メソッド　
	public void selfAid() {
		System.out.println(this.name + "は、セルフエイドを唱えた！");
		System.out.println(this.name + "にHPは全回復した");
		this.mp -= 5;
		this.hp = this.MAX_HP;
	}
	
	public int pray(int sec) {
		
		int AmountOfRecovery = new java.util.Random().nextInt(3) + sec;
		if (MAX_MP < mp + AmountOfRecovery) {
			AmountOfRecovery = MAX_MP - mp;
		}
		this.mp += AmountOfRecovery;
		System.out.println("聖職者" + this.name + "は" + sec + "秒祈った");
		System.out.println("聖職者" + this.name + "は" + AmountOfRecovery + "回復した");
		return (AmountOfRecovery);
	}
}



//thisを忘れがち
//API積極的に使うべき