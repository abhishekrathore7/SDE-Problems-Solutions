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


public class DeleteNthNodefromEnd {
	static Node head;
	static void remove(int key) {
		Node first = head;
		Node last = head;
		for(int i=0;i<key;i++) {
			if(last.next == null) {
				if(i==key-1) {
					head = head.next;
				}
				return;
			}
			last = last.next;
		}
		while(last.next!= null) {
			first = first.next;
			last = last.next;
		}
		first.next = first.next.next; 
	}
	public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
 
    public void printList()
    {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }

	public static void main(String[] args) {
		DeleteNthNodefromEnd llist = new DeleteNthNodefromEnd();
		 
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
 
        System.out.println("Created Linked list is:");
        llist.printList();
 
        int N = 2;
        llist.remove(N);
 
        System.out.println("\nLinked List after Deletion is:");
        llist.printList();

	}

}
