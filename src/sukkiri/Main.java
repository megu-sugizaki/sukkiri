package sukkiri;
import java.io.FileWriter;

public class Main{
	public static void main (String[] args) {
		FileWriter fw = new FileWriter("data.text");
		try {
			fw.write("hello");
		} catch (Exception e) {
			System.out.println("何らかの例外が発生しました");
		} finally {
			fw.close();
		}
	}
}