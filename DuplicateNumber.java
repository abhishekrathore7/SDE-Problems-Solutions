package sdeProblems;
import java.util.*;

public class DuplicateNumber {
	//TC: O(NlogN) SC: O(1)
//	 public static int findDuplicate(int[] nums) {
//	        Arrays.sort(nums);
//	        int temp=0;
//	        for(int i=0;i<nums.length;i++){
//	            if(nums[i] == nums[i+1]){
//	                temp = nums[i];
//	                break;
//	            }
//	        }
//	        return temp;
//	    }
	
	
//TC:O(N) SC: O(1)
	static int findDuplicate(int nums[]) {
		int slow = nums[0];
		int fast = nums[0];
		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		} while(slow!=fast);
		fast = nums[0];
		while(slow!=fast) {
			slow = nums[slow];
			fast = nums[fast];
		}
		return slow;
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
