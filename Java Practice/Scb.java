import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="Scb" width=500 height=500>
</applet>*/
public class Scb extends Applet implements AdjustmentListener,MouseMotionListener{
String msg;
Scrollbar ver,hor;

public void init(){
int width=Integer.parseInt(getParameter("width"));
int height=Integer.parseInt(getParameter("height"));
ver=new Scrollbar(Scrollbar.VERTICAL,10,100,10,height);
hor=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,width);

add(ver);
add(hor);
ver.addAdjustmentListener(this);
hor.addAdjustmentListener(this);

addMouseMotionListener(this);
}
public void adjustmentValueChanged(AdjustmentEvent ae){
repaint();
}
public void mouseDragged(MouseEvent me){
int x= me.getX();
int y=me.getY();
ver.setValue(y);
hor.setValue(x);
repaint();
}
public void mouseMoved(MouseEvent me){
}

public void paint(Graphics g){
msg="Vertical : " + ver.getValue();
msg=msg + " Horizontal : "+ hor.getValue();
g.drawString(msg,100,200);

g.drawString("*", hor.getValue() , ver.getValue());
}
}