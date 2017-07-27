package HackerRank.Day15;

import java.util.Scanner;

public class Solution {

	public static Node insert(Node head, int data) {
		// Complete this method
		Node inode = new Node(data);
		Node fhead = head;
		if (head == null) {
			head = inode;
			return head;
		}

		while (head.next != null) {
			head = head.next;
		}
		head.next = inode;

		return fhead;

	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while (N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		display(head);
		sc.close();
	}

}
