import java.awt.*;
import java.awt.event.*;
import java.awt.Button;
import java.applet.*;
/*<applet code ="Buttont" width=1940 height=500>
</applet>
*/

public class Buttont extends Applet implements ActionListener ,ItemListener{

String msg;
TextField t;
Button yes,no;

public void init(){
t=new TextField(10);
yes=new Button("yes");
no=new Button("no");
add(t);
add(yes);
add(no);
no.addActionListener(this);
yes.addActionListener(this);
t.addActionListener(this);

}
public void actionPerformed(ActionEvent ae){
msg=ae.getActionCommand();
t.setText(msg);
repaint();
}

public void itemStateChanged(ItemEvent ie){
}


}
