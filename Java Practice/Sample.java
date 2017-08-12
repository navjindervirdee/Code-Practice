import java.awt.*;
import java.applet.*;
/*<applet code = "Sample" width=800 height=500>
</applet>
*/
public class Sample extends Applet{
String str;
public void init(){
setBackground(Color.pink);
setForeground(Color.blue);
str= "Inside init...";
}

public void start(){
str += " inside start....";
}

public void paint(Graphics g){
str += "inside paint..";
g.drawString(str,250,250);
showStatus("confused");
}
}