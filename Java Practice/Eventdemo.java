import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Eventdemo{
JLabel jlab;

Eventdemo(){

JFrame jfrm =new JFrame("Event Program");
jfrm.setLayout(new FlowLayout());
jfrm.setSize(1930,937);
jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JButton alpha =new JButton("Alpha");
JButton beta = new JButton("Beta");

alpha.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
jlab.setText("Alpha is pressed");
}
});

beta.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
jlab.setText("beta is pressed");
}
});

jfrm.add(alpha);
jfrm.add(beta);

jlab=new JLabel("press a button");

jfrm.add(jlab);

jfrm.setVisible(true);
}

public static void main(String [] args){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new Eventdemo();
}
});

}
}

