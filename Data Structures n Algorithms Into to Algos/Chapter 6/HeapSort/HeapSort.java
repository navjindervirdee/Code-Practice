public class HeapSort{
	
	public static void swap(int index1, int index2, int [] array){
		int temp=array[index1];
		array[index1]=array[index2];
		array[index2]=temp;
	}
	
	
	//this function makes binary max-heap using siftDown function
	public static int [] buildHeap(int [] array){
		for(int i=(array.length-1)/2;i>=0;i--){
			siftDown(i,array,array.length);
		}
		return array;
	}

	//this function is used get the given element to its risght place by comparing it with its left and right childs. 
	public static void siftDown(int indexofnumtoSift,int [] array, int size){
		while(indexofnumtoSift<=(size-1)/2){
			int maxIndex=indexofnumtoSift;//this variable keeps record of the final position,where the given element should be.
			
			if(indexofnumtoSift*2+1<=size-1 && array[indexofnumtoSift]<array[indexofnumtoSift*2+1]){
				maxIndex=2*indexofnumtoSift+1;
			}
			if(indexofnumtoSift*2+2<=size-1 && array[maxIndex]<array[indexofnumtoSift*2+2]){
				maxIndex=2*indexofnumtoSift+2;
			}
			if(maxIndex!=indexofnumtoSift){
				swap(maxIndex,indexofnumtoSift,array);
				indexofnumtoSift=maxIndex;
			}
			else{
				break;
			}
		}
	}

	public static int [] heapSort(int [] array){
		array=buildHeap(array);
		int lastElement=array.length-1;
		while(lastElement>0){
			swap(0,lastElement,array);
			siftDown(0,array,lastElement--);
		}
		return array;
	}
	
	public static void display(int [] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
	}
	public static void main(String [] args){
		int [] array={62,68,75,1,10,100,43,97,92,38};
		array=heapSort(array);
		display(array);
	}
}
			
		
