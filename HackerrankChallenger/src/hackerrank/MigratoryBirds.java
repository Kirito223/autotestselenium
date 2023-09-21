package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

	public static void main(String[] args) {
		List<Integer> data = ReadData.readData("./data/bird.txt");
		System.out.println(migratoryBirds(data));
	}

	public static int migratoryBirds(List<Integer> arr) {
		int bird = 0;
		Map<Integer, Integer> data = new HashMap<Integer, Integer>();
		Collections.sort(arr);

		int count = 1;
		int element = arr.get(0);
		for (int i = 1; i < arr.size(); i++) {
			if (i == arr.size() - 1) {
				int b = 8;
			}
			if (arr.get(i) == element) {
				count++;
			} else if ((arr.get(i) != element)) {
				data.put(arr.get(i - 1), count);
				element = arr.get(i);
				count = 1;
			}
			if (i == arr.size() - 1) {
				data.put(arr.get(i), count);
			}

		}
//
		int max = data.get(arr.get(0));
		for (Map.Entry<Integer, Integer> entry : data.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				bird = entry.getKey();
				System.out.println("Bird: "+ bird+" max: "+ max);;
			}
		}
		return bird;

	}

}
