import java.io.*;
public class Cons{
public static void main(String [] args) throws IOException{
String str;
Console con;

con=System.console();

if(con==null) return;

str=con.readLine("Enter a String : ");
con.printf("HEre ur String : %s", str);
}
}
