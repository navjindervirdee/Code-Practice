public class MaximumSubArray{
	public static int [] findmaxsubArray(int [] array, int firstIndex, int lastIndex){
			if(firstIndex==lastIndex){
				return new int[]{firstIndex,lastIndex,array[firstIndex]};
			}
			int midIndex = (firstIndex + lastIndex)/2;
 
			int [] leftArray = findmaxsubArray(array,firstIndex,midIndex);
			int [] rightArray = findmaxsubArray(array,midIndex+1,lastIndex);
			int [] crossArray = findmaxCrossArray(array,firstIndex,midIndex,lastIndex);

			
			if(leftArray[2]>=rightArray[2] && leftArray[2]>=crossArray[2]){
				return leftArray;
			}
			else{
				if(rightArray[2]>=leftArray[2] && rightArray[2]>=crossArray[2]){
					return rightArray;
				}
				else{
					return crossArray;
				}
			}
				
	}
	
	private static int [] findmaxCrossArray(int [] array, int firstIndex, int midIndex, int lastIndex){
			int leftSum = Integer.MIN_VALUE;
			int sum=0;
			int maxleftIndex=0;
			for(int i=midIndex; i>firstIndex-1; i--){
				sum = sum + array[i];
				if(sum>leftSum){
					leftSum = sum;
					maxleftIndex = i;
					continue;
				}
			}

			int rightSum = Integer.MIN_VALUE;
			sum=0;
			int maxrightIndex=0;
			for(int i=midIndex+1; i<lastIndex+1; i++){
				sum = sum + array[i];
				if(sum>rightSum){
					rightSum = sum;
					maxrightIndex=i;
					continue;
				}
			}
			
				
			return new int[]{maxleftIndex,maxrightIndex,(leftSum+rightSum)};
	}

	public static void main(String [] args){
		int [] array = {-1,1,-1,1,-1};
		int [] resultArray = findmaxsubArray(array,0,array.length-1);
		System.out.println("SubArray starts from index " + resultArray[0] + " " + "and ends at " + resultArray[1] + " " + "with sum = " + resultArray[2]);    
	}
}				

		