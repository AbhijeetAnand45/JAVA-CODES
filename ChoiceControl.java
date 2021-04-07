/*
   Name : Abhijeet Anand
   Roll : 19103001
   Develop an applet that creates choice control from a simple list containing 5 items.
*/
import java.awt.*;
import java.applet.*;

/*
<APPLET Code="ChoiceControl" Width=500 Height=200>
</APPLET>
*/

public class ChoiceControl extends Applet
{
	public void init( )
	{
		Choice ch = new Choice();
		ch.add("Bihar");
		ch.add("Manipur");
		ch.add("Delhi");
		ch.add("Chennai");
        ch.add("Assam");
		add(ch );
	}
}
