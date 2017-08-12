import java.awt.*;
import java.applet.*;
import java.net.*;
/*
<applet code = "Bases" width=700 height=200>
</applet>
*/
public class Bases extends Applet{
public void init(){
setBackground(Color.pink);
}
String msg;
public void paint(Graphics g){
 URL url = getCodeBase();
msg="Code BAse : " + url.toString();
g.drawString(msg, 50,70);

url=getDocumentBase();

msg="Doc Base : " + url.toString();
g.drawString(msg, 50,100);
}
}