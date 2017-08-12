public class QueueImplementation{
	public static void main(String [] args){
		Queue queue = new Queue(5);
		try{
			System.out.println(queue.empty());
		
			queue.enqueue(10);
			queue.enqueue(12);
			queue.enqueue(14);
			queue.enqueue(16);
			queue.enqueue(18);
			
			System.out.println(queue.size());
			
			System.out.println(queue.dequeue());
			System.out.println(queue.dequeue());
			
			System.out.println(queue.size());
			
			queue.enqueue(20);
			
			System.out.println(queue.empty());
			
			System.out.println(queue.size());
	
			System.out.println(queue.dequeue());
			System.out.println(queue.dequeue());
			System.out.println(queue.dequeue());
			System.out.println(queue.dequeue());
			
			System.out.println(queue.size());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}

		