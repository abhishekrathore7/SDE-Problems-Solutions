package sdeProblems;
import java.util.*;

class Pair{
    int st;
    int en;
    Pair(int s,int e){
        st=s;
        en=e;
    }
}
class Mycmp implements Comparator<Pair>{
    public int compare(Pair p1,Pair p2){
        return p1.en-p2.en;
    }
}
public class ActivitySelection {
	static int activity(int start[],int end[],int n) {
		Pair arr[]=new Pair[n];
        for(int i=0;i<n;i++){ 
            arr[i]= new Pair(start[i],end[i]); 
            
        }
        Arrays.sort(arr,new Mycmp());
        int res=1; 
        int prev=0;
        for(int i=1;i<n;i++){
            if(arr[i].st>arr[prev].en){
                res++;
                prev=i;
            }
        }
        
        return res;
	}
	public static void main(String[] args) {
		int s[] =  {1, 3, 0, 5, 8, 5};
	    int f[] =  {2, 4, 6, 7, 9, 9};
	    int n = s.length;
	        
	    System.out.println(activity(s, f, n));

	}

}
