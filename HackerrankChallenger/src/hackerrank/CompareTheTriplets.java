package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CompareTheTriplets {

	public static void main(String[] args) {
		List<Integer> alice = new ArrayList<Integer>();
		List<Integer> bob = new ArrayList<Integer>();
		Random rand = new Random();
		for (int i = 0; i < 5; i++) {
			alice.add(rand.nextInt(10));
			bob.add(rand.nextInt(10));
		}
		System.out.println(compareTriplets(alice, bob));
	}

	public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		List<Integer> result = new ArrayList();
		int alice = 0, bob = 0;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) > b.get(i)) {
				alice++;
			} else if (a.get(i) < b.get(i)) {
				bob++;
			}
		}
		result.add(alice);
		result.add(bob);
		return result;

	}

}
