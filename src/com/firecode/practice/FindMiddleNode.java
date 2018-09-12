/*
package com.firecode.practice;

public class FindMiddleNode {




    public static void main(String args[])
    {

        SInglyLLInsertAtLast sl = new SInglyLLInsertAtLast();
        Node n1 = null;

        Node head = sl.insertAtTail(n1, 1);
        Node head1 = sl.insertAtTail(head, 2);
        Node head2 = sl.insertAtTail(head1, 3);



        Node current=head;

      */
/*  while (current.next != null) {
            System.out.println("head values:" + current.data + "  " + current.next);
            current=current.next;
        }*//*


       Node middle= FindMiddleNode.findMiddleNode(head);
        System.out.println("middle data"+middle.data);


    }




    public static Node findMiddleNode(Node head) {


        if(head==nu)

    int length=1;
        int i=0;



         Node current=head;
         while(current.next!=null)
         {
            length++;
            current=current.next;
         }
        // System.out.println(length);

        int arr[]=new int[length];
         current=head;
        int j=length;

        while(j!=0)
        {

           arr[i]=current.data;
           // System.out.println(arr[i]);
            current=current.next;
            i++;
            j--;
        }

        i=length/2;

        int n=arr[i];
        System.out.println(i+" "+n);

        current=head;
        while(current.next!=null)
        {
            if(current.data==n) {
                break;
            }
            current=current.next;
        }

        return current;

    }
}
*/
