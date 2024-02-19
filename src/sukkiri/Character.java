package sukkiri;

public abstract class Character {
	String name;
	int hp;
	
	public void Run() {
		System.out.println(this.name + "は逃げ出した");
	}
	
	public abstract void attack(Matango m) ;
}
