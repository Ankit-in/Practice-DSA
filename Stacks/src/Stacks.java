class Stack{
	int maxSize;
	int[] stackarr;
	int top;
	
	public Stack(int size) {
		this.maxSize=size;
		this.stackarr=new int[this.maxSize];
		this.top=-1;
		
	}
	public boolean isfull() {
		
			return (top==maxSize-1);
		
	}
	public void push(int value) {
		if(isfull()) {
			System.out.println("Stack is full");
			return ;
		}
		top++;
		stackarr[top]=value;
	}
	
	public boolean isempty() {
		return (top==-1);
	}
	public int pop() {
		if(isempty()) {
			return -1;
		}
		int value = stackarr[top];
        top--;
        return value;
	}
	public int peek() {
		if(isempty()) {
			return -1;
		}
		return stackarr[top];
	}
	public void print() {
		for(int i=top;i>=0;i--) {
			System.out.println(stackarr[i]);
		}
	}
}
public class Stacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s=new Stack(5);
		s.push(2);
		s.push(4);
		s.push(6);
		s.push(8);
		s.pop();
		s.print();
		System.out.println("----------");
		System.out.println(s.peek());
		

	}

}
