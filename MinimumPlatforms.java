package sdeProblems;
import java.util.*;


public class MinimumPlatforms {
	static int platforms(int arr[], int dept[],int n) {
		Arrays.sort(arr);
		Arrays.sort(dept);
		int platform=1,res=1;
		int i=1,j=0;
		while(i<n && j<n) {
			if(arr[i] <= dept[j]) {
				platform++;
				i++;
			}
			else if(arr[i] > dept[j]) {
				platform--;
				j++;
			}
			if(platform > res) {
				res = platform;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        int n = arr.length;
        System.out.println("Minimum Number of Platforms Required = "
                           + platforms(arr, dep, n));

	}

}
