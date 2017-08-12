import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code ="Labeldemo" width=1937 height=967>
</applet>
*/
public class Labeldemo extends Applet{
public void init(){
Label one= new Label(); 
Label two= new Label("Two");
Label three= new Label("Three");

add(one);
add(two);
add(three);
}
}