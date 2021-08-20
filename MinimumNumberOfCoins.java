package sdeProblems;
import java.util.*;

public class MinimumNumberOfCoins {
	static int deno[] = {1,2,5,10,20,50,100,500,1000};
	static int n = deno.length;
	
	static void minCoins(int V) {
		ArrayList<Integer> res = new ArrayList<>();
		for(int i=n-1;i>=0;i--) {
			while(V >= deno[i]) {
				V-= deno[i];
				res.add(deno[i]);
			}
		}
		for(int i=0;i<res.size();i++) {
			System.out.print(" " + res.get(i));
		}
	}

	public static void main(String[] args) {
		int n = 93;
        System.out.print(
            "Following is minimal number "
            +"of change for " + n + ": ");
        minCoins(n);

	}

}
