public class Queue{
	static class Node{
		int key;
		Node next;
		
		public Node(int data){
			this.key=data;
			this.next=null;
		}
	}
	
	static int size;
	static Node head;
	
	public Queue(){
		size=0;
		head=null;
	}

	static public void enqueue(int number){
		Node node =new Node(number);
		if(head==null){
			head=node;
			size++;
			return;
		}

		Node temp= head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=node;
		size++;
	}

	static public int dequeue(){
		if(head==null){
			return -1;
		}
		int temp = head.key;
		head=head.next;
		size--;
		return temp;
	}
	
	static public void main(String [] args){
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.dequeue();
		queue.enqueue(50);

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}
}
	
		