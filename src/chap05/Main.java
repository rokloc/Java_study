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
	
	//5-2
	public static void main(String[] args) {
		String[] msg = {"メールの宛先アドレス", "メールのタイトル", "メールの本文"};
		email(msg[0], msg[1], msg[2]);
	}
	
	public static void email(String address, String title, String text) {
		System.out.println(address + "に、以下のメールを送信しました\n"
				+ "件名:" + title + "\n" + "本文:" + text + "\n");
	}

}
