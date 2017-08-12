public class BubbleSort{
	public static int [] bubbleSort(int [] arraytoSort){

		for(int j=0; j<arraytoSort.length-1; j++){
			boolean swapped = false;
			
			for(int i=0; i<arraytoSort.length-1-j; i++){
				if(arraytoSort[i]>arraytoSort[i+1]){
					int temp = arraytoSort[i];
					arraytoSort[i] = arraytoSort[i+1];
					arraytoSort[i+1] = temp;
					swapped=true;
				}
			}

			if(swapped == false){
				break;
			}
		}
		return arraytoSort;
	}

	public static void display(int [] array){
		for(int i=0; i<array.length; i++){
			System.out.print(array[i] + " ");
		}
	}

	public static void main(String []  args){
		int [] array = {30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1};
		display(bubbleSort(array));
	}
} 
			