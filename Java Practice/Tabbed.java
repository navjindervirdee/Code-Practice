import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code=Tabbed" width=500 height=500>
</applet>
*/

public class Tabbed extends JApplet {

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
JTabbedPane tp=new JTabbedPane();

tp.addTab("Cities ",new CitiesPanel());
tp.addTab("Family " ,new FamilyPanel());
tp.addTab("Flavors " ,new FlavorsPanel());
add(tp);
}
}

class CitiesPanel extends JPanel{
public CitiesPanel(){
JButton one= new JButton("One");
add(one);
JButton two =new JButton("two");
add(two);
}
}

class FamilyPanel extends JPanel{
public FamilyPanel(){
JCheckBox cb=new JCheckBox("Gobi");
add(cb);
JCheckBox cb2=new JCheckBox("arv");
add(cb2);
}
}

class FlavorsPanel extends JPanel{
public FlavorsPanel(){
JComboBox cbo = new JComboBox();
cbo.addItem("vanila");
cbo.addItem("choco");
add(cbo);
}
}


 