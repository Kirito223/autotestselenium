package hackerrank;

public class JumpingOnClouds {

	public static void main(String[] args) {
		int[] c = { 0, 0, 1, 0, 0, 1, 1, 0 };
		System.out.println(jumpingOnClouds(c, 2));
	}

	static int jumpingOnClouds(int[] c, int k) {
		int energy = 100; 
        int currentCloud = 0; 

        do {
            currentCloud = (currentCloud + k) % c.length; 
            energy--; 
            if (c[currentCloud] == 1) {
                energy -= 2;
            }
        } while (currentCloud != 0);
        return energy;
	}

}
