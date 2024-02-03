package sukkiri;

public class Main {
	  public static void main(String[] args) { 
		  System.out.println("【数当てゲーム】");
		  int ans = new java.util.Random().nextInt(10);
		  for(int num = 0; num < 6; num++) {
			  System.out.print("0~9までの数字を入力してください");
			  num = new java.util.Scanner(System.in).nextInt();
			  if(num == ans) {
				  System.out.println("アタリ!");
				  break;
			  } else {
				  System.out.println("違います");
			  }
		  }
		  System.out.println("ゲームを終了します");
	    }
	}
