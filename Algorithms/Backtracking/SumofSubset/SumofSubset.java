import java.util.*;
public class SumofSubset{
	private static void display(int [] array, int [] x){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " " + x[i] + " , " );
		}
		System.out.println("next");
	}

	public static void sumofSubset(int sum, int k, int left, int [] array, int [] x, int num){
		
		if(k<array.length && sum + array[k]<=num){
			x[k]=1;
			if(sum + array[k]==num){
				display(array,x);
			}
			else{
				sumofSubset(sum+array[k],k+1,left-array[k],array,x,num);
			}
		}
		if(k<array.length){
			x[k]=0;
			if(k+1<array.length  && sum+left-array[k]>=num && sum+array[k+1]<=num){
				sumofSubset(sum,k+1,left,array,x,num);
			}
		}
	}
	
	public static void main(String [] args){
		int [] array = {3,4,5,6};
		int [] x = new int[array.length];
		Arrays.fill(x,0);
		sumofSubset(0,0,18,array,x,13);
	}		
}
		
//{8,9,14,15,16,22,26,32};53