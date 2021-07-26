package sdeProblems;
import java.util.*;

class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}
public class MergeLinkedList {
	Node head;
	public static void printList(Node head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t  = sc.nextInt();
		while(t-->0) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			Node head1 = new Node(sc.nextInt());
			Node tail1 = head1;
			for(int i=0;i<n1-1;i++) {
				tail1.next = new Node(sc.nextInt());
				tail1 = tail1.next;
			}
			Node head2 = new Node(sc.nextInt());
			Node tail2 = head2;
			for(int i=0;i<n2-1;i++) {
				tail2.next = new Node(sc.nextInt());
				tail2 = tail2.next;
			}
			LinkedList list = new LinkedList();
			Node head = list.sortedMerge(head1, head2);
			printList(head);
			
			
		}
	}

}
class LinkedList
{
    
    Node sortedMerge(Node head1, Node head2) {
     if(head1 == null) return head2;
     if(head2 == null) return head1;
     if(head1.data < head2.data){
         head1.next = sortedMerge(head1.next, head2);
         return head1;
     }
     else{
         head2.next = sortedMerge(head2.next, head1);
         return head2;
     }
   } 
}
