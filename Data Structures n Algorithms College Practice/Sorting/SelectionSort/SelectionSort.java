public class SelectionSort{
	static public int [] Sort(int [] array){
		
		for(int i=0;i<array.length;i++){
			int min=Integer.MAX_VALUE;
			int index=-1;
			for(int j=i;j<array.length;j++){
				if(array[j]<min){
					min=array[j];
					index=j;
				}
			}
			int temp = array[i];
			array[i]=array[index];
			array[index]=temp;
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
	

					
			