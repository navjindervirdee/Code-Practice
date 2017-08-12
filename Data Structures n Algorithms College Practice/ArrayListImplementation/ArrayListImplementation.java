public class ArrayListImplementation{
	public static void main(String [] args){
		ArrayList list = new ArrayList();
		
		list.addElement(10);
		System.out.println(list.getElement(0));
		
		list.setValue(12,0);
		System.out.println(list.getElement(0));
		
		list.addElement(14);
		list.addElement(16);
		list.addElement(18);
		list.addElement(20);
		
		System.out.println(list.size());
		
		list.removeElement(0);
		list.addElement(22);
		list.removeElement(3);
		
		System.out.println(list.size());

		for(int i=0;i<list.size();i++){
			System.out.println(list.getElement(i));
		}
	}
}
		
		
