import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code ="Button" width=1930 height=937>
</applet>
*/
public class Button extends Applet implements ActionListener{
String msg="";
Button yes,no,Undecided;
public void init(){
yes=new Button("Yes");
no=new Button("No");
Undecided=new Button("Undecided");

add(yes);
add(no);
add(Undecided);

yes.addActionListener(this);
no.addActionListener(this);
Undecided.addActionListener(this);
}

public void actionPerformed(ActionEvent ae){
String str=ae.getActionCommand();
if(str.equals("Yes")){
msg="Yes";
}
else{
 if(str.equals("No")){
msg="No";
}
else{
msg="Undecided";
}
}
repaint();
}
public void paint(Graphics g){
g.drawString(msg,200,400);
}

}


