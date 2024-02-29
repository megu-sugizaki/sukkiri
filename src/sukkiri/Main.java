package sukkiri;

public class Main{
	public static void main(String argue[]) {
		String s = "abc,def:ghi";
		String w = s.replaceAll("[beh]", "X");
		System.out.println(w);
		}
	}