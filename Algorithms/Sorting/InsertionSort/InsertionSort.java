//Program to Sort an array using INSERTION SORT.

public class InsertionSort{
	//function to sort the array.
	static public int [] Sort(int [] array){
		for(int i=1;i<array.length;i++){
			int j=i-1;
			int num=array[i];
			while(j>-1 && array[j]>num){
				int temp = array[j+1];
				array[j+1]=array[j];
				array[j]=temp;
				j--;
			}
		}
		return array;
	}

	//function to display the array
	static public void display(int [] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	//main function to run the program.
	static public void main(String [] args){
		System.out.println("INSERTION SORT");
		int [] array ={6,65,2,90,45,32,77,44,20,10,2};

		System.out.print("Input Array  : ");
		display(array);

		System.out.print("Sorted Array : ");
		display(Sort(array));
	}
}
		

	
					
					