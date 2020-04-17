import java.awt.*;
import java.applet.*;
import java.lang.*;
//<applet code="Moveball.class" height=400 width=400></applet>
public class Moveball extends Applet implements Runnable
{
	Thread mythread=null;
	int x,y,w,position=0;
	public void start()
	{
		mythread=new Thread(this);
		mythread.start();
		
	}
	
	public void stop()
	{
		mythread.stop();
		mythread=null;
	}
	public void paint(Graphics g)
	{
		
	w=getWidth();
		g.fillOval(x+10,y+50,50,50);
        	g.fillOval(x+60,y+50,50,50);
        	
		x=x+10; 
		sleep(500);
            
		if(x+100<w) 	
		{    
			repaint(); 
		}
		else		{ 
			repaint(); 
			x=20; 
			y+=30;
  		}

	}
	
}