import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
/*<applet code="Swinge" width=600 height=600>
</applet>
*/
public class Swinge extends JApplet implements ItemListener, ActionListener{

JTextField t;
JButton b;
JLabel jlab;
ImageIcon i;
JToggleButton tb;
JCheckBox cb;

public void init(){
try{
SwingUtilities.invokeAndWait(new Runnable(){
public void run(){
makeGUI();
}
});
}

catch(Exception e){
System.out.println(e);
}
}

private void makeGUI(){
setLayout(new FlowLayout());
t=new JTextField(10);
i=new ImageIcon("France.gif");
tb=new JToggleButton("on/off");
b=new JButton("yes");
cb=new JCheckBox("No");

t.addActionListener(this);

add(t);
b.addActionListener(this);
add(b);
tb.addItemListener(new ItemListener(){
public void itemStateChanged(ItemEvent ie){
if(tb.isSelected()){
jlab.setText("on");
t.setText("on");
}
else{
t.setText("off");
}
}
});
add(tb);
cb.addItemListener(this);
add(cb);
jlab=new JLabel("do anything");

add(jlab);
}

public void actionPerformed(ActionEvent ae){
t.setText(ae.getActionCommand());
jlab.setText(ae.getActionCommand());
}
public void itemStateChanged(ItemEvent ie){
JCheckBox jcb=(JCheckBox)ie.getItem();
if(cb.isSelected()){

t.setText(cb.getText());
}
}
}