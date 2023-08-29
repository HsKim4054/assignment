package chapter09;

public class Ex9_12 {
	
	static int getRand(int from, int to) {
		int a = from;
		int b= to;
		if(from>to) {
			int temp = a;
			a = b;
			b= temp;
		}
		int res = (int)(Math.random()*(b-a+1))+a;
		
		return res;
	}
	
	public static void main(String[] args)
	{
	for(int i=0; i< 20; i++)
	System.out.print(getRand(1,-3)+",");
	}
}