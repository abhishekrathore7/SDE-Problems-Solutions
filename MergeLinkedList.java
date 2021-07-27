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

     
class MergeLists
{
	
Node head;
 

public void addToTheLast(Node node)
{
    if (head == null)
    {
        head = node;
    }
    else
    {
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
    }
}
 
void printList()
{
    Node temp = head;
    while (temp != null)
    {
        System.out.print(temp.data + " ");
        temp = temp.next;
    }
    System.out.println();
}
 

public static void main(String args[])
{
   
    MergeLists llist1 = new MergeLists();
    MergeLists llist2 = new MergeLists();
     
    llist1.addToTheLast(new Node(5));
    llist1.addToTheLast(new Node(10));
    llist1.addToTheLast(new Node(15));
     
    llist2.addToTheLast(new Node(2));
    llist2.addToTheLast(new Node(3));
    llist2.addToTheLast(new Node(20));
     
     
    llist1.head = new Gfg().sortedMerge(llist1.head,
                                        llist2.head);
    llist1.printList();    
     
}
}
 
class Gfg
{

Node sortedMerge(Node head1, Node head2)
{
     if(head1 == null) return head2;
     if(head2 == null) return head1;
     if(head1.data<head2.data) {
    	 head1.next = sortedMerge(head1.next,head2);
    	 return head1;
     }
     else {
    	 head2.next = sortedMerge(head2.next,head2);
    	 return head2;
     }
    
  }
}



