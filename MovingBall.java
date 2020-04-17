import java.awt.*;
import java.applet.*;
import java.Thread.*;
//<applet code="MovingBall.class" height=400 width=400></applet>
public class MovingBall extends Applet implements Runnable
{
	Thread mythread=null;
	int position=0;
	public void start()
	{
		mythread=new Thread(this);
		mythread.start();
		
	}
	public void run()
	{
		while(true)
		{
			for(position=0;position<getSize().width;position+=5)
			{
				repaint();
				try
				{
					mythread.sleep(50);		
					
				}
				catch(Exception e)
				{}
			
			}
	
		}	
	}
	public void stop()
	{
		mythread.stop();
		mythread=null;
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.gray);
		g.fillOval(position,50,30,30);
		g.setColor(Color.black);
		g.fillOval(position+6,58,5,5);
		g.fillOval(position+20,58,5,5);
		g.drawLine(position+15,58,position+15,68);
		g.drawLine(position+12,68,position+15,68);
		g.drawArc(position,45,30,30,-50,-70);
	}
	
}






