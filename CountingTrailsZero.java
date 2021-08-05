package sdeProblems;
import java.util.*;

public class CountingTrailsZero {
	static int countZeros(int n) {
		if(n<0) return -1;
		int count=0;
		for(int i=5;n/i>=1;i*=5) {
			count+=n/i;
		}
		return count; 
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(countZeros(n));

	}

}
