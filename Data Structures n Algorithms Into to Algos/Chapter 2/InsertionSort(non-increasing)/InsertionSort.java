public class InsertionSort{
	
	public static int [] insertionSort(int [] numberstoSort){
			int number;
		for(int j=1; j<numberstoSort.length; j++){
			number = numberstoSort[j];
			
			int i=j-1;
			while(i >= 0 && numberstoSort[i] < number){
				numberstoSort[i+1] = numberstoSort[i];
				i = i-1;
			}

			numberstoSort[i+1] = number;
		}
		
		return numberstoSort;
	}

	public static void displaysortedArray(int [] sortedArray){
		for(int i=0; i<sortedArray.length; i++){
			System.out.print(sortedArray[i] + " ");
		}
	}


	public static void main(String [] args){
		int [] array = {5, 2, 4, 6, 1, 3};
		displaysortedArray(insertionSort(array));
	}
}