public class ArrayList{
	
	int [] array;
	int numofElements;
	int addPointer;
	
	public ArrayList(){
		array = new int[4];
		numofElements=0;
		addPointer=0;
	}
	
	public int getElement(int index){
		return array[index];
	}

	public void setValue(int value, int index){
		array[index]=value;
	}
	
	public void addElement(int number){
		if(addPointer>array.length-1){
			int [] newArray = new int[2*array.length];
			for(int i=0;i<array.length;i++){
				newArray[i]=array[i];
			}
			array=newArray;
			array[addPointer]=number;
			addPointer++;
			numofElements++;
			newArray=null;
		}
		else{
			array[addPointer]=number;
			addPointer++;
			numofElements++;
		}
	}

	public void removeElement(int index){
		for(int i=index;i<numofElements-1;i++){
			array[i]=array[i+1];
		}
		numofElements--;
		addPointer--;
	}

	public int size(){
		return numofElements;
	}
}

 
	
		

	