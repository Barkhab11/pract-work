package com.firecode.practice;
//program to find the middele node for singly linked list

public class SinglyLinkedList {
	private Node head;
 
	public boolean isEmpty() {
		return (head == null);
	}
 
	// used to insert a node at the start of linked list
	public void insertFirst(int data) {
		Node newNode = new Node(data);
		//newNode.data = data;
		newNode.next = head;
		head = newNode;
	}
 
	// used to delete node from start of linked list
	public Node deleteFirst() {
		Node temp = head;
		System.out.println("temp node data:"+temp.data+"  "+temp.next);
		System.out.println("head node data:"+head.data+"  "+head.next);
		head = head.next;
		System.out.println("delete head node data:"+head.data+"  "+head.next);
		return temp;
	}
 
	// Use to delete node after particular node
	public void deleteAfter(Node after) {
		Node temp = head;
		while (temp.next != null && temp.data != after.data) {
			temp = temp.next;
		}
		if (temp.next != null)
			temp.next = temp.next.next;
	}
 
	// used to insert a node at the last of linked list
	public void insertLast(int data) {
		Node current = head;
		while (current.next != null) {
			current = current.next; // we'll loop until current.next is null
		}
		Node newNode = new Node(data);
		//newNode.data = data;
		current.next = newNode;
	}
 
	// For printing Linked List
	public void printLinkedList() {
		System.out.println("Printing LinkedList (head --> last) ");
		Node current = head;
		while (current != null) {
			current.displayNodeData();
			current = current.next;
		}
		System.out.println();
	}



	 
	 public static void main(String args[]) {
		 // Creating Singly linked list in Java of String type
		 SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		 singlyLinkedList.insertFirst(1);
		 System.out.println("head for 1 is:"+singlyLinkedList.head.data+ "and next is:"+singlyLinkedList.head.next);
		 singlyLinkedList.insertFirst(2);
		 System.out.println("head for 2 is:"+singlyLinkedList.head.data+ "and next is:"+singlyLinkedList.head.next);
		 singlyLinkedList.insertFirst(3);
		 singlyLinkedList.insertFirst(4);
		 singlyLinkedList.deleteFirst();
		 singlyLinkedList.deleteFirst();
		 singlyLinkedList.printLinkedList();
		 
	 }
	 
	 
	 
} 