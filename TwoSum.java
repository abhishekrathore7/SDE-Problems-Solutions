package sdeProblems;
import java.util.*;

public class TwoSum {
	static int[] twoSum(int arr[],int target) {
		int res[] = new int[2];
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(map.containsKey(target-arr[i])) {
				res[1] = i;
				res[0] = map.get(target-arr[i]);
				return res;
			}
			map.put(arr[i], i);
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[] = {2,7,11,15};
		int target = 9;
		int res[] = new int[2];
		twoSum(arr,target);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i] + " ");
		}

	}

}
