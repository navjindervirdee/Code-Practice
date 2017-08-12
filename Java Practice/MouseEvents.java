import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="MouseEvents" width=500 height=500>
</applet>
*/
 public class MouseEvents extends Applet implements MouseListener, MouseMotionListener{
String msg="";
int mouseX=0, mouseY=0;

public void init(){
addMouseListener(this);
addMouseMotionListener(this);
}
//handel mouse clicked
public void mouseClicked(MouseEvent me){
mouseX=200;
mouseY=300;
msg="Mouse clicked at : "+ me.getX() + " " + me.getY();
repaint();
}
public void mouseEntered(MouseEvent me){
mouseX=200;
mouseY=300;
msg="Mouse entered";
repaint();
}
public void mouseExited(MouseEvent me){
mouseX=200;
mouseY=300;
msg="Mouse exited";
repaint();
}
public void mousePressed(MouseEvent me){
mouseX=me.getX();
mouseY=me.getY();
msg="Down";
repaint();
}
public void mouseReleased(MouseEvent me){
mouseX=me.getX();
mouseY=me.getY();
msg="up";
repaint();
}
public void mouseDragged(MouseEvent me){
mouseX=me.getX();
mouseY=me.getY();
msg="*";
showStatus("Dragging mouse at : " +mouseX +" " + mouseY);
repaint();
}
public void mouseMoved(MouseEvent me){
showStatus("moving mouse at " +me.getX() + " " +me.getY());
}

public void paint(Graphics g){
g.drawString(msg ,mouseX,mouseY);
}
}
