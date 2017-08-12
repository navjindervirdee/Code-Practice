import java.awt.*;
import java.applet.*;
/*
<applet code = "SimpleBanner" width =500 height=500>
</applet>
*/
public class SimpleBanner extends Applet implements Runnable{
String msg="Navjinder Singh Virdee";
Thread t= null;
int state;
boolean stopflag;
public void init(){
setBackground(Color.pink);
setForeground(Color.white);
}

public void start(){
t= new Thread(this);
stopflag= false;
t.start();
}
public void run(){
char ch;
for( ; ;){
try{
repaint();
Thread.sleep(250);
ch=msg.charAt(0);
msg= msg.substring(1,msg.length());
msg=msg +ch;
if(stopflag){
break;
}
}
catch(InterruptedException e){
}
}
}
public void stop(){
stopflag=true;
t=null;
}

public void paint(Graphics g){
g.drawString(msg, 100, 100);
}
}

