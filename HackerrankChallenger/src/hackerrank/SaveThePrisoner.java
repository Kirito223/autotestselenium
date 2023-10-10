package hackerrank;

public class SaveThePrisoner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int saveThePrisoner(int n, int m, int s) {
		int pos = m + s - 1;

		if (pos > n) {
			pos = pos % n;

			if (pos == 0) {
				pos = n;
			}
		}
		return pos;
	}
}
