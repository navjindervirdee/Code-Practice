public class BinarySearch{
	public static int binarySearch(int [] sortedArray,int numbertoFind,int firstindexofsortedArray, int lastindexofsortedArray){
		int midIndex = (firstindexofsortedArray + lastindexofsortedArray)/2;

		if(firstindexofsortedArray > lastindexofsortedArray){
			return -1;
		}
		
		if(numbertoFind == sortedArray[midIndex]){
			return midIndex;
		}
		if(numbertoFind < sortedArray[midIndex]){
			return binarySearch(sortedArray, numbertoFind, firstindexofsortedArray, midIndex-1);
		}
		else{
			return binarySearch(sortedArray, numbertoFind, midIndex+1, lastindexofsortedArray);
		}
	}
	
	public static void display(int number){
		System.out.println(number);
	}

	public static void main(String [] args){
		int [] array = {1,2,3,4,5,56,90,100,230};
		display(binarySearch(array,1,0,8));
	}
}
		