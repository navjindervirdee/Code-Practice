public class BubbleSort{
	public static int [] bubbleSort(int [] arraytoSort){
		
			for(int j=0; j<arraytoSort.length-1; j++){
				for(int i=arraytoSort.length-1; i>0; i--){
					if(arraytoSort[i]<arraytoSort[i-1]){
						int temp = arraytoSort[i];
						arraytoSort[i] = arraytoSort[i-1];
						arraytoSort[i-1] = temp;
					}
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
		int [] array = {1,4,3,6,2};
		display(bubbleSort(array));
	}
} 
	