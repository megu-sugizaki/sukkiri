package sukkiri;

public class Main {
	  public static void main(String[] args) { 
//		  中間試験と、期末試験の点数（それぞれ 0 ～ 100 点）を入力し、次の条件に従って合格、不合格を判定するプログラムを作成しなさい。

//		  両方とも 60 点以上の場合、合格
//		  合計が 130 点以上の場合、合格
//		  合計が 100 点以上で、どちらかの試験が 90 点以上であれば合格
//		  上記以外は不合格
		 int midTerm = 69;
		 int finalTerm = 87;
		 if ((midTerm >= 60 && finalTerm >= 60) || (midTerm + finalTerm >= 130) || ((midTerm + finalTerm >= 100) && ((midTerm >= 90) || (finalTerm >= 90)) )) {
			 System.out.println("合格");
		 } else {
			 System.out.println("不合格");
		 }
	    }
	}
