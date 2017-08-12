public class DoublyLinkedListImplementation{
	public static void main(String [] args){
		DoublyLinkedList list = new DoublyLinkedList();
		try{
			list.pushBack(10);
			list.pushBack(20);
			list.pushFront(8);
			list.pushFront(6);
			list.pushBack(22);
			list.pushBack(16);

			System.out.println("Front element : " + list.topFront());
			System.out.println("Last element : " + list.topBack());
			System.out.println("List size : " + list.size());
			
			System.out.println("Forward list display : ");
			list.forwardDisplay();
		
			System.out.println("Removed 6 ");
			list.remove(6);
			list.reverseDisplay();
		
			System.out.println("Find 8 : " + list.Find(8));
			
			System.out.println("Removed from front");
			list.popFront();
			
			System.out.println("List size : " + list.size());
			
			System.out.println("Forward list display");		
			list.forwardDisplay();
		
			System.out.println("Removed from back");
			list.popBack();
		
			System.out.println("Find 20 : " + list.Find(20));
			System.out.println("List size : " + list.size());
		
			System.out.println("Reverse list display");
			list.reverseDisplay();
		
			System.out.println("Removed from front");
			list.popFront();
		
			System.out.println("List size : " + list.size());
		
			System.out.println("Forward list display");
			list.forwardDisplay();
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	}
}
			