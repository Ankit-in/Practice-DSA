package LinkedListPack;

import java.util.Scanner;

public final class LinkedListUser {
	

	public static void main(String[] args) {
		Node<Integer> head= TakeLL();
		//print(head);
		
	}

	public static void print(Node<Integer> head) {
		Node<Integer> Temp=head;
		while(head!=null) {
			System.out.print(Temp.data);
			Temp=Temp.next;
		}
		
	}

	public static Node<Integer> TakeLL() {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int data=s.nextInt();
		Node<Integer> head=null;
		while(data != -1) {
			Node<Integer> CurrentNode= new Node<>(data);
			if(head==null) {
				head=CurrentNode;
			}else {
				Node<Integer> Tail=head;
					while(Tail.next != null) {
						Tail=Tail.next;
					}
					Tail.next= CurrentNode;
			}
			//next number input
			data=s.nextInt();
		}
		return head;
	}

}
