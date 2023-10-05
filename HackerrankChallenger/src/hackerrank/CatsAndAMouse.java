package hackerrank;

public class CatsAndAMouse {

	public static void main(String[] args) {
		System.out.println(catAndMouse(1, 2, 3));

	}

	static String catAndMouse(int x, int y, int z) {
		String result = "";
		
		int AC = Math.abs(x-z);
		int BC = Math.abs(y-z);
		
		if(AC < BC) {
			result ="Cat A";
		}
		if(AC > BC) {
			result ="Cat B";
		}
		
		if(AC == BC) {
			result ="Mouse C";
		}
		
		return result;

	}
}
