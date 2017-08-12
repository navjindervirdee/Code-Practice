public class NQueen{
	private static boolean isSafe(int [][] board, int row, int col){
		for(int i=col;i>-1;i--){
			if(board[row][i]==1){
				return false;
			}
		}

		for(int i=row, j=col;i>-1 && j>-1;i--, j--){
			if(board[i][j]==1){
				return false;
			}
		}
		
		for(int i=row, j=col;i<board.length && j>-1; i++, j--){
			if(board[i][j]==1){
				return false;
			}
		}
		return true;
	}

	public static boolean solveQueen(int [][] board,int col){
		if(col==board.length){
			display(board);
			return true;
		}
		for(int i=0;i<board.length;i++){
			if(isSafe(board,i,col)){
				board[i][col]=1;
				if(solveQueen(board,col+1)==false){
					board[i][col]=0;
					continue;
				}
				else{
					true;
				}
			}
		}
		return false;
	}

	private static void display(int [][] board){
		for(int i=0;i<board.length;i++){
			for(int j=0;j<board.length;j++){
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String [] args){
		int [][] board ={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		solveQueen(board,0);
	}
}
		
			
			
	