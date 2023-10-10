package hackerrank;

import java.util.Iterator;

public class UtopianTree {
	public static void main(String[] args) {
		System.out.println(utopianTree(3));
	}

	public static int utopianTree(int n) {
		int height = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0) {
				height = height + 1;
			} else {
				height = height * 2;
			}
		}
		return height;
	}
}
