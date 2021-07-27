package sdeProblems;
import java.util.*;

public class DeleteNodeWhenGiven {
	static Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	void printList(Node node) {
		while(node!=null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}
	void deleteNode(Node node) {
		Node temp = node.next;
		node.data = temp.data;
		node.next = temp.next;
	}
	public static void main(String[] args) {
		DeleteNodeWhenGiven list = new DeleteNodeWhenGiven();
        list.head = list.new Node(1);
        list.head.next = list.new Node(12);
        list.head.next.next = list.new Node(1);
        list.head.next.next.next = list.new Node(4);
        list.head.next.next.next.next = list.new Node(1);
 
        System.out.println("Before Deleting ");
        list.printList(head);
 
        list.deleteNode(head.next);
        System.out.println("");
        System.out.println("After deleting ");
        list.printList(head);

	}

}
