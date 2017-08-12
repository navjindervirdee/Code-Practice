public class InsertionSort{
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

	static public void display(int [] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	static public void main(String [] args){
		int [] array ={6,65,2,90,45,32,77,44,20,10,2};
		display(Sort(array));
	}
}
		

	
					
					