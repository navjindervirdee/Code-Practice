//to add integers in binary.

public class BinaryAddition{
	private static int [] binaryAddition(int [] A, int [] B){
		int numofBits = A.length;
		int carry=0;
		int [] result = new int[numofBits+1];
		for(int i=numofBits-1; i>-1; i--){
			int sum = A[i] + B[i] + carry;
			if(sum==0 || sum==1){
				carry=0;
				result[i+1]=sum;
			}
			else{ 
				if(sum==2){
					carry=1;
					result[i+1]=0;
			     	}
			     	else{
					carry=1;
					result[i+1]=1;
				}
			}
		}
		result[0]=carry;
		return result;
	}
	
	public static void displayResult(int [] result){
		for(int i=0; i<result.length;i++){
			System.out.print(result[i] + " ");
		}
	}
					
							
			
	public static void main(String [] args){

		int [] binNum1 = {1,1,1,1};
		int [] binNum2 = {1,0,1,0};
		displayResult(binaryAddition(binNum1, binNum2));
	}
}
