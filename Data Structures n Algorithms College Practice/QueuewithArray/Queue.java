public class Queue{
	static int [] array;
	static int size;
	static int addPointer;
	static int removePointer;
	
	public Queue(int size){
		array=new int[size+1];
		this.size=0;
		addPointer=0;
		removePointer=0;
	}

	static public void enqueue(int number){
		if(addPointer+1==removePointer){
			return;
		}
		if(addPointer==array.length-1){
			if(removePointer==0){
				return;
			}
			else{
				array[addPointer]=number;
				addPointer=0;	
				size++;
				return;
			}
		}
	
		array[addPointer]=number;
		addPointer++;
		size++;
	}
	
	static public int dequeue(){
		if(removePointer==addPointer){
			return -1;
		}

		if(removePointer==array.length-1){
			int temp =array[removePointer];
			removePointer=0;
			return temp;
		}
		removePointer++;
		size--;
		return array[removePointer-1];
	}
	
	static public void main(String [] args){
		Queue queue = new Queue(5);
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);

		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());

		queue.enqueue(20);
		
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		
	}
}
					
		
	
	
	