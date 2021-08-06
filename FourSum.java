package sdeProblems;
import java.util.*;

public class FourSum {
	static List<List<Integer>> fourSum(int nums[],int target){
		ArrayList<List<Integer>> l = new ArrayList<>();
		if(nums==null || nums.length==0) return l;
		int n = nums.length;
		Arrays.sort(nums);
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int diff = target-nums[j]-nums[i];
				int left = j+1;
				int right = n-1;
				while(left < right) {
					int sum = nums[left] + nums[right];
					if(sum<diff)
						left++;
					else if(sum>diff) 
						right--;
					else {
						List<Integer> quad = new ArrayList<>();
						quad.add(nums[i]);
						quad.add(nums[j]);
						quad.add(nums[left]);
						quad.add(nums[right]);
						l.add(quad);
						while(left<right && nums[left] == quad.get(2)) ++left;
						while(left<right && nums[right] == quad.get(3)) --right;
					}
				}
				while(j+1<n && nums[j+1] == nums[j]) ++j;
			}
			while(i+1<n && nums[i+1] == nums[i]) ++i;
		}
		return l;
	}

	public static void main(String[] args) {
		int nums[] = {1,0,-1,0,-2,2};
		int target = 0;
		System.out.println(fourSum(nums,target));

	}

}
