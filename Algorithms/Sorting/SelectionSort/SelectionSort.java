//Program to sort the array using SELECTION SORT.

public class SelectionSort{
	//function to sort the array.
	static public int [] Sort(int [] array){
		for(int i=0;i<array.length;i++){
			//get the min value from the array.
			int min=Integer.MAX_VALUE;
			int index=-1;
			for(int j=i;j<array.length;j++){
				if(array[j]<min){
					min=array[j];
					index=j;
				}
			}

			//swap values.
			int temp = array[i];
			array[i]=array[index];
			array[index]=temp;
		}
		return array;
	}

	//function to display the array.
	static public void display(int [] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	//main function to run the program.
	static public void main(String [] args){
		System.out.println("SELECTION SORT");
		int [] array ={6,65,2,90,45,32,77,44,20,10,2};
	
		System.out.print("Input array  : ");
		display(array);

		System.out.print("Sorted array : ");
		display(Sort(array));
	}
}
	

					
			