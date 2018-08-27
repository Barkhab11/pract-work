package com.firecode.practice;

public class SInglyLLInsertAtLast {
	
	//main maethod not written for this class
	
	public Node insertAtTail(Node head, int data) {
	    
	     Node node=new Node(data);
	    
	      if(head==null)
	    {
	    return node;}
	    else{
	    
	    	Node current=head;
	  
	    
	    while(current.next!=null)
	    {
	        current=current.next;
	    }

	    current.next=node;
	    }
	    
	    return head;

	}
	
	 /*public static void main(String args[]) {
		 	
		 SInglyLLInsertAtLast sl =new SInglyLLInsertAtLast();
		 Node n1=new Node(1);
		 
		Node newNode= sl.insertAtTail(n1, 1);
		
		
		Node current=n1;
		while(current.next!=null) {
		 System.out.println("head values:"+n1.data+"  "+n1.next);
		}*/
		 
	 }
	
