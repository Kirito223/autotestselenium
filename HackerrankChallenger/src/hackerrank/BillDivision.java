package hackerrank;

import java.util.List;

public class BillDivision {
	public static void main(String[] args) {
		List<Integer> data = ReadData.readData("bill.txt");
		bonAppetit(data, 1, 7);
	}

	public static void bonAppetit(List<Integer> bill, int k, int b) {
		int total_without_k = 0;
		for (int i = 0; i < bill.size(); i++) {
			total_without_k += bill.get(i);
		}
		int half = (total_without_k - bill.get(k))/2;
		if(half == b) {
			System.out.println("Bon Appetit");
		}else {
			System.out.println( b - half);
		}
	}
}
