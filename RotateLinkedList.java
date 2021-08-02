package sdeProblems;
import java.util.*;

public class RotateLinkedList {
	static Node head=null;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
		
	}
	
	static void rotate(int k) {
		if(k==0 || head==null || head.next==null) return ;
        Node curr = head;
        int length=1;
        while(curr.next!=null){
            length++;
            curr = curr.next;
        }
        curr.next = head;
        k = length-k%length;
        while(k-->0) curr = curr.next;
        head = curr.next;
        curr.next = null;
        
	}
	static void push(int new_data)
	{
		RotateLinkedList list = new RotateLinkedList ();
	    Node new_node = list.new Node(new_data);
	    new_node.data = new_data;
	    new_node.next = head;
	    head = new_node;
	}
	 
	static void printList(Node node) {
		while(node!=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	public static void main(String[] args) {
		RotateLinkedList list = new RotateLinkedList();
		for (int i = 5;i>0;i--)
	        push( i);
	 
	    System.out.print("Given linked list \n");
	    printList(head);
	    rotate( 2);
	 
	    System.out.print("\nRotated Linked list \n");
	    printList(head);

	}

}
