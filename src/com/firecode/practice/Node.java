package com.firecode.practice;


class Node {
	public int data;
	public Node next;

	@Override
	public String toString() {
		return "Node{" +
				"data=" + data +
				", next=" + next +
				'}';
	}

	Node(int data) { this.data = data; }
 
	public void displayNodeData() {
		System.out.println("{ " + data + " } ");
	}
}