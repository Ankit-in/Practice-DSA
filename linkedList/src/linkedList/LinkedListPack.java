package linkedList;

import java.util.LinkedList;

public class LinkedListPack {
	public static Node<Integer> LinkedLists(){
		Node<Integer> L1=new Node<>(20);
		Node<Integer> L2=new Node<>(30);
		Node<Integer> L3=new Node<>(40);
		Node<Integer> L4=new Node<>(51);
		L1.next=L2;
		System.out.print(L1);
		System.out.print(" ");
		System.out.print(L1.data);
		System.out.print(" ");
		System.out.print(L1.next);
		System.out.print(" ");
		System.out.print("->");
		L2.next=L3;
		System.out.print(L2);
		System.out.print(" ");
		System.out.print(L2.data);
		System.out.print(" ");
		System.out.println(L2.next);
		System.out.print(" ");
		System.out.print("->");
		L3.next=L4;
		System.out.println(L3);
		System.out.print(L3.data);
		System.out.print(" ");
		System.out.println(L3.next);
		System.out.print(" ");
		System.out.print("->");
		System.out.print(L4.data);
		System.out.print("->");
		System.out.print(L4.next);
		LinkedList<Integer> list=new LinkedList<>();
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(list.size()/2,10);
		
		return L1;
	}
	public static void main(String[] args) {
		Node<Integer> head=LinkedLists();

	}

}
