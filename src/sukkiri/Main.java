package sukkiri;

public class Main{
	public static void main(String argue[]) {
		String s1 = "Java and JavaScript";
		if (s1.contains("Java")) {
			System.out.println("文字列sは、Javaを含んでいます");
		}
		if (s1.endsWith("Java")) {
			System.out.println("文字列s1は。Javaが末尾にあります");
		}
		System.out.println("文字列sでJavaが最初に登場する位置は" + s1.indexOf("Java"));
		System.out.println("文字列sでJavaが最後に登場する位置は" + s1.lastIndexOf("Java"));
	}
}