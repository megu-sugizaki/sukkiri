package sukkiri;

public class PoisonMatango extends Matango{
	
	int attackCount;
	
	public PoisonMatango() {
		super('A');
	}
	
	public void poisonAttack(Hero h) {
		super.attack(h);
		for (int i = 5; i > 0; i --) {
				if(i > 0) {
				i = this.attackCount;
				System.out.println("さらに毒の胞子をばらまいた");
				int damagePoint = h.hp -= hp/0.2;
				System.out.println(damagePoint + "ポイントのダメージ");
			}
		}
	}
}
