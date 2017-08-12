public class CircularLinkedList{
	static class Node{
		int key;
		Node next;

		public Node(int data){
			this.key=data;
			this.next=null;
		}

	}

	static Node head;

	public CircularLinkedList(){
		head=null;
	}

	static public void pushFront(int number){
		Node node = new Node(number);
		if(head==null){
			head=node;
			node.next=head;
			return;
		}
		if(head.next==head){
			node.next=head;
			head=node;
			node.next.next=head;
			return;
		}
		
		Node temp=head;
		while(temp.next!=head){
			temp=temp.next;
		}

		node.next=head;
		head=node;
		temp.next=head;
	}
		
		
	static public void pushBack(int number){
		Node node = new Node(number);
	
		if(head==null){
			head=node;
			node.next=head;
			return;
		} 		
		
		if(head.next==head){
			head.next=node;
			node.next=head;
			return;
		}
		Node temp = head;
		while(temp.next!=head){
			temp=temp.next;
		}
		temp.next=node;
		node.next=head;
	}

	public static void popFront(){
		if(head==null){
			return;
		}

		if(head.next==head){
			head=null;
			return;
		}
		
		Node temp=head;
		while(temp.next!=head){
			temp=temp.next;
		}
		head=head.next;
		

		temp.next=head;
	}

	public static void popBack(){
		if(head==null){
			return;
		}
		
		if(head.next==head){
			head=null;
			return;
		}

		Node temp=head;
		while(temp.next.next!=head){
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}

	public static void display(){
		if(head==null){
			return;
		}

		Node temp=head;
		while(temp.next!=head){
			System.out.print(temp.key + " ");
			temp=temp.next;
		}
		System.out.println(temp.key);
	}

	public static void main(String [] args){
		CircularLinkedList list = new CircularLinkedList();
		list.pushFront(10);
		list.pushBack(12);
		list.pushFront(8);
		list.pushBack(14);

		list.display();

		list.popFront();
		list.display();

		list.popBack();
		list.display();
		list.popBack();
		list.popBack();
		list.display();
	}
}

		

			
		