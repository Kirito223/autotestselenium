package hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DiagonalDifference {

	public static void main(String[] args) {
		List<List<Integer>> matrix = new ArrayList<List<Integer>>();
		for (int i = 0; i < 3; i++) {
			List<Integer> data = new ArrayList<Integer>();
			for (int j = 0; j < 3; j++) {
				data.add(new Random().nextInt(10));
			}
			matrix.add(data);
		}
		System.out.println(diagonalDifference(matrix));
		;

	}

	public static int diagonalDifference(List<List<Integer>> arr) {

		int left = 0;
		int right = 0;
		for (int i = 0; i < arr.size(); i++) {
			left += arr.get(i).get(i);
		}
		for (int i = 0; i < arr.size(); i++) {
			right += arr.get(i).get(arr.size() - 1 - i);
		}

		return Math.abs(left - right);

	}

}
