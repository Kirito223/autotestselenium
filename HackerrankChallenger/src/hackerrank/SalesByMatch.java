package hackerrank;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SalesByMatch {

	public static void main(String[] args) {
		List data = ReadData.readData("socks.txt");
		System.out.println(sockMerchant(data.size(), data));;

	}

	public static int sockMerchant(int n, List<Integer> ar) {
		Collections.sort(ar);
		Map<Integer, Integer> data = new HashMap<Integer, Integer>();
		int socks = 0;
		int count = 1;
		int element = ar.get(0);
		for (int i = 1; i < ar.size(); i++) {
			if (element == ar.get(i)) {
				count++;
			} else if (element != ar.get(i)) {
				data.put(ar.get(i - 1), count);
				count = 1;
				element = ar.get(i);
			}
			if (i == ar.size() - 1) {
				data.put(ar.get(i), count);
			}
		}
		for (Entry<Integer, Integer> entry : data.entrySet()) {
			socks += Math.floor(entry.getValue()/2);
		}
		return socks;
	}

}
