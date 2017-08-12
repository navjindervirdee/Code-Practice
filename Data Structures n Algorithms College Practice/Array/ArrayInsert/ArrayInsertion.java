public class ArrayInsertion{
public static int [] insert(int [] array, int numbertoinsert, int indextoinsertat,int numofelements){
	for(int i=numofelements+1; i>=indextoinsertat; i--){
		array[i] = array[i-1];
	}
	array[indextoinsertat]=numbertoinsert;
	return array;
}

public static void display(int [] array,int numofelements){
	for(int i=0;i<numofelements+1;i++){
		System.out.println(array[i]);
	}
}

public static void main(String [] args){
	int [] array = new int[10];
	array[0]=1;
	array[1]=5;
	array[2]=56;
	array[3]=12;
	array[4]=2;
	array[5]=90;
	display(insert(array,16,4,6),6);
}
}	 
		