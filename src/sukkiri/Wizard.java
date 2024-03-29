package sukkiri;

public class Wizard{
	private int hp;
	private int mp;
	private String name;
	private Wand wand;
	
	public int getHp() {
		return this.hp;
	}
	
	h.setHp(h.getHp() + recoverPoint);
	System.out.println(h.getName() + "のHPを" + recoverPoint + "回復した！");
	
	public int getMp() {
		return this.mp;
	}
	
	public void setHp(int hp) {
		if(hp < 0) {this.hp = 0;} else {this.hp = hp;}
	}
	
	public void setMp(int mp) {
		if(mp < 0) {
			throw new IllegalArgumentException("mpが少な過ぎます");
		}
		this.mp = mp;
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name == null) {
			throw new IllegalArgumentException("名前がありません。処理を中断");
		}
		if (name.length() < 3) {
			throw new IllegalArgumentException("名前が短過ぎます。処理を中断");
		}
		this.name = name;
	}
	
	public Wand getWand() {
		return this.wand;
	}
	
	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("杖がありません");
		}
		this.wand = wand;
	}
	
	public void heal (Hero h) {
		int basePoint = 10;
		int recoverPoint = (int)(basePoint * this.getWand().getPower());
		h.setHp(h.getHp()+recoverPoint);
		System.out.println(h.getName()+"のHPを" + recoverPoint + "回復した");
	}
	
}
