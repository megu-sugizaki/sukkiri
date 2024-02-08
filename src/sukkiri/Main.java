package sukkiri;

public class Main {
	public static double calcTriangleArea(double length, double height) {
		return length * height / 2;
	}
	
	public static double calcCircleArea(double radius, final double PI) {
		return radius * radius * PI;
	}
	
	public static void main(String[] args) {
		double length = 2;
		double height = 3;
		double radius = 2;
		final double PI = 3.14;
		System.out.println("三角形の底辺の長さが" + length + "cm、高さが" + height + "cmの場合、面積は" + calcTriangleArea(length, height) + "㎠");
		System.out.println("円の半径が" + radius + "cmの場合、面積は" + calcCircleArea(radius, PI) + "㎠");
		
	}
	
}
