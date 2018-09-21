package com.firecode.practice;

public class SinglyLinkedDeleteAtLast {


    public Node deleteAtTail(Node head) {

        if (head == null || head.next == null) return null;
        Node node = head;
        while(node.next.next != null) {
            node = node.next;
        }

        node.next = null;
        return head;
    }
}
