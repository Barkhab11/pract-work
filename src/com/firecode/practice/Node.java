package com.firecode.practice;


class Node {
	public int data;
	public Node next;
	
	
	
	Node(int data) { this.data = data; }
 
	public void displayNodeData() {
		System.out.println("{ " + data + " } ");
	}
}