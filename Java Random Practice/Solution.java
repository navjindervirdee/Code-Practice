import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        //while(true){
	Scanner input = new Scanner(System.in);
	String E = "abc";
	System.out.println(E.charAt(0) + " " + E.charAt(1) + " " + E.charAt(2));
        int Q = 1+(int)(Math.random()*999);
	System.out.println(Q + "t");
        Stack stack = new Stack();
        
        String S = "";
        for(int i=0; i<Q; i++){
            int operation = 1+(int)(Math.random()*5);
	    System.out.println(operation);
            if(operation == 1){
                String W = "abc";
                stack.push(S);
                S=S+W;
                //System.out.println(S.charAt(1) + " " + S.charAt(2) + " " + S.charAt(3));
                System.out.println("1 success" + " " + S);
                continue;
            }
            
            if(operation==2){
                int k = (int)(Math.random()*S.length());
                if(S.length()>=k){
                    stack.push(S);
		    System.out.println(2 + " " + S.length() + " " + S + " " + k + " " + (S.length()-k));
                    S = S.substring(0,(S.length()-k));
                    System.out.println("2 success" + " " + S);
                    continue;
                }
                //System.out.println("2 fail" + " " + S);
            }
            
            if(operation==3){
                int k = 1+(int)(Math.random()*S.length());
                if(S.length()>=k){    
                    
                    System.out.println(S.charAt(k-1));
                    System.out.println("3 success" + " " + S);
                    continue;
                }
                //System.out.println("3 fail" + " " + S);
            }
                
            if(operation==4){
                
                if(stack.isEmpty()==false){
                    S=(String)stack.pop();
                    System.out.println("4 success" + " " + S);
                }
               //System.out.println("4 fail" + " " + S);
            }    
            
        }
	//}
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}