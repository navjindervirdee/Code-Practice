import java.lang.Exception;
public class MyStack{
	
	int topPointer;
	int [] arraytostoreStack;
		
	public MyStack(int size){
		topPointer=-1;
		arraytostoreStack=new int[size];
	}

	public void push(int number) throws Exception {
		if(topPointer>=arraytostoreStack.length-1){
			throw new Exception("Cannot push,Stack is full");
		}
		else{
			topPointer=topPointer+1;
			arraytostoreStack[topPointer]=number;
		}
	}

	public int top() throws Exception{
		if(topPointer==-1){
			throw new Exception("Stack is empty.");
		}
		return arraytostoreStack[topPointer];
	}

	public int pop() throws Exception {
		if(topPointer==-1){
			throw new Exception("Cannot pop,Stack is empty.");
		}
		int topElement=arraytostoreStack[topPointer];
		topPointer=topPointer-1;
		return topElement;
	}
	
	public int size(){
		return topPointer+1;
	}
	
	public void displayStack(){
		System.out.print("[" + " ");
		for(int i=0;i<=topPointer;i++){
			System.out.print(arraytostoreStack[i]+" ");
		}
		System.out.println("]"); 
	}
}
		
		

	
		