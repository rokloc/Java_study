package chap11.practice;

public class Book extends TangibleAsset{

	  String isbn;

	  // メソッド
	  public String getIsbn() { return this.isbn; }
	  
	  // コンストラクタ
	  public Book(String name, int price, String color, String isbn) {
		  super(name, price, color);
		  this.isbn = isbn;
	  }
	}
