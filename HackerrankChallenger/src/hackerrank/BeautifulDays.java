package hackerrank;

public class BeautifulDays {

	public static void main(String[] args) {
		System.out.println("Day: " + beautifulDays(1, 2000000, 23047885));

	}

	public static int beautifulDays(int i, int j, int k) {
		int count = 0;

		for (int n = i; n <= j; n++) {
			String original = Integer.toString(n);
			String reversed = new StringBuilder(original).reverse().toString();

			int diff = Math.abs(n - Integer.parseInt(reversed));

			if (diff % k == 0) {
				count++;
			}
		}

		return count;

	}

}
