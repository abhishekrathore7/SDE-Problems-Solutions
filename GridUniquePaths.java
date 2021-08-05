package sdeProblems;
import java.util.*;

public class GridUniquePaths {
	static int paths(int m,int n) {
		int arr[] = new int[n];
		arr[0] = 1;
		for(int i=0;i<m;i++) {
			for(int j=1;j<n;j++) {
				arr[j] += arr[j-1];
			}
		}
		return arr[n-1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(paths(a,b));

	}

}
