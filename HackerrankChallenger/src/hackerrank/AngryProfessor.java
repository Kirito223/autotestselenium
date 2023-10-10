package hackerrank;

import java.util.List;

public class AngryProfessor {

	public static void main(String[] args) {
		List<Integer> data = ReadData.readData("angry.txt");
		System.out.println(angryProfessor(2, data));

	}

	public static String angryProfessor(int k, List<Integer> a) {
		int onTime = 0;
        for(int time : a) {
            if(time <= 0) {
                onTime++;
            }
        }
        
        if(onTime < k) {
            return "YES";
        } else {
            return "NO";
        }
	}
}
