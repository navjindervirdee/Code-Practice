public class DequeueImplementation{
	public static void main(String [] args){
		Dequeue queue = new Dequeue(5);
		queue.addRight(10);
		queue.addLeft(20);
		queue.addRight(12);
		queue.addLeft(18);
		queue.addRight(16);
		queue.display();
	}
}