import java.awt.*;
import java.applet.*;
import java.lang.*;

//<applet code=move.class width=500 height=500></applet>
public class move extends Applet  
{	int p;
	int x,y;
	//Thread th=new Thread();
	
	/*void d()
	{
		
		
		try
		{
		Thread.sleep(10);
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
		Thread.sleep(600);
		}
		catch(Exception e)
		{}
	}
	public void paint(Graphics g)
	{
		int w=getWidth();
		for( p=0;p<1;p++)
		{
			x=x+4;
			y=y+4;
			g.drawRect(x+0,y+0,200,80);
			g.fillRect(4,4,4,4);
			g.fillOval(x+10,y+30,80,80);
			g.fillOval(x+90,y+30,80,80);
			repaint();
		if(x+100<w)
		{
			repaint();
		}
				
		
		try
		{
		Thread.sleep(1000);
		}
		catch(Exception e)
		{}
	}
			
		
		//g.drawOval(,200,80,80);
	}
	
}