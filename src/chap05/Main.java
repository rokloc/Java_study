package chap05;

public class Main {
	/*
	//5-1
	public static void main(String[] args) {
		introduceOneself();
	}
	
	public static void introduceOneself() {
		String	name = "湊雄介";
		int		age = 22;
		double	height = 169.9;
		char	EarthlyBranches = '辰';
		
		System.out.println("私の名前は" + name + "です。歳は" + age + "歳です。身長は" 
				+ height + "cmです。十二支は" + EarthlyBranches + "です。");
	}
	*/
	
	//5-2.5-3
	public static void main(String[] args) {
		//email("メールの宛先アドレス", "メールのタイトル", "メールの本文");//5-2
		//email("メールの宛先アドレス" , "メールの本文");					//5-3
		//5-4
		//三角形の面積
		System.out.println("三角形の面積求めるよ！まず三角形の底辺の値入力よろ！(単位 : cm)");
		double bottom = new java.util.Scanner(System.in).nextDouble();
		System.out.println("次に三角形の高さの値の入力よろ！(単位 : cm)");
		double height = new java.util.Scanner(System.in).nextDouble();
		double calcTriangleArea = calcTriangleArea(bottom, height);
		System.out.println("三角形の面積は" + calcTriangleArea + "平方cmだね！\n");
		
		//円の面積
		System.out.println("次に円の面積求めるよ！円の半径の値入力よろ！(単位 : cm)");
		double radius = new java.util.Scanner(System.in).nextDouble();

		double circleArea = calcCircleArea(radius);
		System.out.println("その円の面積は" + circleArea + "平方cmだね！\n");
		
	}
	//5-2
	public static void email(String address, String title, String text) {
		System.out.println(address + "に、以下のメールを送信しました\n"
				+ "件名:" + title + "\n" + "本文:" + text + "\n");
	}
	//5-3
	public static void email(String address, String text){
		System.out.println(address + "に、以下のメールを送信しました\n"
				+ "件名 : 無題\n"
				+ "本文 : " + text + "\n");
	}
	
	//5-4
	public static double calcTriangleArea(double bottom, double height) {
		return (bottom * height / 2);
	}
	public static double calcCircleArea(double radius) {
		return (radius * radius * 3.14);
	}
	
	
	

	
}
