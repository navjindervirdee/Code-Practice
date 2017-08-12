import java.awt.*;
import java.awt.Button;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="Coice" width=1940 height=940>
</applet>
*/
public class Coice extends Applet implements ItemListener,ActionListener{
String msg;
String b;
String c;
Choice os, brow;
Button yes;
Checkbox navi;

public void init(){
Label one=new Label("One");
Button yes =new Button("yes");
Checkbox navi= new Checkbox("navi");
add(navi);
navi.addItemListener(this);
add(yes);
yes.addActionListener(this);

os=new Choice();
brow=new Choice();
add(one);
os.add("aty");
os.add("baty");

brow.add("gobi");
brow.add("arv");
add(os);
add(brow);

os.addItemListener(this);
brow.addItemListener(this);
}
public void actionPerformed(ActionEvent ae){
b=ae.getActionCommand();
if(b.equals("yes")){
b="yes";
}
else{
b="nothing";
}
repaint();
}

public void itemStateChanged(ItemEvent ie){
repaint();
}


public void paint(Graphics g){
//c="Navi : " + navi.getState();

//g.drawString(c,100,400);
g.drawString(b, 100,100);
msg="Current selection : ";
msg=msg+os.getSelectedItem();
g.drawString(msg,100,200);
msg="Current selection : ";
msg+=brow.getSelectedItem();
g.drawString(msg,100,300);
}
}