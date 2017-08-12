import java.lang.Integer;
public class PriorityQueue{

	int [] array;
	int addPointer;


	public PriorityQueue(int size){
		array=new int[size];
		addPointer=0;
	}

	private void swap(int index1,int index2){
		int temp=array[index1];
		array[index1]=array[index2];
		array[index2]=temp;
	}

	//this function compares element at the given index with its parent and swaps them, till max-heap property is not satisfied.//
	private void siftUp(int indexofnumtoSift){
		while(indexofnumtoSift>0){
			if(array[(indexofnumtoSift-1)/2]<array[indexofnumtoSift]){
				swap((indexofnumtoSift-1)/2,indexofnumtoSift);
				indexofnumtoSift=(indexofnumtoSift-1)/2;
				continue;
			}
			else{
				break;
			}
		}
	}

	//this function compares the element at the given index with its childrens and swaps them, until the max-heap property is not satisfied.This function could only use index parameter if we store numofelements as instance 			//variable.//
	private void siftDown(int indexofnumtoSift,int indexuptosiftDown){
		while(indexofnumtoSift<=(indexuptosiftDown-1)/2){
			int maxIndex=indexofnumtoSift;
			if(indexofnumtoSift*2+1<=indexuptosiftDown && array[indexofnumtoSift]<array[indexofnumtoSift*2+1]){
				maxIndex=indexofnumtoSift*2+1;
			}
			if(indexofnumtoSift*2+2<=indexuptosiftDown && array[maxIndex]<array[indexofnumtoSift*2+2]){
				maxIndex=indexofnumtoSift*2+2;
			}	
			if(maxIndex!=indexofnumtoSift){
				swap(indexofnumtoSift,maxIndex);
				indexofnumtoSift=maxIndex;
				continue;
			}
			else{
				break;
			}
		}
	}

	//this function insert the element at the end and sift it up until max-heap property is not satisfied.//
	public void insert(int number) throws Exception{
		if(addPointer>array.length-1){
			throw new Exception("Cannot insert,Size overflow error!");
		}
		array[addPointer]=number;
		siftUp(addPointer);
		addPointer++;
	}

	//this function extracts the max element.In this we first swap the first element with last and then siftdown the first element upto the secondlast elelment because last is the max element.//
	public int extractMax() throws Exception{
		if(addPointer==0){
			throw new Exception("PriorityQueue is empty");
		}
		int numtoExtract=array[0];
		swap(0,addPointer-1);
		addPointer--;
		siftDown(0,addPointer-1);
		return numtoExtract;
	}

	//this function returns the max element.//
	public int getMax() throws Exception{
		if(addPointer==0){
			throw new Exception("PriorityQueue is empty.");
		}	
		return array[0];
	}

	//this function changes the priority and sift the element up or down according to newValue of element.//
	public void changePriority(int indexofElement, int newValue){
		if(array[indexofElement]>newValue){
			array[indexofElement]=newValue;
			siftDown(indexofElement,addPointer-1);
		}
		else{
			array[indexofElement]=newValue;
			siftUp(indexofElement);
		}
	}

	//this function removes the element at the given index.//
	public void remove(int index){
		array[index]=Integer.MAX_VALUE;
		siftUp(index);
		try{
			extractMax();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}











				
			 
			
		
		
		