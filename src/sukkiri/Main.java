package sukkiri;

public class Main{
	public static void main (String[] args) {
		A[] a = new A[2];
		B[] b = new B[2];
		
		a[0] = new A();
		a[1] = new A();
		a[2] = new A();
		
		b[0] = new B();
		b[0] = new B();
		b[0] = new B();
		
		for (A aa : a) {
			System.out.println(a[1]);
		}
	}
}