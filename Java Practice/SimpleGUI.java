import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleGUI {
int x=70;
int y=70;
public static void main(String [] args){
SimpleGUI g= new SimpleGUI();
g.go();
}
public void go(){

JFrame frame = new JFrame();
Draw d = new Draw();



frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//frame.getContentPane().add(b);
frame.getContentPane().add(d);
frame.setSize(1000,1000);
frame.setVisible(true);

for(int i=0; i<100; i++){
x+=10;
y+=10;

d.repaint();
try{
Thread.sleep(50);
}catch(Exception e){}
}
}

public class Draw extends JPanel{
public void paintComponent(Graphics g){
g.setColor(Color.white);
g.fillRect(0,0,this.getWidth(),this.getHeight());

g.setColor(Color.red);
g.fillOval(x,y,40,40);

}
}


/*public void actionPerformed(ActionEvent a){
b.setText("Atley");
JFrame frame2= new JFrame();
Draw d2= new Draw();
frame2.getContentPane().add(d2);
*/

}