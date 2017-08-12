public class MergeSort{
	//this function divides the array into two subarrays, based on value of midIndex.
	public static int [] mergeSort(int [] arraytoSort, int firstIndex, int lastIndex){
		if(firstIndex == lastIndex){
			int [] tempArray = {arraytoSort[firstIndex]};
			return tempArray;
		}

		int midIndex = (firstIndex+lastIndex)/2;
		int [] array1 = mergeSort(arraytoSort, firstIndex, midIndex);
		int [] array2 = mergeSort(arraytoSort, midIndex+1, lastIndex);
		int [] sortedArray = arrayMerger(array1 , array2);
		
		return sortedArray;
	}

	//this function merges the subarrays and put all the values of both arrays int sorted array.
	public static int [] arrayMerger(int [] array1, int [] array2){
		int i=0, j=0, k=0;
		int [] sortedArray = new int[array1.length + array2.length]; 
		
		while(true){
			//if all elements of first array are added in sorted array,
			//then put rest of elements of second array in sorted array.
			if(i == array1.length){
				for(int l=j; l<array2.length; l++){
					sortedArray[k] = array2[l];
					k++;
				}
				break;
			}

			//if all elements of second array are added in sorted array,
			//then put rest of elements of first array in sorted array.
			if(j == array2.length){
				for(int l=i; l<array1.length; l++){
					sortedArray[k] = array1[l];
					k++;
				}
				break;
			}
			
			//compare values in both arrays.
			if(array1[i]<array2[j]){
				sortedArray[k] = array1[i];
				i++;
				k++;
			}
			else{
				sortedArray[k] = array2[j];
				j++;
				k++;
			}
		}
		return sortedArray;
	}

	//this function displays the array.
	public static void display(int [] array){
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String [] args){
		int [] array = {1,5,1,0,5};
		display(mergeSort(array , 0, 4));
	}
}
				