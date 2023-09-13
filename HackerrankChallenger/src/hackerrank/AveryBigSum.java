package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AveryBigSum {
	public static void main(String[] args) {
		List<Long> data = new ArrayList<Long>();
		for (int i = 0; i < 10; i++) {
			data.add(new Random(10).nextLong());
		}
		System.out.println(aVeryBigSum(data));
	}

	public static long aVeryBigSum(List<Long> ar) {
		long result = 0;
		for (Long item : ar) {
			result += item;
		}
		return result;
	}
}
