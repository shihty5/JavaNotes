/*
 * 
 * 反转一个单向链表
 */
package com.peter.interview;

public class ReverseLinkedNode {

	public static void main(String[] args) {

		Node head = initLinklist();
		Node.print(head);

		Node result = reverse(head);
		Node.print(result);

	}

	public static Node initLinklist() {
		Node head = new Node(0);
		Node cur = head;

		for (int i = 1; i < 5; i++) {
			Node n = new Node(i);
			cur.next = n;
			cur = n;
		}

		return head;
	}

	/*
	 * 反转链表关键函数，返回新的链表头
	 */
	public static Node reverse(Node head) {
		Node pre = null;
		Node next = null;
		while (head != null) {
			next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}
		return pre;
	}
}

class Node {
	public int value;
	public Node next;

	public Node(int data) {
		this.value = data;
	}

	public static void print(Node head) {
		while (head != null) {
			System.out.println(head.value + " ");
			head = head.next;
		}
	}
}
