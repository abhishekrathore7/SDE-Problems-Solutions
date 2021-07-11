package sdeProblems;
import java.util.*;

public class PascalTriangle {
	static List<List<Integer>> pascal(int n){
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> row,previous = null;
		for(int i=0;i<n;i++) {
			row = new ArrayList<>();
			for(int j=0;j<=i;j++) {
				if(j==0 || j==i) {
					row.add(1);
				}
				else {
					row.add(previous.get(j-1) + previous.get(j));
				}
			}
			previous = row;
			ans.add(row);
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(pascal(n));

	}

}
