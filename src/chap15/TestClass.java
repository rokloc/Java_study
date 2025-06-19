package chap15;

public class TestClass {
	//
	
	
	//メソッド
	public static String ConcatenationString(String folder, String file) {
		StringBuilder s = new StringBuilder();
		if (folder.endsWith("\\")) {
			s.append(folder).append(file);
		}else {
			s.append(folder).append("\\").append(file);
		}
		
		
		return (s.toString());
	}
}
