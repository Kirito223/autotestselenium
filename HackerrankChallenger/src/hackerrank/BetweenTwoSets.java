package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {

	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();

		a.add(2);
		a.add(6);

		b.add(24);
		b.add(36);

	}

	public static int findLCM(int a, int b) {
		return (a * b) / findGCD(a, b);
	}

	public static int findLCM(List<Integer> arr) {
		if (arr.size() == 0) {
			return 0;
		}

		int gcd = arr.get(0);

		for (int i = 1; i < arr.size(); i++) {
			gcd = findLCM(gcd, arr.get(i));
		}
		return gcd;
	}

	public static int findGCD(List<Integer> arr) {
		if (arr.size() == 0) {
			return 0;
		}

		int gcd = arr.get(0);

		for (int i = 1; i < arr.size(); i++) {
			gcd = findGCD(gcd, arr.get(i));
		}
		return gcd;
	}

	public static int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		int gcdB = findGCD(b);// UCLN
		int lcmA = findLCM(a);// BCNN

		List<Integer> result = new ArrayList<>();

		for (int x = lcmA; x <= gcdB; x += lcmA) {
			if (gcdB % x == 0) {
				result.add(x);
			}
		}
		return result.size();

	}

}
