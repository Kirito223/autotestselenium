package hackerrank;

public class ViralAdvertising {

	public static void main(String[] args) {
		System.out.println(viralAdvertising(3));
	}

	public static int viralAdvertising(int n) {
		 
        int totalLikes = 0;
        int shared = 5;
        
        for (int i = 1; i <= n; i++) {
            int liked = shared / 2;
            totalLikes += liked;
            shared = liked * 3;
        }
        return totalLikes;
	}

}
