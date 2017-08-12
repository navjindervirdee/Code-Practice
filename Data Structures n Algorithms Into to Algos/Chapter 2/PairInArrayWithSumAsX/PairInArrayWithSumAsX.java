//Given an array A[] and a number x, check for pair in A[] with sum as x.(LINEAR COMPLEXITY).

import java.util.*;
public class PairInArrayWithSumAsX{
	public static boolean pairFinder(int [] numArray, int numtoFind){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		//insert into map,values in the given array
		for(int i=0; i<numArray.length; i++){
			if(map.containsKey(numArray[i])){
				int z = map.get(numArray[i]);
				z=z + 1;
				map.put(numArray[i],z);
				continue;
			}
			map.put(numArray[i],new Integer(1));
		}
		
		//check for the given number whether the pair in the given array exists or not.
		for(int i=0; i<numArray.length; i++){
			if((numtoFind-numArray[i])==numArray[i] && map.get(numArray[i])==2){
				return true;
			}
			
			if(map.containsKey(numtoFind-numArray[i]) && numtoFind-numArray[i] != numArray[i]){
				return true;
			}	
			     	 
		}
		return false;
		
	}

	public static void main(String [] args){
		int [] array = {10,1,45,2,7,3,3,7};
		System.out.println(pairFinder(array,5));
	}
}
		

			