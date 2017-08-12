public class MatrixChainMul{
	static int [][] s;
	public static int matrixMul(int [] array){
		int [][] numMul = new int[array.length-1][array.length-1];
		s= new int[array.length-1][array.length-1];
		for(int i=0;i<numMul.length;i++){
			numMul[i][i]=0;
		}

		for(int l=2;l<array.length;l++){
			for(int i=1;i<array.length-l+1;i++){
				int j = i+l-1;
				numMul[i-1][j-1]=Integer.MAX_VALUE;
				for(int k=i;k<j;k++){
					int q = numMul[i-1][k-1] + numMul[k][j-1] + array[i-1]*array[k]*array[j];
					if(numMul[i-1][j-1]>q){
						numMul[i-1][j-1]=q;
						s[i-1][j-1]=k-1;
					}
				}
			}
		}
		return numMul[0][array.length-2];
	}

	public static void display(int i, int j){
		if(i==j){
			System.out.print(i+1);
		}
		else{
			System.out.print("(");
			display(i,s[i][j]);
			display(s[i][j]+1,j);
			System.out.print(")");
		}
	}

	public static void main(String [] args){
		int [] array = {10,20,30,40,30};
		System.out.println(matrixMul(array));
		display(0,s.length-1);
	}
}
		