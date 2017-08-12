import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class Servers{

PrintWriter p;
BufferedReader br;
Socket s;
ServerSocket ss;
Scanner input;
InputStreamReader i;

public static void main(String [] args){
new Servers().go();
}

public void go(){
setupNet(); 
Thread t= new Thread(new Runj(););
t.start();
}

public void setupNet(){

try{
ss=new ServerSocket(4242);
s= ss.accept();
p= new PrintWriter(s.getOutputStream());
i = new InputStreamReader(s.getInputStream());
br= new BufferedReader(i);
}

catch(Exception e){
System.out.println(e);
e.printStackTrace();
}

}

public class Runj implements Runnable{

public void run(){
String a;
try{
while((a=br.readLine())!=null){
p.println(a);
p.flush();
}
}
catch(Exception e){
e.printStackTrace();
}

}
}

}