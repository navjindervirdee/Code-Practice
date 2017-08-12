class Expthr{
public static void main(String [] args){

try{
throw new ArithmeticException("div by zero");
}
finally{
System.out.println("final");
}
//catch(ArithmeticException e){
//System.out.println(e);
//}
}
}