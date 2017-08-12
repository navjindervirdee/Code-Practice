public class SelectionSort{
	public static int [] selectionSort(int [] arraytoSort){
		for(int i=0; i<arraytoSort.length-1; i++){
			int min = i;
			for(int j=i+1; j<arraytoSort.length; j++){
				if(arraytoSort[j] < arraytoSort[min]){
					min = j;
				}
			}
		
			if(min != i){
				int temp = arraytoSort[i];
				arraytoSort[i] = arraytoSort[min];
				arraytoSort[min] = temp;
			}
		}
		return arraytoSort;
	}
	
	public static void displayArray(int [] array){
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String [] args){
		int [] array = {5, 4, 1, 6, 3, 2};
		displayArray(selectionSort(array));
	}
} 