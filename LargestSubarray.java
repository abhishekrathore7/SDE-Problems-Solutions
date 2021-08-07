package sdeProblems;
import java.util.*;

public class LargestSubarray {
	static int LengthSubarray(int arr[],int n) {
		HashMap<Integer,Integer> map = new HashMap<>();
		int sum=0;
		int len=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			if(arr[i] == 0 &&  len == 0) {
				len=1;
			}
			if(sum==0)
				len = i+1;
			Integer prev = map.get(sum);
			if(prev != null)
				len = Math.max(len, i-prev);
			else
				map.put(sum,i);
		}
		return len;
	}

	public static void main(String[] args) {
		int arr[] = {15, -2, 2, -8, 1, 7, 10, 23};
		int n = arr.length;
		System.out.println(LengthSubarray(arr,n));

	}

}
