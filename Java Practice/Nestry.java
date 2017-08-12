class Nestry{
public static void main(String [] args){
try{
int a= 2;
int b= 42/a;
System.out.println("a= " + " " +a);
try{
if(a==1){
a=a/(a-a);
}
}

catch(ArrayIndexOutOfBoundsException e){
System.out.println("Array" +e);
}
finally{
if(a==2)
{
int c[] ={1};
System.out.println("f");
c[42]=99;
System.out.println("f");
}
}
}
catch(ArithmeticException e){
System.out.println("arithmetic" + e);
}
}
} 