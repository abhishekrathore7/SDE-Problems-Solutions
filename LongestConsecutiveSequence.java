package sdeProblems;
import java.util.*;

public class LongestConsecutiveSequence {
	static int sequence(int arr[]) {
		Set<Integer> set = new HashSet<>();
		int max = 0;
		for(int i:arr) {
			set.add(i);
		}
		for(int num:set) {
			if(set.contains(num -1)) continue;
			int  count=0;
			while(set.contains(num)) {
				count++;
				num = num+1;
			}
			max = max>count?max:count;
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[] = {100,4,200,1,3,2};
		System.out.println(sequence(arr));

	}

}
