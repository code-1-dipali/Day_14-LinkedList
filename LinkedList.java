package com.bridglabz.programs;


public class LinkedList {
	private static Node head;
	public static class Node {
		private int data;
		private Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
		public static void main(String[] args) {
			LinkedList linkedList = new LinkedList();
			linkedList.head = new Node(56);
			Node secondNode = new Node(30);
			Node thirdNode = new Node(70);
			linkedList.head.next = secondNode;
			secondNode.next = thirdNode;
		}
	}
}
