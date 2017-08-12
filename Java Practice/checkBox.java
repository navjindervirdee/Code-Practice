import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code= "CheckBox" width=1940 height=937>
</applet>
*/
public class CheckBox extends Applet implements ItemListener{
String msg="";
Checkbox navi, batley, virdee, navjinder;
public void init(){
navi=new Checkbox("navi",null,true);
batley= new Checkbox("batley", true);
virdee= new Checkbox("virdee");
navjinder=new Checkbox("navjinder");

add(navi);
add(batley);
add(virdee);
add(navjinder);

navi.addItemListener(this);
batley.addItemListener(this);
virdee.addItemListener(this);
navjinder.addItemListener(this);
}

public  void itemStateChanged(ItemEvent ie){
repaint();
}

public void paint(Graphics g){
msg="Current State : ";
g.drawString(msg,200,300);
msg="Navi : " + navi.getState();
g.drawString(msg,200,320);
msg="Batley : " + batley.getState();
g.drawString(msg,200,340);
msg="Virdee : " + virdee.getState();
g.drawString(msg,200,360);
msg="Navjinder : " + navjinder.getState();
g.drawString(msg,200,380);
}
}