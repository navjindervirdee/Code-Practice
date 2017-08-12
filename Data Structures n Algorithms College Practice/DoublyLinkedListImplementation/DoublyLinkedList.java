public class DoublyLinkedList{
	Node head;
	Node tail;
	int size;
	
	public DoublyLinkedList(){
		head=null;
		tail=null;
		size=0;
	}

	public void pushFront(int data){
		Node node = new Node(data);
		if(head==null && tail==null){
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

	public void pushBack(int data){
		Node node = new Node(data);
		if(tail==null && head==null){
			head=node;
			tail=node;
			size++;
			return;
		}

		tail.next=node;
		node.prev=tail;
		tail=node;
		size++;
	}

	public void popFront() throws Exception{
		if(head==null && tail==null){
			throw new Exception("List is empty!");
		}
		if(head==tail){
			head=null;
			tail=null;
			size--;
			return;
		}
		
		head.next.prev=null;
		head=head.next;
		size--;
	}

	public void popBack() throws Exception{
		if(head==null && tail==null){
			throw new Exception("List is empty!");
		}
		if(head==tail){
			head=null;
			tail=null;
			size--;
			return;
		}
		tail.prev.next=null;
		tail=tail.prev;
		size--;
	}
	
	public int topFront() throws Exception{
		if(head==null){
			throw new Exception("List is empty!");
		}
		return head.key;
	}

	public int topBack() throws Exception{
		if(tail==null){
			throw new Exception("List is empty!");
		}
		return tail.key;
	}

	public boolean Find(int data){
		Node temp=head;
		while(temp!=null){
			if(temp.key==data){
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	
	public int size(){
		return size;
	}

	public void forwardDisplay() throws Exception{
		Node temp = head;
		if(temp==null){
			throw new Exception("List is empty!");
		}
		while(temp!=null){
			System.out.print(temp.key + " ");
			temp=temp.next;
		}
		System.out.println();
	}

	public void reverseDisplay() throws Exception{
		Node temp = tail;
		if(temp==null){
			throw new Exception("List is empty!");
		}
		while(temp!=null){
			System.out.print(temp.key + " ");
			temp=temp.prev;
		}
		System.out.println();
	}

	public void remove(int data) throws Exception{
		Node temp = head;
		Node prevNode = null;
		if(temp==null){
			throw new Exception("List is empty!");
		}
		size--;
 		
		if(temp==tail){
			if(temp.key==data){
				head=null;
				tail=null;
				return;
			}
			else{
				throw new Exception("Data not found");
			}
		}
		if(head.key==data){
			head=head.next;
			head.prev=null;
			return;
		}
		while(temp!=null && temp.key!=data){
			prevNode=temp;
			temp=temp.next;
		}
		prevNode.next=prevNode.next.next;
		prevNode.next.prev=prevNode;
		temp=null;
	}
}

	
		
		

		
			
	