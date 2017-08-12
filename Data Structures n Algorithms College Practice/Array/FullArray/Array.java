import java.util.*;
public class Array{
	static int [] array;
	static int size;
	
	public Array(){
		array=new int[100];
		size=0;
	}

	static public void getValues(){
		Scanner input = new Scanner(System.in);
		int numofElem = input.nextInt();
		size=numofElem;
		for(int i=0;i<size;i++){
			array[i]=input.nextInt();
		}
	} 
	
	static public void insert(int number,int position){
		for(int i=size-1;i>=position;i--){
			array[i+1]=array[i];
		}
		array[position]=number;
		size++;
	}

	static public void delete(int position){
		for(int i=position;i<size-1;i++){
			array[i]=array[i+1];
		}
		size--;
	}

	static public void display(){
		for(int i=0;i<size;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	static public boolean linearSearch(int number){
		for(int i=0;i<size;i++){
			if(number==array[i]){
				return true;
			}
		}
		return false;
	}

	static public void bubbleSort(){
		for(int i=0;i<size-1;i++){
			for(int j=0;j<size-i-1;j++){
				if(array[j]>array[j+1]){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
	}
				
	
	static public boolean binarySearch(int number,int low, int high){
		if(low>high){
			return false;
		}
		int mid=low + (high-low)/2;
		if(array[mid]==number){
			return true;
		}
		if(array[mid]>number){
			return binarySearch(number,low,mid-1);
		}
		else{
			return binarySearch(number,mid+1,high);
		}
		
	}

	public static void main(String [] args){
		Array array = new Array();
		array.getValues();
		array.display();
		array.insert(10,4);
		array.display();
		array.delete(3);
		array.display();
		System.out.println(array.linearSearch(40));
		array.bubbleSort();
		array.display();
		System.out.println(array.binarySearch(56,0,size));
	}
}
	
			

		
		
		 	