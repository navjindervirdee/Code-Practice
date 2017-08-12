public class EditDistance{

	public static int min(int x , int y, int z){
		if(x<y && x<z){
		 	return x;
		}
		if(y<x && y<z){
			return y;
		}
		return z;
	}

	public static int editdistanceProblem(String a, String b){
		int lengthA = a.length();
		int lengthB = b.length();
		int [][] operation = new int[lengthA+1][lengthB+1];

		for(int i=0; i<lengthA; i++){
			for(int j=0; j<lengthB; j++){
				if(i==0){
					operation[i][j] = j;
				}
				else{ 
					if(j==0){
						operation[i][j] = i;
				        }
				     	else{ 
						if(a.charAt(i-1)==b.charAt(j-1)){
							operation[i][j] = operation[i-1][j-1];
					  	}
					  	else{
							operation[i][j] = 1 + min(operation[i][j-1], operation[i-1][j], operation[i-1][j-1]);
					        }
				       }
			       }
			}
		}
		System.out.println(operation[lengthA-1][lengthB]-1);
		return operation[lengthA][lengthB];
	}

	public static void main(String [] args){
		System.out.println(editdistanceProblem("sunday", "saturday"));
	}
} 