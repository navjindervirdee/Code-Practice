//Linear Search.
public class LinearSearch{
	public static int valueSearcher(int [] arraytoSearch, int numbertoSearch){
		for(int i=0; i<arraytoSearch.length; i++){
			if(numbertoSearch == arraytoSearch[i]){
				return i;
			}
		}

		return -1;
	}
	
	public static void displayNumber(int number){
		System.out.println(number);
	}

	public static void main(String [] args){
		int [] array = {1,2,3,4,5,6};
		int number = 9;
		displayNumber(valueSearcher(array, number));
	}

}