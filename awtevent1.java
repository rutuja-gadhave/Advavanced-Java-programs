import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet code="awtevent1.class" height=400 width=400>
//</applet>
public class awtevent1 extends Applet implements KeyListener
{
	String str;
	char c;
	public void init()
	{
		addKeyListener(this);	
	}
	public void keyPressed(KeyEvent ke){}
	public void keyReleased(KeyEvent ke){}
	public void keyTyped(KeyEvent ke)
	{
		 c=ke.getKeyChar();
		if(c=='a')
		{ str="a for apple";}
		if(c=='e')
		{str="\n e for Elephant";}
		if(c=='i')
		{str="\n i for Ice-Cream";}
		if(c=='o')
		{str="\n o for ox";}
		if(c=='u')
		{str="\n u for Umbrella";}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(str,70,100);
	}

}
		