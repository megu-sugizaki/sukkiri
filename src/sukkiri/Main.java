package sukkiri;

public class Main{
	public static void main(String argue[]) {
		Hero.setRandomMoney();
		System.out.println(Hero.money);
		Hero h1 = new Hero();
		System.out.println(h1.money);
	}
}