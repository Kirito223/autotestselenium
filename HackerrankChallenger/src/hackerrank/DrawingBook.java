package hackerrank;

public class DrawingBook {
	public static void main(String[] args) {
System.out.println(pageCount(5, 4));
	}

	public static int pageCount(int n, int p) {
	    int fromStart = p / 2;
        int fromEnd = (n % 2 == 0 ? (n - p + 1) / 2 : (n - p) / 2);
        return Math.min(fromStart, fromEnd);
	
	}
}
