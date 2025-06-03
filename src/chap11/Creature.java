package chap11;

public interface Creature {
	
	double PI = 3.141592;//自動的にpublic static finalがつく
	
	//操作　メソッドはすべて抽象メソッド
	void run(); //public abstractを省略する
}
