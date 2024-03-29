import java.util.LinkedList;

public class Linklist {
	
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	public Node head;
	
	public void addelement(int data) {
		Node newnode=new Node(data);
		newnode.next=head;
		head=newnode;
		
		
	}
	public void print() {
		for(Node currnode=head;currnode!=null;currnode=currnode.next) {
			System.out.print(currnode.data +"->");
		}
		System.out.println("null");
	}
	
	public void addatmiddle(int data) {
		int llsize=0;
		Node newNode=new Node(data);
		Node currnode=head;
		while(currnode!=null) {
			llsize++;
			currnode=currnode.next;
		}
		int mid=llsize/2;
		
		Node curr=head;
		for(int i=0;i<mid-1;i++) {
			curr=curr.next;
		}
		//System.out.println(newNode);
		//System.out.println(curr.data);
		newNode.next=curr.next;
		curr.next=newNode;
		//System.out.println(prev.next.data);
		//System.out.println(prev.next.next.data);
		//System.out.println(curr.next.data);
		
	}
	public void reversell() {
		Node prev=head;
		Node ahead=head.next;
		//Node nextnode=ahead.next;
		
		while(ahead!=null) {
			Node nextnode=ahead.next;
			ahead.next=prev;
			
			prev=ahead;
			ahead=nextnode;
		}
		head.next=null;
		head=prev;
		
	}
	
	public void addatend(int data) {
		Node newnode=new Node(data);
		//int count=0;
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
			//count++;
		}
		//System.out.println(curr.data);
		curr.next=newnode;
		newnode.next=null;
	}
	public void addrandom(int target,int data) {
		
		Node newnode=new Node(data);
		Node curr=head;
		Node ahead=head.next;
		while(curr.data!=target && curr.next!=null) {
			curr=curr.next;
			ahead=ahead.next;
		}
		if(curr.data==target) {
			curr.next=newnode;
			newnode.next=ahead;
		}else {
			return;
		}
		
		//System.out.println(curr.data);
		//System.out.println(ahead.data);
		
	}
	
	public static void main(String[] args) {
		Linklist l1= new Linklist();
		l1.addelement(5);
//		l1.addelement(6);
//		l1.addelement(7);
//		l1.addelement(8);
//		l1.print();
//		l1.addatmiddle(10);
//		l1.print();
//		l1.addatend(4);
		l1.print();
		l1.addrandom(5,9);
		l1.addrandom(9, 10);
		l1.print();
		l1.reversell();
		l1.print();
		
		//l1.reversell();
		//l1.print();
		
	}

}
