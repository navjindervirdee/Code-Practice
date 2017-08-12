import java.awt.*;
import java.awt.Button;
import java.awt.event.*;
import java.applet.*;
/*
applet code ="ButtonList" width=500 height=500>
</applet>
*/
public class ButtonList extends Applet implements ActionListener{
String msg="";
Button blist[] = new Button[3];

public void init(){

Button yes= new Button("Yes");
Button no= new Button("No");
Button maybe= new Button("Undecided");

blist[0]= (Button)add(yes);
blist[1]= (Button)add(no);
blist[2]= (Button)add(maybe);

for(int i=0;i<3;i++){
blist[i].addActionListener(this);
}
}
public void actionPerformed(ActionEvent ae){
for(int i=0; i<3;i++){
if(ae.getSource()==blist[i]){
msg=blist[i].getLabel();
}
}
repaint();
}

public void paint(Graphics g){
g.drawString(msg,100,200);
}
}