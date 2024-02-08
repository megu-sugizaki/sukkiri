package sukkiri;

public class Main {
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文:" + text);
	}
	
	public static void main(String[] args) {
		email("問い合わせ", "admin@admin", "本日は何時からですか");
	}
}
