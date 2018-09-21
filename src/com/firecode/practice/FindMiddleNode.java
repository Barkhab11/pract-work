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


/*
 while (current.next != null) {
            System.out.println("head values:" + current.data + "  " + current.next);
            current=current.next;
        }
*/


      Node middle= FindMiddleNode.findMiddleNode(head);
        System.out.println("middle data"+middle.data);


    }




    public static Node findMiddleNode(Node head) {

        int length=1;
        int i=0;

        if(head==null) {
            return null;
        }

         Node current=head;
         while(current.next!=null)
         {
            length++;
            current=current.next;

         }

        System.out.println("lenght"+length);
        int arr[]=new int[length];
         current=head;
        int j=length;

        while(j!=0)
        {

           arr[i]=current.data;
            current=current.next;
            i++;
            j--;
        }

        i=length/2;
        int n=0;

    if(length%2==0) {
        n = arr[i - 1];
    }
    else
         n=arr[i];


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



/*    public static Node findMiddleNodeE(Node head) {

      int length=0;
      Node current=head;
      Node middle=head;

      while(current.next!=null)
      {
          length++;
          if(length%2==0)
          {
              middle=middle.next;
          }
          current=current.next;
      }
 if(length%2==1)
 {
     middle=middle.next;
     return middle;
 }
else return current;

    }*/
}

