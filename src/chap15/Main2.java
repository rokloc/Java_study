package chap15;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main2 {
	public static void main(String[] args) {
		//TimeAPI
		
		//Instantクラス　ナノ単位の時間 UTC時間
		Instant i = Instant.now();
		System.out.println(i);
		
		//ZonedDateTimeクラス
		ZonedDateTime z1 = ZonedDateTime.now();
		System.out.println(z1);
		ZonedDateTime z2 = ZonedDateTime.now(ZoneId.of("Europe/London"));
		System.out.println(z2);
		
		// 明示的に日時を指定して生成
        ZonedDateTime custom = ZonedDateTime.of(2025, 6, 19, 10, 0, 0, 0, ZoneId.of("Europe/London"));
        System.out.println("ロンドン: " + custom);
        
        //あいまいな時間
        LocalDateTime l = LocalDateTime.now();
        System.out.println("現在: " + l);
        
        //時間や期間を表すクラス
	}
	
}
