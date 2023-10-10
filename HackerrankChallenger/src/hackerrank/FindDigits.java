package hackerrank;

public class FindDigits {
	public static void main(String[] args) {
		System.out.println(findDigits(124));
	}

	public static int findDigits(int n) {
		String nstr = String.valueOf(n);
		int count = 0;
		for (int i = 0; i < nstr.length(); i++) {
			int t = Integer.parseInt(String.valueOf(nstr.charAt(i)));
			if (t != 0) {
				if (n % t == 0) {
					count++;
				}
			}
		}
		return count;

	}
}
