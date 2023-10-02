package hackerrank;

public class CountingValleys {
	public static void main(String[] args) {

	}

	public static int countingValleys(int steps, String path) {
		int level = 0 ;
		int valleys =0;
		for(int i = 0; i< steps;i++) {
			String p =String.valueOf( path.charAt(i));
			if(p.equals("U")) {
				level++;
			}else {
				level--;
			}
			if(p.equals("U") && level == 0) {
				valleys++;
			}
		}
		return valleys;
	}
}
