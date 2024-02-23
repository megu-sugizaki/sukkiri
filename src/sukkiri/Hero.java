package sukkiri;

public class Hero{
	private int hp;
	String name;
	Sword sword;
	
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "はって回復した");
	}
}
