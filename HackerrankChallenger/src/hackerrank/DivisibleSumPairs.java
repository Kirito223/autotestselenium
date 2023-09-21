package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DivisibleSumPairs {

	public static void main(String[] args) {
		int[] tmp = { 1, 3, 2, 6, 1, 2 };
		List<Integer> data = new ArrayList<Integer>();
		for (Integer integer : tmp) {
			data.add(integer);
		}
		System.out.println(divisibleSumPairs(tmp.length, 3, data));

	}

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

		int count = 0;
		for (int i = 0; i < ar.size(); i++) {
			for (int j = i + 1; j < ar.size(); j++) {
				if ((ar.get(i) + ar.get(j)) % k == 0) {
					count++;
				}
			}
		}

		return count;

	}

}
