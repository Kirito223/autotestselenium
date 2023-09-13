package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		List<Integer> data = new ArrayList<Integer>();
		data.add(3);
		data.add(2);
		data.add(1);
		data.add(3);
		System.out.println(birthdayCakeCandles(data));
	}

	public static int birthdayCakeCandles(List<Integer> candles) {
		Collections.sort(candles);
		int max = candles.get(candles.size() - 1);
		int count = 0;
		for (int i = candles.size() - 1; i >= 0; i--) {
			if (candles.get(i) == max) {
				count++;
			} else {
				break;
			}
		}
		
		
		return count;

	}

}
