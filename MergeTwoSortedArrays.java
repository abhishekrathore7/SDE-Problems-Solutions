package sdeProblems;
import java.util.*;

public class MergeTwoSortedArrays {
	static void merge(int arr1[], int m,int arr2[], int n) {
		int i=0,temp=0;
		while(arr1[m-1] > arr2[0]) {
			if(arr1[i]>arr2[0]) {
				temp = arr1[i];
				arr1[i] = arr2[0];
				arr2[0] = temp;
				Arrays.sort(arr2);
			}
			i++;
		}
	}

	public static void main(String[] args) {
		int arr1[] = {1, 5, 9, 10, 15, 20 };
		int arr2[] = {2, 3, 8, 13};
		int m = arr1.length;
		int n = arr2.length;
		merge(arr1,m,arr2,n);
		System.out.print("After Merging \nFirst Array: ");
	    System.out.println(Arrays.toString(arr1));
	     
	    System.out.print("Second Array:  ");
	    System.out.println(Arrays.toString(arr2));

	}

}
