public class MergeSort{
	static public int [] Sort(int [] array, int low, int high){
		if(low==high){
			int [] tempArray = {array[low]};
			return tempArray;
		}

		int mid = low + (high-low)/2;
		int [] array1 = Sort(array,low,mid);
		int [] array2 = Sort(array,mid+1,high);
		int [] newArray = Merge(array1,array2);
		return newArray;
	}

	static private int [] Merge(int [] array1, int [] array2){
		int [] newArray = new int[array1.length+array2.length];
		
		int i=0;
		int j=0;
		int k=0;

		while(k<newArray.length){
			if(i>array1.length-1 || j>array2.length-1){
				if(i>array1.length-1){
					for(int l=j;l<array2.length;l++){
						newArray[k]=array2[l];
						k++;
					}
					return newArray;
				}

				else{
					for(int l=i;l<array1.length;l++){
						newArray[k]=array1[l];
						k++;
					}
					return newArray;
				}
			}
				
			

			if(array1[i]>array2[j]){
				newArray[k]=array2[j];
				k++;
				j++;
				continue;
			}

			else{
				newArray[k]=array1[i];
				k++;
				i++;
				continue;				
			}
		}
		return newArray;
	}
	
	static public void display(int [] array){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String [] args){
		int [] array ={6,65,2,90,45,32,77,44,20,10,2};
		display(Sort(array,0,10));
	}
}
			
		