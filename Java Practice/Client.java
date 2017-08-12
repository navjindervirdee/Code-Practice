import java.io.*;
import java.net.*;

public class Client{

public void go(){
try{
Socket s= new Socket("127.0.0.1", 4242);
InputStreamReader i = new InputStreamReader(s.getInputStream());
BufferedReader b= new BufferedReader(i);

String a= b.readLine();
System.out.println(a);
b.close();
}catch(Exception e){
e.printStackTrace();
}
}

public static void main(String [] args){
Client c= new Client();
c.go();
}
}