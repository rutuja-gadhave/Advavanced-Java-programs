import java.awt.*;
import java.applet.*;
import java.lang.*;

//<applet code=movball.class width=500 height=500></applet>
public class movball extends Applet  
{	int p;
	int x,y;
	//Thread th=new Thread();
	
	/*void d()
	{
		
		
		try
		{
		Thread.sleep(50);
		}
		catch(Exception e)
		{}
		
	}*/
	public void init()
	{	
		for( p=0;p<40;p++)
		{
			x=x+2;
			y=y+2;
		}
		try
		{
		Thread.sleep(50);
		}
		catch(Exception e)
		{}
	}
	public void paint(Graphics g)
	{
		for( p=0;p<2;p++)
		{
			x=x+4;
			y=y+4;
			
			g.drawOval(x+10,y+30,80,80);
			repaint();
				
		
		try
		{
		Thread.sleep(50);
		}
		catch(Exception e)
		{}
	}
			
		
		//g.drawOval(,200,80,80);
	}
	
}