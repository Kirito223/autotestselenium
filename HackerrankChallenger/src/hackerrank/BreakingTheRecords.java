package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class BreakingTheRecords {

	public static void main(String[] args) {
//		int[] tmp = { 10, 5, 20, 20, 4, 5, 2, 25, 1 };
		int[] tmp = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
		List<Integer> data = new ArrayList<Integer>();
		for (int i : tmp) {
			data.add(i);
		}
		List<Integer> table = breakingRecords(data);
		for (Integer integer : table) {
			System.out.println(integer);
		}
	}

	public static List<Integer> breakingRecords(List<Integer> scores) {
		List<Integer> highestScore = new ArrayList<Integer>();
		List<Integer> lowestScore = new ArrayList<Integer>();
		List<Integer> result = new ArrayList<Integer>();

		highestScore.add(scores.get(0));
		lowestScore.add(scores.get(0));

		for (int i = 1; i < scores.size(); i++) {
			int score = scores.get(i);
			if (score >= highestScore.get(i - 1)) {
				highestScore.add(score);
				lowestScore.add(lowestScore.get(i - 1));
			} else if (score < highestScore.get(i - 1)) {
				highestScore.add(highestScore.get(i - 1));
				if(score > lowestScore.get(i-1)) {
					lowestScore.add(lowestScore.get(i-1));
				}else {
					lowestScore.add(score);
				}
			}
		}
		int highCount = 0;
		int lowCount = 0;
		
		int highScore = highestScore.get(0);
		int lowScore = lowestScore.get(0);
		
		for (int i = 0; i < highestScore.size(); i++) {
			if(highestScore.get(i)> highScore) {
				highScore = highestScore.get(i);
				highCount++;
			}
			if(lowestScore.get(i)< lowScore) {
				lowScore = lowestScore.get(i);
				lowCount++;
			}
		}
		
		result.add(highCount);
		result.add(lowCount);
		return result;

	}

}
