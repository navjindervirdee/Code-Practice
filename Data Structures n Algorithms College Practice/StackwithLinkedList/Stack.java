public class Stack{
	static class Node{
		int key;
		Node next;
		
		public Node(int number){
			this.key=number;
			this.next=null;
		}
	}

	static Node head;
	static int size;
	
	public Stack(){
		head=null;
		size=0;	
	}

	static public void push(int number){
		Node node = new Node(number);
		if(head==null){
			head=node;
			size++;
			return;
		}
		Node temp = head;
		while(temp.next!=null){
			temp=temp.next ;
		}
		temp.next=node;
		size++;
	}

	static public int pop(){
		if(head==null){
			return -1;
		}
		Node temp= head;
		if(head.next==null){
			int temp1 = head.key;
			head=null;
			return temp1;
		}

		while(temp.next.next!=null){
			temp=temp.next;
		}
		int temp1 = temp.next.key;
		temp.next=null;
		return temp1;
	}

	static public void display(){
		if(head==null){
			return;
		}
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.key + " " );
			temp=temp.next;
		}
		System.out.println();
	}
	
	static public void main(String [] args){
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);

		stack.display();
		
		stack.pop();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
	}
}	
	
			