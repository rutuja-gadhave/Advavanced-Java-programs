import java.applet.*;
import java.awt.*;
//<applet code="fontInfo.class" height=400 width=400></applet>
public class fontInfo extends Applet
{
	int x=0,y=0;

	
	public void paint(Graphics g)
	{
		Font f1=new Font ("Serif",Font.PLAIN,14);
		g.setFont(f1);
		FontMetrics fm=g.getFontMetrics();
		nextLine("on line 1.",g);
		nextLine("on line 2.",g);
		sameLine("on same line.",g);
		sameLine(" This is too.",g);
	}
	void nextLine(String s,Graphics g)
	{
		FontMetrics fm=g.getFontMetrics();
		y+=fm.getHeight();
		x=0;
		g.drawString(s,x,y);	
		x=fm.stringWidth(s);
	}
	void sameLine(String s,Graphics g)
	{
		FontMetrics fm=g.getFontMetrics();
		g.drawString(s,x,y);	
		x+=fm.stringWidth(s);
	}	
}