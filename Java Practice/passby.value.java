class passbyvalue{
public static void main(String [] args){
int x=10;
System.out.println("x ="+" "+x);
void go(int z){
System.out.println(z);
z=0;
System.out.println(z);
}
System.out.println(x);
}
}