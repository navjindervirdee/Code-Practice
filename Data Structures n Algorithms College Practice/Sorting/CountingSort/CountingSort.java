public class CountingSort{
	public static int [] Sort(int [] array, int numRange){
		int [] count = new int[numRange+1];
		for(int i=0;i<count.length;i++){
			count[i]=0;
		}
		//System.out.println("Success");
		for(int i=0;i<array.length;i++){
			count[array[i]]++;
		}
		//System.out.println("Success");
		//display(count);
		count[0]=count[0]-1;
		for(int i=1;i<count.length;i++){
			count[i] = count[i-1] + count[i];
		}
		display(count);
		//System.out.println("Success");
		int [] newArray = new int [count[count.length-1]+1];
		for(int i=array.length-1;i>-1;i--){
			newArray[count[array[i]]] = array[i];
			count[array[i]]--;
		}
		//System.out.println("Success");
		return newArray;
	}
	
	public static void display(int [] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String [] args){
		int [] array = {1,6,6,3,5,2,1,2,3,3,3,1,6,1,0,0,6,5,4};
		display(Sort(array,6));
	}
}

			
			
				