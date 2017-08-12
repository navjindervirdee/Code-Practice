public class Inversion{
	static int count=0;
	public static int [] inversionCount(int [] array, int firstIndex, int lastIndex){
		if(firstIndex==lastIndex){
			int [] array3 = {array[firstIndex]};
			return array3;
		}
		int midIndex = (firstIndex + lastIndex)/2;
		int [] array1 = inversionCount(array, firstIndex, midIndex);
		int [] array2 = inversionCount(array, midIndex+1, lastIndex);
		int [] numofInversions = Counter(array1, array2);
		return numofInversions;
	}

	public static int[] Counter(int [] array1, int [] array2){
			int length = array1.length + array2.length;
			int [] sortedArray = new int[length];
			int i=0, j=0;
			for(int k=0; k<length; k++){
				if(i==array1.length){
					for(int l=j; l<array2.length; l++){
						sortedArray[k]=array2[l];
						k++;
					}
					break;
				}
				if(j==array2.length){
					for(int m=i; m<array1.length; m++){
						sortedArray[k]=array1[m];
						k++;
					}
					break;
				}
				if(array1[i]>array2[j]){
					count = count + (array1.length-i);
					sortedArray[k]=array2[j];
					j++;
					continue;
				}
				if(array1[i]<array2[j]){
					sortedArray[k]=array1[i];
					i++;
					continue;
				}
				
			}
			return sortedArray;
	}
					
					
					
	public static void main(String [] args){
		int [] array = {1,1,1,1,1,1};
		int [] array1 = inversionCount(array, 0, 5);
		System.out.println(count);
	}
}
		
