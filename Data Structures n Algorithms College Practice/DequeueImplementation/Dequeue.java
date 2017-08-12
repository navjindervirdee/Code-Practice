public class Dequeue{
	int rightPointer;
	int leftPointer;
	int capacity;
	int size;
	int [] array;

	public Dequeue(int length){
		array=new int[length];
		size=0;
		rightPointer=-1;
		leftPointer=length;
		capacity=length;
	}

	public void addRight(int data){
		if(rightPointer+1==leftPointer){
			return;
		}
		if(rightPointer==capacity-1){
			if(leftPointer==0){
				return;
			}
			else{
				rightPointer=0;
				array[rightPointer]=data;
			}
		}
		
		rightPointer++;
		array[rightPointer]=data;
	}
	
	public void addLeft(int data){
		if(leftPointer-1==rightPointer){
			return;
		}
		if(leftPointer==0){
			if(rightPointer==capacity-1){
				return;
			}
			else{
				leftPointer=capacity-1;
				array[leftPointer]=data;
			}
		}
		leftPointer--;
		array[leftPointer]=data;
	}

	public void display(){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
			
	