public class DoublyLinkedList{
	static class Node{
		int key;
		Node next;
		Node prev;
		
		public Node(int data){
			this.key=data;
			this.next=null;
			this.prev=null;
		}
	}
	
	static Node head;
	static Node tail;
	static int size;

	public DoublyLinkedList(){
		head=null;
		tail=null;
		size=0;		
	}

	public static void pushFront(int number){
		Node node = new Node(number);
		if(head==null){
			head=node;
			tail=node;
			size++;
			return;
		}

		node.next=head;
		head.prev=node;
		head=node;
		size++;
	}

	public static void pushBack(int number){
		Node node =new Node(number);
		if(head==null){
			head=node;
			tail=node;
			size++;
			return;
		}
		
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=node;
		node.prev=temp;
		tail=node;
		size++;
	}

	public static void popFront(){
		if(head==null){
			return;
		}
		if(head.next==null){
			head=null;
			tail=null;
			size--;
			return;
		}
		head=head.next;
		head.prev=null;
		size--;
	}
		
	public static void popBack(){
		if(head==null){
			return;
		}

		if(head.next==null){
			head=null;
			tail=null;
			size--;
			return;
		}
		
		Node temp=head;
		while(temp.next.next!=null){
			temp=temp.next;
		}
		temp.next.prev=null;
		temp.next=null;
		tail=temp;
		size--;
	}

	public static void displayF(){
		if(head==null){
			return;
		}
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.key + " ");
			temp=temp.next;
		}
		System.out.println();
	}
		
	public static void displayB(){
		if(head==null && tail==null){
			return;
		}

		Node temp=tail;
		while(temp!=null){
			System.out.print(temp.key + " ");
			temp=temp.prev;
		}
		System.out.println();
	}
	
	public static void main(String [] args){
		DoublyLinkedList list = new DoublyLinkedList();
		list.pushFront(10);
		list.pushBack(12);
		list.pushFront(8);
		list.pushBack(14);
		list.displayF();
		list.displayB();

		list.popFront();
		list.displayF();
		list.displayB();
		list.popBack();
		list.displayF();
		list.displayB();
		
		list.popFront();
		list.displayB();
		list.popFront();
		list.displayF();
	}
}
		
	
				
		

		
		
		

 