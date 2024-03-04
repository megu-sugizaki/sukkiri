package sukkiri;
import java.io.FileWriter;

public class Main{
	public static void main (String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("data.text");
			fw.write("hello");
		} catch (Exception e) {
			System.out.println("エラーです");
		}
		fw.close();
	}
}