public class QuickSort{
	public static int [] Sort(int [] array, int low, int high){
		if(low>=high){
			return array;
		}

		int index = Partititon(array,low,high);
		Sort(array,low,index-1);
		Sort(array,index+1,high);
		return array;
	}

	public static int Partititon(int [] array, int low, int high){
		int pivot = array[low];
		int index=low;
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

		return index;
	}

	public static void display(int [] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String [] args){
		int [] array = {56,6,4,10,12,8,16,7,54,34,22,100,56};
		display(Sort(array,0,12));
	}
}
		

			
		