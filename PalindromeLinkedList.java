package sdeProblems;
import java.util.*;

public class PalindromeLinkedList {
	static Node head1;
	class Node {
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	static boolean isPalindrome(Node head)
    {
 
        Node slow = head;
        boolean ispalin = true;
        Stack<Integer> stack = new Stack<Integer>();
 
        while (slow != null) {
            stack.push(slow.data);
            slow = slow.next;
        }
 
        while (head != null) {
 
            int i = stack.pop();
            if (head.data == i) {
                ispalin = true;
            }
            else {
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
    }


	public static void main(String[] args) {
		PalindromeLinkedList list = new PalindromeLinkedList();
		    Node one = list.new Node(1);
	        Node two = list.new Node(2);
	        Node three = list.new Node(3);
	        Node four = list.new Node(4);
	        Node five = list.new Node(3);
	        Node six = list.new Node(2);
	        Node seven = list.new Node(1);
	        one.next = two;
	        two.next = three;
	        three.next = four;
	        four.next = five;
	        five.next = six;
	        six.next = seven;
	        boolean condition = isPalindrome(one);
	        System.out.println("isPalidrome :" + condition);

	}

}
