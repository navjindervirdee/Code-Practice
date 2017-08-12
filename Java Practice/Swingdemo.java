import javax.swing.*;
class Swingdemo{
Swingdemo(){
JFrame jfrm=new JFrame("Simple Swing  app");

jfrm.setSize(300,300);

jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JLabel jlab= new JLabel("Swing");

jfrm.add(jlab);

jfrm.setVisible(true);
}
public static void main(String [] args){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new Swingdemo();
}
});
}
} 