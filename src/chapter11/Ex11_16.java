package chapter11;

public class Ex11_16 {

	public static void main(String[] args) {
		
		String data1 = "123,456,789.5";
		System.out.println("data:"+data1);
		data1 = data1.replace(",", "");
		double data2 = Double.parseDouble(data1);
		int data3 = (int)(Math.round(data2));
		System.out.println("반올림:"+data3);
		StringBuffer data4 = new StringBuffer(""+data3);
		int l = data4.length();
		while(true) {
			l -=4;
			if(l<=0) break;
			data4.insert(l,",");
		}
		System.out.println("만단위:"+data4);
		
	}

}
