package sukkiri;

public class Main{
	public static void main(String[] args) {
		Hero h1;
		h1 = new Hero();
		h1.hp = 100;
		Hero h2;
		h2 = h1;
		h2.hp = 200;
		System.out.println(h1.hp);
		
		
//		Matango m1 = new Matango();
//		m1.hp = 50;
//		m1.suffix = 'A';
//		
//		Matango m2 = new Matango();
//		m2.hp = 48;
//		m2.suffix = 'B';
//		
//		h.slip();
//		m1.run();
//		m2.run();
//		h.run();
	}
}