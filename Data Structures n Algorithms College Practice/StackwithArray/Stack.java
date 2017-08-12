public class Stack{
	static int [] array;
	static int size;
	static int addPointer;

	public Stack(){
		array=new int[100];
		size=0;
		addPointer=0;
	}
	
	static public void push(int number){
		if(addPointer>=array.length){
			return;
		}
		
		array[addPointer]=number;
		addPointer++;
		size++;
	}
	
	static public int pop(){
		if(addPointer==0){
			return -1;
		}
	
		addPointer--;
		size--;
		return array[addPointer];
		
	}

	static public void display(){
		if(addPointer==0){
			return;
		}
		
		for(int i=0;i<size;i++){
			System.out.print(array[i] + " " );
		}
		System.out.println();
	}
	
	public static void main(String [] args){
		Stack stack = new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.display();

		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
		stack.pop();
		stack.display();
	}
}