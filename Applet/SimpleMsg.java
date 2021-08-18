/* Name : Abhijeet Anand
    Roll : 19103001  
    Develop an applet that displays a simple message */
    
import java.awt.*;
import java.applet.*;

/*

<applet code="SimpleMsg" width=300 height=200>

</applet>

*/

public class SimpleMsg extends Applet {

public void paint(Graphics g) {

g.drawString("Hello Dear, This is Abhijeet's repository.", 30, 20);

    }

}