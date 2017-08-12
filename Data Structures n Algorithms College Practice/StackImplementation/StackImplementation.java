public class StackImplementation{
	public static void main(String [] args){
		MyStack stack = new MyStack(5);
		try{
			stack.push(10);
			stack.push(12);
			stack.push(14);

			System.out.println(stack.top());

			stack.push(16);
			stack.push(18);
			
			stack.displayStack();
			System.out.println("Size = "+stack.size());
			
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			stack.pop();
			
			stack.displayStack();
			System.out.println("Size = "+stack.size());
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
		 