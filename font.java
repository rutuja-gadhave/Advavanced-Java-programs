import java.applet.*;
import java.awt.*;
//<applet code="font.class" height=400 width=400></applet>
public class font extends Applet
{
	Font f;
	public void paint(Graphics g)
	{
		String msg=" ";
		String msg1="\nHello Pune!";
		String font1[];
		f=new Font("Serif",Font.PLAIN,12); 
		GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
		font1=ge.getAvailableFontFamilyNames();
		for(int i=0;i<font1.length;i++)
		{
			msg+=font1[i]+" ,";
			g.drawString(msg,4,100);
		}
		g.setFont(f);
		g.drawString(msg1,10,120);
	}
}