import java.awt.*;
import java.applet.*;
import java.net.*;
/*
<applet code = "Acdemo" width=600 height=300>
</applet>
*/
public class Acdemo extends Applet{
public void start(){
AppletContext ac= getAppletContext();
URL url = getCodeBase();

try{
ac.showDocument(new URL(url + " Na.html"));
}
catch(MalformedURLException e){
showStatus("URL not found");
}
}
}