package chap15;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
		
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
		
		//文字列連結p531
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			sb.append("Java").append("Script");
		}
		System.out.println(sb.toString());	//StringBuilder内部にtoStringオーバーライドが記述されている
		
		
		
		//パターンマッチングp539
		//①通常の文字
		s1 = "Java";
		System.out.println(s1.matches("Java") ? "合致" : "合致せず");
		System.out.println(s1.matches("java") ? "合致" : "合致せず");
		
		//②ピリオド (任意の一文字)
		System.out.println(s1.matches("J..a") ? "合致" : "合致せず");
		
		//③直前の文字の0回以上の繰り返し
		s1 = "abbbbbbbbb";
		System.out.println(s1.matches("ab*") ? "合致" : "合致せず");
		
		//④波カッコ　指定回数繰り返し
		System.out.println("aaa".matches("a{3}"));	
		
		//⑤角カッコ　いずれかの文字[] 
		s1 = "abf";
		System.out.println(s1.matches("ab[jusdf]") ? "合致" : "合致せず");
		
		//⑥角カッコ　指定範囲のいずれかの文字[-] 
		s1 = "abf";
		System.out.println(s1.matches("ab[a-z]") ? "合致" : "合致せず");
		
		//⑦ハット、ダラー　先頭^と末尾$
		s1 = "abbe";
		System.out.println(s1.matches("^a.*e$") ? "合致" : "合致せず");
		
		//15-4-3 p542
		
		//splitメソッド
		s1 = "abc,def:ghi";
		String[] str = s1.split("[,:]");
		for(String s : str) {
			System.out.print(s + "->");
		}
		System.out.println("");
		
		//replaceAllメソッド	文字列置換
		s1 = "abc,def:ghi";
		String str2 = s1.replaceAll("[def]", "n");
		System.out.println(str2);
		
		//文字列の書式整形　% 修飾子　桁　型
			//修飾子（省略可）　「,」3桁ごとにカンマをいれる　「0」空き領域0埋め　「-」左寄せ　「+」符号強制表示
			//桁　　（省略可）	n.mなら全体n桁、小数点以下,m桁表示
			//型	（必須）	「d」整数	「s」文字列		「f」小数		「b」真偽値
		Hero hero = new Hero();
	    hero.name = "minato";
	    hero.job = "hero";
	    hero.gold = 280;
		final String FORMAT = "%-9s %-13s 所持金%,6d";
		String s = String.format(FORMAT, hero.getName(), hero.getJob(), hero.getGold());
		System.out.println(s);
		
		//書式指定して文字列表示 書式文字列, パラメータ
		System.out.printf("製造番号%s-% 2d", "SJV", 3);
		System.out.println("");
		
		//日付と時刻
		
		//形式1　long型の数値
		
		//形式2  Date型のインスタンスjava.util.Dateクラス	最も利用されている
		Date d1 = new Date();
		System.out.println(d1.toString());//下と同じ　Dateクラス内でtoStringがオーバーライドされているため
		System.out.println(d1);
		System.out.println(d1.getTime());
		Date d2 = new Date();
		System.out.println(d2.getTime() - d1.getTime());
		
		//Calenderクラス(抽象クラス)
		Calendar c  = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println(year + "年" + month + "月" + day + "日" + hour + "時" + minute + "分" + second + "秒");
		
		//フォーマット
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		Date d3 = f.parse("2023/09/18 05:53:20");
		System.out.println(d3);
		Date now = new Date();
		String fs = f.format(now);
		System.out.println(fs);
		
		//DateクラスやCalendarクラスは機能的に使用があまり推奨されていない
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
