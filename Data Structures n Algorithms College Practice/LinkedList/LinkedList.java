public class LinkedList{
	static class Node{
		int key;
		Node next;
		
		public Node(int data){
			this.key=data;
			this.next=null;
		}
	}

	static Node head;
	static int size;
	
	
	public LinkedList(){
		head=null;
		size=0;
	}

	static public void pushFront(int number){
		Node node = new Node(number);
		if(head==null){
			head=node;
			size++;
			return;
		}

		node.next=head;
		head=node;
		size++;
	}

	static public void pushBack(int number){
		Node node = new Node(number);
		if(head==null){
			head=node;
			size++;
			return;
		}
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=node;
		size++;
	}

	static public void popFront(){
		if(head==null){
			return;
		}
		
		head=head.next;
		size--;
	}

	static public void popBack(){
		if(head==null){
			return;
		}
		
		if(head.next==null){
			head=null;
			size--;
			return;
		}
		
		Node temp=head;
		while(temp.next.next!=null){
			temp=temp.next;
		}
		temp.next=null;
		size--;
	}

	static public void pop(int position){
		if(head==null){
			return;
		}
		if(position==0){
			head=head.next;
			size--;
			return;
		}
			
		Node temp=head;
		int x=0;
		while(temp.next!=null && x<position-1){
			temp=temp.next;	
			x++;
		}
		
		
		
		if(temp.next==null){
			return;
		}
		
		temp.next=temp.next.next;
		size--;
	}
		

	static public void display(){
		if(head==null){
			System.out.println(" ");
			return;
		}

		Node temp=head;
		while(temp!=null){
			System.out.print(temp.key +  " ");
			temp=temp.next;
		}
		System.out.println();
	}

	public static void main(String [] args){
		LinkedList list = new LinkedList();
		list.pushFront(10);
		list.pushBack(12);
		list.pushFront(8);
		list.pushFront(6);
		list.pushBack(20);
		list.display();
		
		list.pop(3);
		list.display();
		list.pop(0);
		list.display();
		list.pop(2);
		

		//list.popFront();
		list.display();
	}
}
	