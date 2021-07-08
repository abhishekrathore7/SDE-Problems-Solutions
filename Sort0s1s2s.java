package sdeProblems;
import java.util.*;

public class Sort0s1s2s {
	static void sortColors(int nums[]) {
		int n =nums.length;
		int low=0,mid=0,high=n-1,temp=0;
		while(mid<=high) {
			switch(nums[mid]) {
			case 0:
				temp = nums[low];
				nums[low] = nums[mid];
				nums[mid] = temp;
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				high--;
				break;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n+1];
		for(int i=0;i<n;i++) {
			nums[i] = sc.nextInt();
		}
		Sort0s1s2s s = new Sort0s1s2s();
		s.sortColors(nums);
		for(int i=0;i<n;i++) {
			System.out.print(nums[i]+ " ");
		}
		

	}

}
