package sukkiri;
import java.io.FileWriter;
import java.io.IOException;

public class Main{
	public static void main (String[] args) {
		try{
			FileWriter fw = new FileWriter("data.text");
		} catch(IOException e) {
			System.out.println("エラーが発生しました");
		}
	}
}