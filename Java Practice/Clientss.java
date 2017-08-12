import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class Clientss{
PrintWriter p;
BufferedReader br;
Scanner input;
Socket s;
InputStreamReader i;

public static void main(String [] args){
new Clients().go();
}

public void go(){
setupNet();
giveOutput();
Thread t= new Thread(new Runj());
t.start();
}

public void setupNet(){
try{
s= new Socket("127.0.0.1", 4242);
i= new InputStreamReader(s.getInputStream());
p= new PrintWriter(s.getOutputStream());
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
System.out.println(a);
}

}
catch(Exception e){
e.printStackTrace();
}
}
}

public void giveOutput(){
input = new Scanner(System.in);
System.out.println("write now");
String b = input.nextLine();
p.println(b);
p.flush();
}

}