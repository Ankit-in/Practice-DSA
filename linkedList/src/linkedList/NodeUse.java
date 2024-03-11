package linkedList;

public class NodeUse {

	public static void main(String[] args) {
		Node<Integer> n1=new Node<>(10);
		Node<Integer> n2=new Node<>(20);
		Node<Integer> n3=new Node<>(30);
		System.out.print(n1.next);
		System.out.print("->");
		System.out.print(n2.data);
		System.out.print("->");
		System.out.print(n3.data);
		System.out.print("->");
		System.out.print(n3.next);
		

	}

}
