package sukkiri;

public class Main {
		 public static void hello(String name) {
			 System.out.println("こんにちは" + name);
		 }
		 
		 public static void main(String[] args) {
			 System.out.println("メソッドを呼び出します");
			 hello("湊");
			 hello("朝香");
			 hello("菅原");
			 System.out.println("システムの呼び出しが終わりました");
		 }
	}
