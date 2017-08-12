import java.io.*;
class BRread{
public static void main(String [] args)throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String c;
do {
 c=br.readLine();
System.out.println(c);
}while(!c.equals("stop"));
}
}
