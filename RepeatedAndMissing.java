package sdeProblems;
import java.util.*;

public class RepeatedAndMissing {

	public static void main(String[] args) {
		int arr[] = {4, 3, 6, 2, 1, 1};
		HashMap<Integer,Boolean> map = new HashMap<>();
		int max = arr.length;
		for(int i:arr) {
			if(map.get(i)==null) {
				map.put(i, true);
			}
			else {
				System.out.println("Repeating: " + i);
			}
		}
		for (int i = 1; i <= max; i++) {
            if (map.get(i) == null) {
                System.out.println("Missing = " + i);
            }
        }

	}

}
