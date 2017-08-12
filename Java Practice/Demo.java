import java.awt.*;
import java.applet.*;
import java.net.*;
/*<applet code="Demo" width=500 height=500>
</applet>
*/
public class Demo extends Applet{
public void init(){

AppletContext ac= getAppletContext();
URL url=getDocumentBase();
}
public void start(){
try{
ac.showDocument(new URL(url +"na.html"));
}
catch(MalformedURLException e){
showStatus("URL not found");
}
}


public void paint(Graphics g){

g.drawString(url.toString ,200,300);
}
}