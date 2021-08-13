package sdeProblems;
import java.util.*;

public class MaxConsecutive1s {
	static int max1s(int arr[]) {
		int max=0;
	      int count=0;
	      for(int i:arr){
	          if(i == 1)
	              count++;
	          else{
	              max = Math.max(max,count);
	              count=0;
	          }
	      }
	        return Math.max(max,count);
	}

	public static void main(String[] args) {
		int arr[] = {1,1,0,1,1,1};
		System.out.println(max1s(arr));

	}

}
