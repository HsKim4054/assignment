package chapter09;

public class Ex9_09 {
	static String delChar(String src, String delCh) {
		String res = new String(src);
		for (int i = 0; i < delCh.length(); i++) {
			res = res.replace(String.valueOf(delCh.charAt(i)), "");
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
		System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
	}

}
