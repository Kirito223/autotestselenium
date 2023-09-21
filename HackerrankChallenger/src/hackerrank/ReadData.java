package hackerrank;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadData {
	public static List<Integer> readData(String filename) {
		String data = "";
		try {
			File myObj = new File(filename);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				data = myReader.nextLine();
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		String[] arrStr = data.split(" ");
		List<Integer> result = new ArrayList<Integer>();
		for (String integer : arrStr) {
			result.add(Integer.parseInt(integer));
			;
		}
		return result;

	}

	public static boolean WriteFileData(String filename, List<Integer> data) {
		try {
			File myObj = new File(filename);
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
				String str ="";
				for (int i = 0; i < data.size(); i++) {
					str+= data.get(i)+" ";
				}
				BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
			    writer.write(str);
			    writer.close();
				return true;
			}
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			return false;
		}
		return false;
	}
}
