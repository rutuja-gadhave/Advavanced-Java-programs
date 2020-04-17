import java.applet.*;
import java.awt.*;
import java.lang.*;

/*<applet code="wheel.class" height=800 width=700>
</applet> */

public class wheel extends Applet
{
	
	int x; int y; int w;
 	void sleep()                  //for delay
 	{
      		try 	
		{
    			Thread.sleep(200);
  		}  	
		catch(Exception ex) {}
	}
	public void init()
 	{
 		y=30;

		x=20;
	}
	public void paint(Graphics g)
 	{
		w=getWidth();
		g.fillOval(x+10,y+50,50,50);
        	g.fillOval(x+60,y+50,50,50);
        	
		x=x+10; 
		sleep();
            
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