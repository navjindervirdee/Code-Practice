public class QuickSort{
	private static void swap(int [] array, int indexA, int indexB){
		int temp = array[indexA];
		array[indexA]=array[indexB];
		array[indexB]=temp;
	}
 
	private static int partitioning(int [] array, int firstIndex, int lastIndex){
		int pivotNumber = array[firstIndex];
		int indexofpivotNumber = firstIndex;
	
		for(int i=indexofpivotNumber+1; i<=lastIndex; i++){
			if(array[i]<pivotNumber){
				indexofpivotNumber++;
				swap(array, indexofpivotNumber, i);
				continue;
			}
		}
		swap(array, firstIndex, indexofpivotNumber);
		return indexofpivotNumber;
	}

	private static int [] quickSort(int [] array, int firstIndex, int lastIndex){
		if(firstIndex<lastIndex){
			int index = partitioning(array, firstIndex, lastIndex);
			array=quickSort(array, firstIndex, index-1);
			array=quickSort(array,index+1,lastIndex);
	
		}
		return array;
	}

	public static void displayArray(int [] sortedArray){
		for(int i = 0; i<sortedArray.length; i++){
			System.out.print(sortedArray[i] + " ");
		}
	}		

	public static void main(String [] args){
		int [] array = {56,6,4,10,12,8,16,7,54,34,22,100,56};
		displayArray(quickSort(array, 0, 12));
		String s= "abc";
		for(int i=0; i<s.length(); i++){
			System.out.println(s[i]);
		}
	}
}

				
		