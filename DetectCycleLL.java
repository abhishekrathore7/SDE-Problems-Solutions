package sdeProblems;
import java.util.*;

public class DetectCycleLL {
	static Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}

	static boolean Cycle(Node head) {
		Node slow = head;
		Node fast = head;
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return true;
			}
		}
		
		return false;
		
	}
	public static void main(String[] args) {
		DetectCycleLL list = new DetectCycleLL();
		list.head = list.new Node(1);
		list.head.next = list.new Node(2);
		list.head.next.next = list.new Node(3);
		list.head.next.next.next = list.new Node(4);
		list.head.next.next.next.next = list.new Node(5);
		
		head.next.next.next.next.next = null;
		
		System.out.println("isCycle: " + list.Cycle(head));

	}

}
