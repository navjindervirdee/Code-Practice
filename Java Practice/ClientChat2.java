import java.net.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class ClientChat2{

JButton b;
JTextArea t1;
JTextArea t2;
Socket s;
BufferedReader br;
PrintWriter pr;
InputStreamReader i;

public static void main(String [] args){
new ClientChat().go();
}

public void go(){

setupGui();
setupNet();
String end= t2.getText();

giveOutput();
Thread t= new Thread(new Runj());
t.start();

}

public void setupGui(){

JFrame jf= new JFrame();
JPanel jp =new JPanel();

b= new JButton("Send");
t1= new JTextArea(10,20);
t2= new JTextArea(10,20);

JScrollPane js1= new JScrollPane(t1);
t1.setLineWrap(true);
js1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
js1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

JScrollPane js2= new JScrollPane(t2);
t2.setLineWrap(true);
t2.requestFocus();
js2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
js2.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

b.addActionListener(new ButtonList());
jp.add(js1);
jp.add(js2);

jf.getContentPane().add(BorderLayout.CENTER, jp);
jf.getContentPane().add(BorderLayout.SOUTH, b);

jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf.setSize(400,400);
jf.setVisible(true);
}

public class ButtonList implements ActionListener{
public void actionPerformed(ActionEvent e){
t2.setText("");
t2.requestFocus();
}
}

public void setupNet(){

try{
i = new InputStreamReader(s.getInputStream());
pr= new PrintWriter(s.getOutputStream());
}
catch(Exception e){
System.out.println(e);
}
}

public void giveOutput(){
String b= t2.getText();
pr.println(b);
pr.flush();
}

public class Runj implements Runnable{
public void run(){
getInput();
}
}

public void getInput(){
try{
br= new BufferedReader(i);
String a;

while((a= br.readLine())!= null){
t1.setText(a);
}
}
catch(Exception e){
System.out.println(e);
}
}
}