package chap11.practice;


public class Computer extends TangibleAsset {

	  String makerName;
	  // メソッド
	  public String getMakerName() { return this.makerName; }
	  
	  // コンストラクタ
	  public Computer(String name, int price, String color, String makerName) {
		  super(name, price, color);//コンストラクタの形が親子で異なるため明記
		  this.makerName = makerName;
	}
}