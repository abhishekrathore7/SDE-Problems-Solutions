package sdeProblems;
import java.util.*;

//MAXIMUM SUBARRAY SUM PROBLEM
//TIME COMPLEXITY: O(N) AND SPACE COMPLEXITY: O(1)
public class KadanesAlgo {
	static int maxSum(int arr[]) {
		int n = arr.length;
		int max_so_far=arr[0];
		int curr_max=arr[0];
		for(int i=1;i<n;i++) {
			curr_max = Math.max(arr[i],curr_max+arr[i]);
			max_so_far = Math.max(max_so_far, curr_max);
		}
		return max_so_far;
	}

	public static void main(String[] args) {
		int arr[] = {-1,-2,-3,-4};
		System.out.println(maxSum(arr));

	}

}
