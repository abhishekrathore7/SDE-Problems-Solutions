package sdeProblems;
import java.util.*;

public class ThreeSum {
	static boolean triplets(int arr[],int n,int sum) {
		for(int i=0;i<n-2;i++) {
			HashSet<Integer> set = new HashSet<>();
			int curr = sum-arr[i];
			for(int j=i+1;j<n;j++) {
				if(set.contains(curr-arr[j])) {
					System.out.printf("Triplet is %d,%d, %d", arr[i],arr[j], curr - arr[j]);
                    return true;
				}
				set.add(arr[j]);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int arr_size = A.length;
 
       triplets(A, arr_size, sum);

	}

}
