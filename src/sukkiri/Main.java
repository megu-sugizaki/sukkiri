package sukkiri;

public class Main{
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero();
		h.name = "ミナト";
		h.hp = 100;
//		ここにsを代入しているのがいまいちわからない。→h.swordというのは、Swordの新しいインスタンスを作っている。そのSwordの名前は炎の剣。
//		今のままだとSwordはあるけれどhに紐づいていない状態。hのために新しくSwordを生んだ。
		h.sword = s;
		System.out.println("現在の武器は" + h.sword.name);
		System.out.println(h.name + "は" + h.sword.name + "で攻撃した");
		
		Hero h1 = new Hero();
		h1.name = "ミナト";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "アサカ";
		h2.hp = 100;
		Wizard w = new Wizard();
		w.name = "スガワラ";
		w.hp = 50;
		
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		
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