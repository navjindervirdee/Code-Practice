import java.lang.*;
import java.util.Scanner;
class game{
public static void main(String [] args){
int secret;
secret= 1 + (int)(Math.random()*(((100-1) + 1)));
Scanner s= new Scanner(System.in);
int z;
z= s.nextInt();
while(z!=secret){
if(z>secret){
System.out.println("guessing high");
}
else {
System.out.println("guessing low");

}
z= s.nextInt();
}



}
}