public class Node{
	int data;
	Node next;

	public static void main(String [] args){
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		Node node4 = new Node();
		Node node5 = new Node();
		Node node6 = new Node();
		Node node7 = new Node();
		Node head = node1;

		node1.data = 10;
		node1.next = node2;
		node2.data = 2;
		System.out.println(head.next);
		node2.next = node3;
		node3.data = 9;
		node3.next = node4;
		node4.data = 7;
		node4.next = node5;
		node5.data = 18;
		node5.next = node6;
		node6.data = 6;
		node6.next = node7;
		node7.data = 5;
		node7.next=null;

		Node temp = head;
		Node tail = null;
		Node prev = null;
		Node last = null;
		int i=1;
		while(temp.next!=null){
			prev = temp;
			temp=temp.next;
			i++;
		}
		Node lasteven = null;
		if(i%2==0){
			tail = prev;
			lasteven = temp;
		}
		else{
			tail = temp;
		}
		last = tail;
		System.out.println(tail.next + " " + temp.data);
		temp = head;
		
		
		prev = head;
		i = 1;
		
		while(temp!=null && temp!=last){
			if(i%2!=0){
				temp = temp.next;
				i++;
				continue;
			}
			tail.next = temp;
			prev.next = temp.next;
			temp=temp.next;
			System.out.println(tail.data + " next "  +  tail.next.data);
			tail = tail.next;
			tail.next=null;
			
			System.out.println(prev.data + " " + prev.next.data);
			prev = prev.next;
			
			i++;

		}

		temp = head;
		while(temp!=null){
			System.out.print(temp.data + "->");
			temp=temp.next;
		}



	}		
}

