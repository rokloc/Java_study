package chap04;
/*p154
public class Main {

	public static void main(String[] args) {
		int[] seq = new int[10];
		char[]	base = {'A', 'T', 'G', 'C'};
		
		for (int i = 0; i < seq.length; i++)
			seq[i] = new java.util.Random().nextInt(4);
		
		for (int i = 0; i < seq.length; i++) {
			System.out.print(base[seq[i]] + " ");
		}
		
	}

}
*/

/*
//p156 拡張for文

public class Main {
	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 60};
		for (int value : scores)
			System.out.println(value);
	}
}
*/

//p170 練習問題chap4

//4-1
/*
public class Main {
	public static void main(String[] args) {
		int[]		points = new int[4];		//①
		double[]	weigths = new double[5];	//②
		boolean[]	answers = new boolean[3];	//③
		String[]	names = new String[3];		//④
		
	}
}
*/

//4-2
/*
public class Main {
	public static void main(String[] args) {
		int[]	monnyList = {121902, 8302, 55100};
		
		for(int i = 0; i < monnyList.length; i++)
			System.out.println(monnyList[i]);
		
		for (int value : monnyList)
			System.out.println(value);
	}
}
*/

//4-3
//5行目	NullPointerException
//6行目	ArrayIndexOutOfBoundsException

//4-4
public class Main {
	public static void main(String[] args) {
		int[]	numbers = {3,4,9};
		boolean	hit = false;
		
		System.out.println("1桁の数字を入力して");
		int input = new java.util.Scanner(System.in).nextInt();
		for (int value : numbers) {
			if (value == input) {
				System.out.println("当たり！");
				hit = true;
				break;
			}
		}
		if (!hit)
			System.out.println("ハズレ残念！");
	}
}


































