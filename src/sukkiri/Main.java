package sukkiri;
import java.io.*;

public class Main{
	FileReader fr = new FileReader("data.txt");
	int input = fr.read();
	while (input != -1) {
		System.out.print((char)input);
		input = fr.read();
	}
	fr.close();
}