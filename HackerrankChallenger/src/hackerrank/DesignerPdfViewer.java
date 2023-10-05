package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DesignerPdfViewer {

	public static void main(String[] args) {
		List<Integer> data = ReadData.readData("pdf.txt");
		System.out.println(designerPdfViewer(data, "zaba"));

	}

	public static int designerPdfViewer(List<Integer> h, String word) {
		 int maxHeight = 0;
	        for(char c : word.toCharArray()) {
	            maxHeight = Math.max(maxHeight, h.get(c - 'a')); 
	        }
	        
	        int area = maxHeight * word.length();
	        return area;

	}
}
