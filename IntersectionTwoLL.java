package sdeProblems;
import java.util.*;

public class IntersectionTwoLL {
    static Node head1, head2;
	 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            d = data;
            next = null;
        }
    }
 
    
    static Node intersection(Node head1,Node head2) {
    	if(head1 == null || head2 == null) return null;
    	Node first = head1;
    	Node second = head2;
    	while(first!=second) {
    		first = first == null ? head2 : first.next;
    		second = second == null ? head1 : second.next;
    	}
    	return first;
    }

	public static void main(String[] args) {
		IntersectionTwoLL list = new IntersectionTwoLL();
		
        list.head1 = new Node(3);
        list.head1.next = new Node(6);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(15);

        list.head2 = new Node(10);
        list.head2.next = new Node(6);
        list.head2.next.next = new Node(30);
        list.head2.next.next.next = new Node(40);
        list.head2.next.next.next.next = new Node(50);
 
        System.out.println("The node of intersection is " + list.intersection(head1,head2));

	}

}
