package sdeProblems;
import java.util.*;

public class CountSubarraysXOR {
	static int CountXor(int arr[], int m)
    {
       HashMap<Integer,Integer> map = new HashMap<>();
       int count=0;
       int xor = 0;
       int n = arr.length;
       for(int i=0;i<n;i++) {
    	   xor = xor^arr[i];
    	   if(map.get(xor^m) != null) {
    		   count += map.get(xor^m);
    	   }
    	   if(xor == m)
    		   count++;
    	   if(map.get(xor) != null)
    		   map.put(xor, map.get(xor)+1);
    	   else
    		   map.put(xor, 1);
       }
       return count;
       
    }
	public static void main(String[] args) {
		int arr[] = {4, 2, 2, 6, 4 };
		int n = arr.length;
		int m = 6;
		System.out.println(CountXor(arr,m));

	}

}
