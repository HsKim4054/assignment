package chapter09;

public class Ex9_08 {
	static double round(double d, int n) {
		double res = d;
		res = Math.round(d*Math.pow(10,n))/Math.pow(10,n);
		return res;
	}
	public static void main(String[] args) {
		System.out.println(round(3.1415, 1));
		System.out.println(round(3.1415, 2));
		System.out.println(round(3.1415, 3));
		System.out.println(round(3.1415, 4));
		System.out.println(round(3.1415, 5));
	}
}
