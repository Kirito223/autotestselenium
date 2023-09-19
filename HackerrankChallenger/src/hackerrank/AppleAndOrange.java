package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class AppleAndOrange {

	public static void main(String[] args) {
		List<Integer> appples = new ArrayList<Integer>();
		List<Integer> oranges = new ArrayList<Integer>();

		appples.add(2);
		appples.add(3);
		appples.add(-4);

		oranges.add(3);
		oranges.add(-2);
		oranges.add(-4);
		countApplesAndOranges(7, 10, 4, 12, appples, oranges);

	}

	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		List<Integer> appleFalls = new ArrayList<Integer>();
		List<Integer> organeFalls = new ArrayList<Integer>();

		for (Integer apple : apples) {
			appleFalls.add(a + apple);
		}

		for (Integer orange : oranges) {
			organeFalls.add(b + orange);
		}

		int appleCount = 0;
		int organeCount = 0;

		for (Integer apple : appleFalls) {
			if (apple >= s && apple <= t) {
				appleCount++;
			}
		}

		for (Integer orange : organeFalls) {
			if (orange >= s && orange <= t) {
				organeCount++;
			}
		}

		System.out.println(appleCount);
		System.out.println(organeCount);

	}

}
