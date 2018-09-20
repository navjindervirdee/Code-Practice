//Program to sort the array using QUICK SORT.

public class QuickSort{
	//function to sort the array.
	public static int [] Sort(int [] array, int low, int high){
		if(low>=high){
			return array;
		}
		
		int index = Partititon(array,low,high);
		Sort(array,low,index-1); //sort array from (low:index-1)
		Sort(array,index+1,high); //sort the array from (index:high)
		return array;
	}

	//function to partititon the array such that numbers < pivot-number are before it, and numbers > pivot-number are after it, in the array.
	public static int Partititon(int [] array, int low, int high){
		int pivot = array[low];//pivot-number
		int index=low; //index of pivot-number

		//partititon.
		for(int i=index+1;i<array.length;i++){
			if(array[i]<pivot){
				index++;
				int temp=array[i];
				array[i]=array[index];
				array[index]=temp;
				continue;
			}
		}
		int temp=array[low];
		array[low]=array[index];
		array[index]=temp;

		//return the final index of pivot-number.
		return index;
	}

	//function to display the array.
	public static void display(int [] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	//main function to run the program.
	public static void main(String [] args){
		System.out.println("QUICK SORT");
		int [] array = {56,6,4,10,12,8,16,7,54,34,22,100,56};

		System.out.print("Input array  : ");
		display(array);
		
		System.out.print("Sorted array : ");
		display(Sort(array,0,12));
	}
}
		

			
		