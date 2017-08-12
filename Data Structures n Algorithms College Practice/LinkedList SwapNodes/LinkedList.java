public class LinkedList{
	static class Node{
		int key;
		Node next;
	
		public Node(int data){
			this.data=key;
			this.next=null;
		}
	}

	static Node head;

	public LinkedList(){
		head=null;
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
	
	public static void swap(){
		if(head==null || head.next==null){
			return;
		}
		Node temp=head;
		Node headNode = head;
		while(temp.next!=null){
			temp=temp.next;
		}
		int data = headNode.key;
		headNode.key=temp.key;
		temp.key=data;
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
	
		list.swap();
		list.display();
	}
}
		
