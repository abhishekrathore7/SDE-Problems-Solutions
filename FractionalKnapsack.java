package sdeProblems;
import java.util.*;

public class FractionalKnapsack {
	static double maxValue(int wt[],int val[],int W) {
		Item[] ival = new Item[wt.length];
		for(int i=0;i<wt.length;i++) {
			ival[i] = new Item(wt[i],val[i],i);
		}
		Arrays.sort(ival, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2)
            {
                return o2.cost.compareTo(o1.cost);
            }
        });
		double totalValue = 0d;
		 
        for (Item i : ival) {
 
            int curWt = (int)i.wt;
            int curVal = (int)i.val;
 
            if (W - curWt >= 0) {
                W = W - curWt;
                totalValue += curVal;
            }
            else {
                double fraction
                    = ((double)W / (double)curWt);
                totalValue += (curVal * fraction);
                W
                    = (int)(W - (curWt * fraction));
                break;
            }
        }
 
        return totalValue;
		
	}
	
	static class Item{
		Double cost;
		double wt,val,W;
		@SuppressWarnings("deprecation")
		Item(int wt,int val,int W){
			this.wt = wt;
			this.val = val;
			this.W = W;
			cost = new Double((double)val / (double)wt);
		}
	}

	public static void main(String[] args) {
		 int[] wt = { 10, 40, 20, 30 };
	        int[] val = { 60, 40, 100, 120 };
	        int capacity = 50;
	 
	        double maxValue = maxValue(wt, val, capacity);
	 
	        // Function call
	        System.out.println("Maximum value we can obtain = "
	                           + maxValue);
	}

}
