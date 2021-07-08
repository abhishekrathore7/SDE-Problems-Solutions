package sdeProblems;
import java.util.*;

public class DuplicateNumber {
	 public static int findDuplicate(int[] nums) {
	        Arrays.sort(nums);
	        int temp=0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i] == nums[i+1]){
	                temp = nums[i];
	                break;
	            }
	        }
	        return temp;
	    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nums[] = new int[n+1];
		for(int i=0;i<n;i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(findDuplicate(nums));

	}

}
