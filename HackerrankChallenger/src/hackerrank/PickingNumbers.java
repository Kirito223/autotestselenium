package hackerrank;

import java.util.List;

public class PickingNumbers {

	public static void main(String[] args) {
		List<Integer> data = ReadData.readData("pickingnumber.txt");
		System.out.println(pickingNumbers(data));
	}

	public static int pickingNumbers(List<Integer> a) {
		int r = 0;
		int[] countArray = new int[101];

		for (int i = 0; i < a.size(); i++) {
			countArray[a.get(i)]++;
		}
		for (int i = 1; i <= 100; i++) {
			int currentCount = countArray[i] + countArray[i - 1];
			if (currentCount > r) {
				r = currentCount;
			}
		}
		return r;

	}

}
