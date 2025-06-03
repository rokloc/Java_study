package chap11.practice;

public abstract class TangibleAsset extends Asset implements Thing {
	
	  String color;
	  double weight;
	  
	  //メソッド
	  public String getColor() {
		  return this.color;
	  }
	  public double getWeight() {
		  return this.weight; 
	  }
	  public void setWeight(double weight) {
		  this.weight = weight;
	  }
	  
	  //コンストラクタ
	  public TangibleAsset(String name, int price, String color, double weight) {
		  super(name, price);
		  this.color = color;
		  this.weight = weight;
	  }
}


//11-2 ア:Asset　イ:IntangibleAsset　ウ:Patent
//11-3	
//11-4