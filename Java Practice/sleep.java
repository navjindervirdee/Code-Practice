import java.lang.*;
import java.util.Scanner;
class sleep{
public static void main(String [] args)


throws InterruptedException {

Scanner s= new Scanner(System.in);


int z;

for(int i=1; i<=3;i++){
System.out.println("enter");
z= s.nextInt();

}
Thread.sleep(10000);

for(int i=1; i<=3;i++){
System.out.println("enter");

z= s.nextInt();

}

}
 }