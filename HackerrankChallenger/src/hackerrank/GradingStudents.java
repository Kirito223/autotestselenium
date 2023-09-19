package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class GradingStudents {

	public static void main(String[] args) {
		List<Integer> data = new ArrayList<Integer>();
		data.add(73);
		data.add(67);
		data.add(38);
		data.add(33);
		List<Integer> rs = gradingStudents(data);
		for (Integer integer : rs) {
			System.out.println(integer);
		}
	}

	public static List<Integer> gradingStudents(List<Integer> grades) {
		int n = grades.size();
		for (int i = 0; i < n; i++) {
			int grade = grades.get(i);
			int nextMultiple = ((grade + 4) / 5) * 5;
			if (grade >= 38 && nextMultiple - grade < 3) {
				grades.set(i, nextMultiple);
			}
		}
		return grades;

	}

}
