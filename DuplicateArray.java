package week1day2;

public class DuplicateArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int len =arr.length;
		for (int i = 0; i < len-1; i++) {
			for (int j = i+1; j < len; j++) {
				if (arr[i]==arr[j]) {
					System.out.println(+arr[i]);
				}
			}
		}
	}
}