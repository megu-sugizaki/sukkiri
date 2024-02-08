package sukkiri;

public class Main {
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文:" + text);
	}
	
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
	}
	
	public static void main(String[] args) {
		email("問い合わせ", "admin@admin", "本日は何時からですか");
		System.out.println("-------------------------------");
		email("address@address", "集合場所を教えてください");
	}
}
