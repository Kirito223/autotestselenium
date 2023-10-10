package hackerrank;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CircularArrayRotation {

	public static void main(String[] args) {
		
	}

	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
		 int n = a.size();
	        k = k % n;
	        
	        List<Integer> result = new ArrayList<>();
	        
	        for(int q : queries) {
	            int index = q - k;
	            if(index < 0) {
	                index = n + index; 
	            }
	            result.add(a.get(index));
	        }
	        
	        return result;
	}
}
