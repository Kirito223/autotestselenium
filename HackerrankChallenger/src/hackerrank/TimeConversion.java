package hackerrank;

public class TimeConversion {
	public static void main(String[] args) {
		System.out.println(timeConversion("12:45:54PM"));
	}

	public static String timeConversion(String s) {
		String result = "";
		String[] arrTime = s.split(":");
		int session = arrTime[2].indexOf("A");
		String second = "";
		if (session > -1) {
//			AM
			second = arrTime[2].substring(0, arrTime[2].indexOf("A"));
			result = (Integer.parseInt(arrTime[0]) == 12?"00":arrTime[0]) + ":" + arrTime[1] + ":" + second;
		} else {
			int hour = Integer.parseInt(arrTime[0]) + 12;
			second = arrTime[2].substring(0, arrTime[2].indexOf("P"));
			result = (hour == 24?"12":hour) + ":" + arrTime[1] + ":" + second;
		}
		return result;

	}
}
