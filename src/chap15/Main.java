package chap15;

public class Main {

	public static void main(String[] args) {
		
		//文字列変換p530
		//大文字を小文字　toLowerCase()
		String s1 = "Hello";
		System.out.println(s1.toLowerCase());

		//小文字を大文字　toUpperCase()
		s1 = "Hello";
		System.out.println(s1.toUpperCase());
		
		//前後の空白除去　trim()
		s1 = " Hello      ";
		System.out.println(s1.trim());
		
		//文字列置き換え　replace(String before, String after)
		s1 = "HelloWorld";
		System.out.println(s1.replace("World", "Nippon"));
	}

}
