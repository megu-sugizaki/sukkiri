package sukkiri;
import java.util.Date;

public class Main{
	public static void main(String argue[]) {
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1600705425827L);
		System.out.println(past);
	}
	}