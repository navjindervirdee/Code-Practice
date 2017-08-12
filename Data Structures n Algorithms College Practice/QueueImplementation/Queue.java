import java.lang.Exception;
public class Queue{
	int addPointer;
	int removePointer;
	int sizeofQueue;
	int [] array;

	public Queue(int size){
		addPointer=0;
		removePointer=0;
		sizeofQueue=0;
		array=new int[size+1];//because addPointer and removePointer cannot point at same index,so in order to create a buffer i.e space of one box or index between them.
	}
	
	public void enqueue(int number) throws Exception{
		//if addPointer point at last position so we have to check whether removePointer points at 0 position or not before adding an element at the last position,to maintain a space between the pointers.
		if(addPointer==array.length-1){
			if(addPointer+1-array.length==removePointer){
				throw new Exception("Cannot enqueue, Queue is full"); 
			}
			array[addPointer]=number;
			sizeofQueue++;
			addPointer=0;
		}
		else{
			if(addPointer+1==removePointer){
				throw new Exception("PCannot enqueue, Queue is full"); 
			}
			array[addPointer]=number;
			sizeofQueue++;
			addPointer++;
		}
	}

	public int dequeue() throws Exception{
		if(sizeofQueue==0){
			throw new Exception("Cannot remove, Queue is Empty");
		}
		if(removePointer==array.length-1){
			removePointer=0;
		}
		sizeofQueue--;
		removePointer++;
		return array[removePointer-1];
	}

	public boolean empty(){
		if(sizeofQueue==0){
			return true;
		}
		return false;
	}

	public int size(){
		return sizeofQueue;	
	}
}	


	
	