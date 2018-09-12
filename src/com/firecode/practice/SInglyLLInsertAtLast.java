package com.firecode.practice;

public class SInglyLLInsertAtLast {

	//main maethod not written for this class

	//my code
	public Node insertAtTail(Node head, int data) {

		Node node;

		if (head == null) {
			node = new Node(data);
			return node;
		} else {

			Node current = head;
			while (current.next != null) {
				current = current.next;
			}

			node = new Node(data);
			current.next = node;
		}

		return head;

	}

//proper code(no variable in constructor),different implementation
/*	public	Node insertAtTail(Node head,int data) {
		if (head == null){
			head = new Node();
			head.data = data;
		}
		else {
			Node node = head;
			while (node.next != null){
				node = node.next;
			}
			node.next = new Node();
			node.next.data = data;
		}
		return head;
	}*/

	public static void main(String args[]) {

		SInglyLLInsertAtLast sl = new SInglyLLInsertAtLast();
		Node n1 = null;

		Node head = sl.insertAtTail(n1, 1);
		Node head1 = sl.insertAtTail(head, 2);
		Node head2 = sl.insertAtTail(head1, 3);

		Node current=head;

		while (current.next != null) {
			System.out.println("head values:" + current.data + "  " + current.next);
			current=current.next;
		}


	}
}