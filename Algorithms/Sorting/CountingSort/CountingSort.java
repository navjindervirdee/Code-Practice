//Program to Sort an array of integers using COUNTING SORT.

public class CountingSort{
	//function to sort the array.
	//numRange defines the range in which the numbers in the array are. e.g numbers in the array can be between 0-6, or 0-10.
	public static int [] Sort(int [] array, int numRange){
		//array to store how many times each number appeared in the array.
		int [] count = new int[numRange+1];

		//initialize with zeros.
		for(int i=0;i<count.length;i++){
			count[i]=0;
		}

		//getting the counts of each number.
		for(int i=0;i<array.length;i++){
			count[array[i]]++;
		}

		//getting the positions of the numbers.
		count[0]=count[0]-1;
		for(int i=1;i<count.length;i++){
			count[i] = count[i-1] + count[i];
		}

		//sorted array.
		int [] newArray = new int [count[count.length-1]+1];
		for(int i=array.length-1;i>-1;i--){
			newArray[count[array[i]]] = array[i];
			count[array[i]]--;
		}
		return newArray;
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
		System.out.println("COUNTING SORT");
		int [] array = {1,6,6,3,5,2,1,2,3,3,3,1,6,1,0,0,6,5,4};

		System.out.print("Input array  : ");
		display(array);

		System.out.print("Sorted Array : ");
		display(Sort(array,6));
	}
}

			
			
				