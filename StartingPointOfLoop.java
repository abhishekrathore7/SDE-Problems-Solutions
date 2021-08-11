package sdeProblems;
import java.util.*;

public class StartingPointOfLoop {
	static Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	static Node removeLoop(Node head) {
		if(head==null || head.next == null)
			return null;
		Node slow = head,fast = head;
		slow = slow.next;
		fast = fast.next.next;
		while(fast!=null && fast.next!=null) {
			if(slow == fast)
				break;
			slow = slow.next;
			fast = fast.next.next;
		}
		if(slow != fast)
			return null;
		slow = head;
		while(slow!= fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
	static void printList(Node head)
	{
	  while (head != null)
	  {
	    System.out.print(head.data + " ");
	    head = head.next;
	  }
	  System.out.println();
	}

	public static void main(String[] args) {
		StartingPointOfLoop l = new StartingPointOfLoop();
		Node head = l.new Node(50);
		  head.next = l.new Node(20);
		  head.next.next = l.new Node(15);
		  head.next.next.next = l.new Node(4);
		  head.next.next.next.next = l.new Node(10);
		 
		  head.next.next.next.next.next = head.next.next;
		 
		  Node res = removeLoop(head);
		  if (res == null)
		    System.out.print("Loop does not exist");
		  else
		    System.out.print("Loop starting node is " +  res.data);

	}

}
