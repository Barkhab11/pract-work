package com.firecode.practice;

public class DeleteAtHead {


    public static void main(String args[]) {


        SInglyLLInsertAtLast sl = new SInglyLLInsertAtLast();
        Node n1 = null;

        Node head = sl.insertAtTail(n1, 1);
        Node head1 = sl.insertAtTail(head, 2);
        Node head2 = sl.insertAtTail(head1, 3);

        Node headd = head;

       Node current= DeleteAtHead.deleteAtHead(headd);

       while(current.next!=null)
       {
           System.out.println(current.data);
           current=current.next;
       }


    }

    public static Node deleteAtHead(Node head) {

        if(head==null)
        {return null;}

        Node current =head.next;

        head.next=null;

        return current;


    }




}
