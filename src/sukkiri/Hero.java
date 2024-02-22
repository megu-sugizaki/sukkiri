package sukkiri;

public class Hero extends Character {
	public void attack(Matango m) {
		System.out.println(this.name + "の攻撃");
		System.out.println("敵に10ポイントのダメージを与えた");
		m.hp -= 10;
	}
	
	public void attack(Goblin g) {
		System.out.println("敵に10ポイントのダメージを与えた！");
		g.hp -= 10;
	}
}
