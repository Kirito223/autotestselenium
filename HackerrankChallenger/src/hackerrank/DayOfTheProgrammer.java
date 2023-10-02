package hackerrank;

public class DayOfTheProgrammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(dayOfProgrammer(1984));
	}

	public static String dayOfProgrammer(int year) {
		if (year == 1918) {
			return "12.05.1918";
		} else if ((year < 1918 && year % 4 == 0)
				|| (year > 1918 && ((year % 400 == 0)) || (year % 4 == 0 && year % 100 != 0))) {
			return "12.09." + year;
		} else {
			return "13.09." + year;
		}

	}

}
