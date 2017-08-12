import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
<object code= "Swingapplet" width=300 height=300>
</object>
*/

public class Swingapplet extends JApplet{

JLabel jlab;
JButton one, two;

public void init(){
try{
SwingUtilities.invokeAndWait(new Runnable(){
public void run(){
makeGUI();
}
});

}
catch(Exception e){
System.out.println("cant create " + e);
}
}

private void makeGUI(){
setLayout(new FlowLayout());

one=new JButton("one");
two=new JButton("Two");

one.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
jlab.setText("one is pressed");
}
});

two.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
jlab.setText("two is pressed");
}
});

add(one);
add(two);

jlab =new JLabel("press");

add(jlab);
}
} 