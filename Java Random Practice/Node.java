public class Node {
     static int data;
     static Node next;
  

public static Node Reverse(Node head) {
    if(head == null){
        return head;
    }
    
    Node current = head;
    Node prev = null;
    Node temp = null;
    while(current != null){
        temp = current.next;
        System.out.println(temp.data);
        current.next = prev;
        System.out.println(current.next.data);
        prev = current;
        System.out.println(prev.data);
        current = temp;
        System.out.println(current.data);
    }
    
    
    
    return prev;

}

public static void main(String []args){
Node node1 = new Node();
Node node2 = new Node();
Node node3 = new Node();
Node node4 = new Node();
node1.data=1;
node2.data=2;
node3.data=3;
node4.data=4;
node1.next=node2;
node2.next=node3;
node3.next=node4;
node4.next=null;
Node head = new Node();
head.data=0;
head.next=node1;

 //Node node = Reverse(head);
//while(head.next != null){
System.out.println(head.next.data);
//head.next=head.next.next;
//}
}
}