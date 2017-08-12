import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code ="Palindromec" width=500 height=500>
</applet>
*/
public class Palindromec extends Applet implements ActionListener, TextListener{
String msg="";
String [] check=new String[10];
int j=0;
String p;
String x=new String();
Label str;
TextField t;

public void init(){
str=new Label("Name : ",Label.RIGHT);
t=new TextField(10);
add(str);
add(t);
t.addActionListener(this);
t.addTextListener(this);

}

public void textValueChanged(TextEvent te){

repaint();
}

public void actionPerformed(ActionEvent ae){
repaint();
}

public void paint(Graphics g){
g.drawString("enter a string",100,100);

try{
msg=t.getText();
}
catch(Exception e){}

for(int i=msg.length()-1; i>=0;i--){
check[j]=msg.charAt(i) +"";
j++;
}

for(int i=0; i<msg.length(); i++){
p=check[i]+"";
x=x+p;
}

if(x.equals(msg)){
g.drawString("Palindrome",100,120);
}
else{
g.drawString(" Not Palindrome",100,120);
}

}

}

