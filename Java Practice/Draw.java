import javax.swing.*;
import java.awt.*;
public class Draw extends JPanel{
public void paintComponent(Graphics g){
Image image = new ImageIcon("IMG_20160330-121717.jpg").getImage();
g.drawImage(image,3,4,this);

}
}