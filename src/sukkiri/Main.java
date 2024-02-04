package sukkiri;

public class Main {
	  public static void main(String[] args) { 
//		  整数値を入力し、以下の４つの分類から該当するものを表示するプログラムを作成しなさい。“正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”※ 	負の数であっても、2 で割り切れれば偶数、そうでなければ奇数とする※ 	0 は“正の偶数”であるとする。
		 int x = 5;
		  if (x >= 0 && x % 2 == 0) {
			  System.out.println("正の偶数");
		  } else if (x >= 0 && x % 2 == 1){
			  System.out.println("正の奇数");
		  } else if (x < 0 && x % 2 == 0) {
			  System.out.println("負の偶数");
		  } else if (x < 0 && x % 2 == 1) {
			  System.out.println("負の奇数");
		  }
		  
	    }
	}
