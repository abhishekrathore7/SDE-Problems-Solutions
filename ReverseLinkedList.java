package sdeProblems;
import java.util.*;

public class ReverseLinkedList {
	static Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static Node reverse(Node node) {
		Node pre = null;
		Node curr = node;
		Node next = null;
		while(curr!=null) {
			next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;
		}
		node  = pre;
		return node;
	}
	
    void printNode(Node node) {
		while(node!=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
 
        System.out.println("Given Linked list");
        list.printNode(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printNode(head);

	}

}
