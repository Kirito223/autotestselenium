package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class PermutationEquation {
	public static void main(String[] args) {

	}

	public static List<Integer> permutationEquation(List<Integer> p) {
		int n = p.size();
        List<Integer> result = new ArrayList<>();
        
        for(int i=1; i<=n; i++) {
            int x = p.indexOf(i) + 1;
            int y = p.indexOf(x) + 1;
            result.add(y);
        }
        
        return result;


	}
}
