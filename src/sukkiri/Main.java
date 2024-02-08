package sukkiri;

public class Main {
		 public static void incArray(int[] array) {
			 for (int i = 0; i < array.length; i ++) {
				 array[i]++;
			 }
		 }
		 
//		 結果をreturnで返しておらず、incArrayではiに1を足す処理のみ。
		 public static void main(String[] args) {
			 int[] array = {1, 2, 3};
			 incArray(array);
			 for (int i : array) {
				 System.out.println(i);
			 }
		 }

	}
