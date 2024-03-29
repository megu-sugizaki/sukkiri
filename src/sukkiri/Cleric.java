package sukkiri;

public class Cleric {
	
	String name ;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	public void selfAid() {
		System.out.println("セルフエイドを唱えた");
		this.hp = this.MAX_HP;
		this.mp -= 5;
		System.out.println("HPが最大まで回復した");
	}
	
	public int pray(int sec) {
		
		System.out.println(this.name + "は、" + sec + "秒天に祈った");
		
		int recover = new java.util.Random().nextInt(3) + sec;
		int recoverActual = Math.min(this.MAX_MP - this.mp, recover);
		this.mp += recoverActual;
		
		System.out.println("MPが" + recoverActual + "回復した");
		return recoverActual;
	}
}

// mp = 5, 1秒祈ってmpが3増えたとすると、mp = 8, 10 - 5 = 5, recover = 3 minの中身は(5, 3)で小さい方3をとる mpは 8.
// mp = 5, 4秒祈ってmpが6増えたとすると、mp = 11, 10 - 5 = 5, recover = 6 minの中身は(5, 6)で小さい方5をとる mpは 10.
//　mpとMAXMPの差以上のrecoverをしてしまうことはできない
