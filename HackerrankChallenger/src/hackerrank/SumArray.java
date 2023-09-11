package hackerrank;

import java.util.List;

public class SumArray {
	public static void main(String[] args) {
		int[] array = { 10, 65, 90 };
		System.out.println(sum(array));
	}

	private static int sum(int[] array) {
		int total = 0;
		for (Integer number : array) {
			total += number;
		}
		return total;
	}
}
