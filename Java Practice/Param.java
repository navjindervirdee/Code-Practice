import java.awt.*;
import java.applet.*;
/*<applet code ="Param" width=500 height=500>
<param name=fontname value= courier>
<param name=fontsize value=14>
<param name=leading value=2>
<param name=AE value=true>
</applet>
*/
public class Param extends Applet{

String fontname;
int fontsize;
float leading;
boolean active;


public void start(){
fontname=getParameter("fontname");
if(fontname==null){
fontname="not found";
}
String param;
param=getParameter("fontsize");
try{
if(param!=null){
fontsize=Integer.parseInt(param);
}
else{
fontsize=0;
}
}
catch(NumberFormatException e){
fontsize=-1;
}
param=getParameter("leading");
try{
if(param!=null){
leading =Float.valueOf(param).floatValue();
}
else{
leading=0;
}
}catch(NumberFormatException e){
leading=-1;
}
param=getParameter("AE");
if(param!=null){
active=Boolean.valueOf(param).booleanValue();
}
}

public void paint(Graphics g){
g.drawString("FontName : "+fontname ,100,200);
g.drawString("Fontsize  : " +fontsize,100,250);
g.drawString("Leading   : "+leading,100,300);
g.drawString("Active    : "+active,100,350);
}
}
