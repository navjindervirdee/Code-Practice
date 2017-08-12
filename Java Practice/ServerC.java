import java.io.*;
import java.net.*;
import java.util.*;
public class ServerC{

ArrayList clientoutstreams;

public class ClientHandler implements Runnable{
BufferedReader br;
Socket s;

public ClientHandler(Socket client){
try{
s=client;
InputStreamReader i = new InputStreamReader(s.getInputStream());
br= new BufferedReader(i);
}
catch(Exception e){
System.out.println(e);
}
}

public void run(){
String mes;
try{
while((mes=br.readLine())!=null){
tellEveryone(mes);
}
}
catch(Exception e){
System.out.println(e);
}
}

}

public static void main(String []  args){
new ServerC().go();
}

public void go(){
clientoutstreams = new ArrayList();
try{
ServerSocket ss = new ServerSocket(5000);
while(true){
Socket s= ss.accept();
PrintWriter pr= new PrintWriter(s.getOutputStream());
clientoutstreams.add(pr);

Thread t= new Thread(new ClientHandler(s));
t.start();
}
}

catch(Exception e){
System.out.println(e);
}
}

public void tellEveryone(String mess){
Iterator it= clientoutstreams.iterator();
while(it.hasNext()){
try{
PrintWriter pr= (PrintWriter)it.next();
pr.println(mess);
pr.flush();
}
catch(Exception e){
System.out.println(e);
}

}
}

}