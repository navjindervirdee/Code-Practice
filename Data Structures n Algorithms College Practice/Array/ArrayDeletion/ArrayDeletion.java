public class ArrayDeletion{

private static int [] delete(int [] array, int indextodeleteAt){
       	//you can another check(if statement) for index more than length of array OR less than 0 OR given array is empty
	
	if(indextodeleteAt == array.length-1){
		return array;
	}
		
	for(int i=indextodeleteAt; i<array.length-1; i++){
		array[i]=array[i+1];
	}
	return array;
}

public static void display(int [] array){
	for(int i=0;i<array.length-1;i++){
		System.out.print(array[i] + " ");
	}
}

public static void main(String [] args){
	int [] array = {1,6,34,0,2,43};
	display(delete(array,5));
}
}
	
		