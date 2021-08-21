package sdeProblems;
import java.util.*;

class item{
	int val,W;
	item(int x,int y){
		this.val = x;
		this.W = y;
	}
}

class ItemComp implements Comparator<item>{
	@Override
	public int compare(item a,item b) {
		double r1 = (double)(a.val)/ (double)(a.W);
		double r2 = (double)(b.val)/ (double)(b.W);
		if(r1<r2) return 1;
		else if(r1>r2) return -1;
		else return 0;
	}
}
public class FractionalKnapsack {
	static double maxValue(int W,item arr[],int n) {
	Arrays.sort(arr, new ItemComp());
	int currW = 0;
	double finalValue = 0.0;
	for(int i=0;i<n;i++) {
		if(currW + arr[i].W <= W) {
			currW += arr[i].W;
			finalValue += arr[i].val;
		}
		else {
			int remain = W - currW;
			finalValue += ((double)arr[i].val / (double)arr[i].W) * (double)remain;
			break;
		}
	}
	return finalValue;
	
}

	public static void main(String[] args) {
		   
	}

}
