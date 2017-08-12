public class MaximumSubArrayofGivenLength{
	
	public static int [] maxsubArray(int [] array, int lengthofsubArray){
		int maxSum =0;
		for(int i=0; i<lengthofsubArray; i++){
			maxSum = maxSum + array[i];
		}
		
		
		int sum = maxSum;
		int startIndex = 0;
		int endIndex = lengthofsubArray-1;
		for(int i=lengthofsubArray; i<array.length; i++){
			sum = sum + array[i] - array[i-lengthofsubArray];
			if(sum>maxSum){
				maxSum = sum;
				startIndex = i-lengthofsubArray+1;
				endIndex=i;
			}
		}
		
		return new int[]{startIndex,endIndex,maxSum};
	}
  	
	public static void display(int [] array){
		System.out.println("Subarray with Maximum sum starts from" + " " + array[0] + " and ends at " + array[1] + " with sum = " + array[2]);
	}
  
	public static void main(String [] args){
		int [] array = {-1,-3,1,4,6,15,0,2};
		display(maxsubArray(array, 3));
	}
}
