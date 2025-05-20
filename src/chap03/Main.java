/*3-1
weight == 60
60 < (age1 + age2) * 2
!(age % 2 == 0)
name == '湊'


3-2
 B.C.D.E


//3-3
package chap03;

public class Main {

	public static void main(String[] args) {
		int isHungry = 1;
		String food = "sushi";
		System.out.println("こんにちは");
		if (isHungry == 0) {
			System.out.println("満腹です");
		}else if (isHungry == 1) {
			System.out.println("腹ペコです");
			System.out.println(food + "を食べたい");
		}
		System.out.println("ごちそうさま");
		
	}

}

//3-4 {}
//3-5

package chap03;

public class Main {

	public static void main(String[] args) {
		System.out.print("[メニュー] 1 : 検索 2 : 登録 3 : 削除 4 : 変更");
		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected) {
			case 1 -> {
				System.out.println("検索します");
			}
			case 2 -> {
				System.out.println("登録します");
			}
			case 3 -> {
				System.out.println("削除します");
			}
			case 4 -> {
				System.out.println("変更します");
			}
		}
	}

}
*/
//3-6

package chap03;

public class Main {

	public static void main(String[] args) {
		System.out.print("[数字あてゲーム]");
		int ans = new java.util.Random().nextInt(10);
		for (int i = 0; i < 5; i++) {
			System.out.println("0から9の数字を入力せよ");
			int num = new java.util.Scanner(System.in).nextInt();
			if (num == ans) {
				System.out.println("当たり!");
				break;
			} else
				System.out.println("はずれ～");	
		}
		System.out.println("ゲームを終了します");
	}

}






























