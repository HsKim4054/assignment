package chapter06;

public class Ex6_22 {

	static boolean isNumber(String st) {
		boolean flag = true;
		if(st == null || st == "") {
			return false;
		}
		for(int i=0; i<st.length(); i++) {
			if(st.charAt(i) >= '0' && st.charAt(i) <='9')
				flag = true;
			else {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		str = "1234o";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
	}

}
