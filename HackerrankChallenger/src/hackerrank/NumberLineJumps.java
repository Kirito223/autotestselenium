package hackerrank;

public class NumberLineJumps {

	public static void main(String[] args) {
		System.out.println(kangaroo(21 ,6 ,47, 3));

	}

	public static String kangaroo(int x1, int v1, int x2, int v2) {
		if (x1 == x2) {
			if (v1 == v2) {
				return "YES";
			} else {
				return "NO";
			}
		}
		double n = (double)(x2-x1)/(v1-v2);
		if (n >= 0 && n == (int) n) {
            return "YES";
        } else {
            return "NO";
        }
	}

}
