package chapter06;

public class Ex6_20 {
	static int[] shuffle (int[] arr) {
		int[] ret = new int[arr.length];
		System.arraycopy(arr, 0, ret, 0, arr.length);
		for(int i=0;i<100;i++) {
			int idx1 = (int)(Math.random()*arr.length);
			int idx2 = (int)(Math.random()*arr.length);
			int temp = ret[idx1];
			ret[idx1] = ret[idx2];
			ret[idx2] = temp;
		}
		return ret;
	}
	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(original));
		System.out.println(java.util.Arrays.toString(result));
	}

}
