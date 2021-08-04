package sdeProblems;
import java.util.*;

public class ExcelColumnNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int res = 0;
		for(int i=0;i<s.length();i++) {
			res*=26;
			res += s.charAt(i) - 'A' + 1; 
		}
		System.out.println(res);

	}

}
