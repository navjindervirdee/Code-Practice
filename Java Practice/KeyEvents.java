import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<aplet code="KeyEvents" width=1950 height=940>
</applet>*/
public class KeyEvents extends Applet implements Keylistener{
String msg="";
String [] check=new String[10];
int j=0;
String p;
String x=new String();
public void init(){
addKeyListener(this);
}

public void keyPressed(KeyEvent ke){
showStatus("Ket pressed");
}
public void keyReleased(KeyEvent ke){
showStatus("released");
}
public void keyTyped(KeyEvent ke){
msg=ke.getKeyChar()+"";
for(int i=msg.length()-1; i>=0;i--){
check[j]=msg.charAt(i) +"";
j++;
}
for(int i=0; i<msg.length(); i++){
p=check[i]+"";
x=x+p;
}
}
public void paint(Graphics g){
if(x.equals(msg)){
g.drawString("Palindrome",100,200);
}
else{
g.drawString("not palindrome",100,200);
}
}
}