package sdeProblems;
import java.util.*;

class Meeting{
	int start,end,pos;
	Meeting(int start,int end,int pos){
		this.start = start;
		this.end = end;
		this.pos = pos;
	}
}

class myComp implements Comparator<Meeting>{
	@Override
	public int compare(Meeting o1,Meeting o2) {
		if(o1.end<o2.end)
			return -1;
		else if(o1.end>o2.end)
			return 1;
		else if(o1.pos<o2.pos)
			return -1;
		return 1;
	}
}

public class NmeetingsInRoom {
	static void meetings(int start[],int end[],int pos) {
		ArrayList<Meeting> l = new ArrayList<>();
		for(int i=0;i<start.length;i++)
			l.add(new Meeting(start[i],end[i],i+1));
		myComp mc = new myComp();
		Collections.sort(l,mc);
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(l.get(0).pos);
		int limit = l.get(0).end;
		for(int i=1;i<start.length;i++) {
			if(l.get(i).start>limit) {
				limit = l.get(i).end;
				ans.add(l.get(i).pos);
			}
		}
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i) + " ");
		}
	}

	public static void main(String[] args) {
		int s[] = { 1, 3, 0, 5, 8, 5 };
	    int f[] = { 2, 4, 6, 7, 9, 9 }; 
	    int n = 6;
	    ArrayList<Meeting> meet = new ArrayList<>();
	    for(int i = 0; i < s.length; i++)
	        meet.add(new Meeting(s[i], f[i], i));
	    meetings(s,f,n);

	}

}
