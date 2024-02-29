package sukkiri;

public class Main{
	public static void main(String argue[]) {
		String s = "abc,def:ghi";
		String[] words = s.split("[,:]");
		for (String w : words) {
			System.out.print(w + "->");
		}
	}
}