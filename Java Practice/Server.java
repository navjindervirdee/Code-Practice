import java.io.*;
import java.net.*;

public class Server {
String advice ="Batley Atley";
public void go(){
try{
ServerSocket ss= new ServerSocket(4242);
while(true){
Socket s= ss.accept();
PrintWriter p = new PrintWriter(s.getOutputStream());
String st= advice;
p.println(st);
System.out.println(st);
}
}
catch(Exception e){
e.printStackTrace();
}
}

public static void main(String [] args){
Server se= new Server();
se.go();
}
}