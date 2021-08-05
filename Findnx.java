package sdeProblems;
import java.util.*;

public class Findnx {
	static int power(int n,int x) {
		int temp;
		if(x==0) {
			return 1;
		}
		temp = power(n,x/2);
		if(x%2==0) {
			return temp*temp;
		}
		else {
			return n*temp*temp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		System.out.println(power(n,x));

	}

}
