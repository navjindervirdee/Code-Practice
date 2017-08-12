public class SelectionSort{
	public static int [] selectionSort(int [] arraytoSort){
		for(int i=0; i<arraytoSort.length; i++){
			for(int j=i+1; j<arraytoSort.length; j++){
				if(arraytoSort[i] > arraytoSort[j]){
					int temp = arraytoSort[i];
					arraytoSort[i] = arraytoSort[j];
					arraytoSort[j] = temp;
				}
			}
		}
		return arraytoSort;
	}
	
	public static void displayArray(int [] array){
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
	}

	public static void main(String [] args){
		int [] array = {5, 4, 1, 6, 3, 2};
		displayArray(selectionSort(array));
	}
} 