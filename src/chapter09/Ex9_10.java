package chapter09;

public class Ex9_10 {
	/*
	 (1) format메서드를 작성하시오.
	1. length의 값이 str의 길이보다 작으면 length만큼만 잘라서 반환한다.
	2. 1의 경우가 아니면, length크기의 char배열을 생성하고 공백으로 채운다.
	3. 정렬조건(alignment)의 값에 따라 문자열(str)을 복사할 위치를 결정한다.
	 (System.arraycopy()사용)
	4. 2에서 생성한 char배열을 문자열로 만들어서 반환한다.
	*/
	static String format(String str, int length, int alignment) {
//		String res = "";
//		if(length <str.length()) res = str.substring(0, length);
//		else {
//			char[] carr = new char[length];
//			for(int i=0; i<length; i++) {
//				carr[i] = ' ';
//			}
//			if(alignment == 0) {
//				for(int i=0; i<str.length(); i++) {
//					carr[i] = str.charAt(i);
//				}
//			} 
//			else if (alignment == 1) {
//				int m = (length-str.length())/2;
//				for(int i=m; i<str.length()+m; i++) {
//					carr[i] = str.charAt(i-m);
//				}
//			}
//			else if (alignment == 2) {
//				int a =1;
//				for(int i=length-1;i>=length-str.length();i--) {
//					carr[i] = str.charAt(str.length()-a++);
//				}
//			}
//			for(int i=0;i<carr.length;i++) {
//				res +=carr[i];
//			}
//		}
//		return res;
		
		if(length<str.length()) {
			return str.substring(0,length);
		}
		
		char[] carr = new char[length];
		for(int i=0; i<carr.length; i++) {
			carr[i] = ' ';
		}
		int space = 0;
		if(alignment==0) {}
		else if(alignment==1) {
			space = (length-str.length())/2;
		}
		else if(alignment==2) {
			space = length-str.length();
		}
		System.arraycopy(str.toCharArray(), 0, carr, space, str.length());
		return new String(carr);
	}
	
	public static void main(String[] args) {
		String str = "가나다";
		System.out.println(format(str,7,0)); // 왼쪽 정렬
		System.out.println(format(str,7,1)); // 가운데 정렬
		System.out.println(format(str,7,2)); // 오른쪽 정렬
	}
}
