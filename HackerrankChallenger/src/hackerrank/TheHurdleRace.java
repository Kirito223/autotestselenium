package hackerrank;

import java.util.Collections;
import java.util.List;

public class TheHurdleRace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int hurdleRace(int k, List<Integer> height) {
		Collections.sort(height);
		
		if(k >= height.get(height.size()-1)) {
			return 0;
		}else {
			return height.get(height.size()-1) - k;
		}

	}

}
