package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElectronicsShop {

	public static void main(String[] args) {
		List<Integer> keyboards = ReadData.readData("keyboards.txt");
		List<Integer> drives = ReadData.readData("drives.txt");
		int[] k = new int[keyboards.size()];
		int[] d = new int[drives.size()];

		for (int i = 0; i < k.length; i++) {
			k[i] = keyboards.get(i);
		}
		for (int i = 0; i < d.length; i++) {
			d[i] =drives.get(i);
		}
		System.out.println(getMoneySpent(k, d, 374625));
	}

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		List<Integer> pricesCanBuy = new ArrayList<Integer>();
		for (int i : keyboards) {
			for (int j : drives) {
				pricesCanBuy.add(i + j);
			}
		}

		Map<Integer, Integer> result = new HashMap<Integer, Integer>();
		for (Integer integer : pricesCanBuy) {
			if (integer <= b) {
				result.put(integer, b - integer);
			}
		}
		if (result.size() > 1) {
			Object firstKey = result.keySet().toArray()[0];
			int min = result.get(firstKey);
			int devices = 0;
			for (Map.Entry<Integer, Integer> pair : result.entrySet()) {
				if (pair.getValue() <= min && pair.getValue() <= b) {
					min = pair.getValue();
					devices = pair.getKey();
				}
			}

			return devices != 0 ? devices : -1;
		} else {
			return pricesCanBuy.get(0) <= b ? pricesCanBuy.get(0) : -1;
		}

	}

}
