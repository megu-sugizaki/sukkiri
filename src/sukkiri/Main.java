package sukkiri;

public class Main {
	public static void introduceOneself(String name, int age, double height, char zodiac) {
		
		
		System.out.println("名前は" + name + "です");
		System.out.println("歳は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("干支は" + zodiac + "です");
	}
	
	public static void main (String[] args) {		
		introduceOneself("めぐ", 29, 154, '戌');
	}
}
