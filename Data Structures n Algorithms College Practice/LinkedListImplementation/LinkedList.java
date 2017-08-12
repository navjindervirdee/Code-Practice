public class LinkedList{
	int data;
	LinkedList nextPointer;
	
	static int numofElements;
	static LinkedList headPointer;
	static LinkedList tailPointer;

	public LinkedList(){
		nextPointer=null;
	}
		

	public void add(int number){
		LinkedList node = new LinkedList();
		node.data=number;
		
		if(numofElements==0){
			headPointer=node;
			tailPointer=node;
		}
		else{
			tailPointer.nextPointer=node;
			tailPointer=node;
		}
		numofElements++;
		
	}

	public void pushFront(int number){
		LinkedList node = new LinkedList();
		node.data=number;
		numofElements++;	
		
		if(headPointer==null){
			headPointer=node;
			tailPointer=node;
		}
		else{
			if(headPointer==tailPointer){
				node.nextPointer=tailPointer;
				headPointer=node;
			}
			else{
				node.nextPointer=headPointer;
				headPointer=node;
			}
		}
	}

	public int topFront()throws Exception{
		if(headPointer==null){
			throw new Exception("LinkedList is empty");
		}
		return headPointer.data;
	}


	public void popFront() throws Exception{
		if(headPointer==null){
			throw new Exception("LinkedList is empty");
		}
		numofElements--; 
		if(headPointer==tailPointer){
			headPointer=null;
			tailPointer=null;
		}
		else{
			headPointer=headPointer.nextPointer;
		}
			
	}

	public void pushBack(int number){
		LinkedList node = new LinkedList();
		node.data=number;
		numofElements++;

		if(tailPointer==null){
			headPointer=node;
			tailPointer=node;
		}
		else{
			tailPointer.nextPointer=node;
			tailPointer=node;
		}
	}

	public int topBack() throws Exception{
		if(tailPointer==null){
			throw new Exception("LinkedList is empty!");
		}
		return tailPointer.data;
	}

	public void display(){
		System.out.print("[ ");
		while(headPointer!=null){
			System.out.print(headPointer.data + " ");
			headPointer=headPointer.nextPointer;
		}
		System.out.print("]");
	}

	public int size(){
		return numofElements;
	}
}
			
