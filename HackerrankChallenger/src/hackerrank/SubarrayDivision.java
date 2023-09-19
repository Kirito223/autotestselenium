package hackerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SubarrayDivision {

	public static void main(String[] args) {
		List<Integer> data = new ArrayList<Integer>();
		int[] arrInt = { 4 };
		for (int i : arrInt) {
			data.add(i);
		}
		System.out.println(birthday(data, 4, 1));
	}

	public static int birthday(List<Integer> s, int d, int m) {
		int answer = 0;
		for (int i = 0; i < s.size(); i++) {
			int position = i;
			int sum = 0;
			if((s.size()-i) >=m) {
				for (int j = 0; j < m; j++) {
					
					int element = s.get(position);
					sum += element;
					if (sum == d && j == (m - 1)) {
						answer++;
					}

					if (position < s.size() - 1) {
						position++;
					}
				}
			}
		
		}
		return answer;

	}

}
