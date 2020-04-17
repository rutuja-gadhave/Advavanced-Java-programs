import java.awt.*;
import java.applet.Applet;
import java.io.Serializable;
public class bean3 extends Applet implements Serializable
{
	TextField t1;
	Label l1;
	private String s, nm="";
	public void init()
	{
		t1=new TextField(10);
		l1=new Label("name");
		GridLayout gl=new GridLayout(3,2,5,5);
		setLayout(gl);
		add(l1);
		add(t1);
	}
	public void paint(Graphics g)
	{
		s=nm;
		t1.setText(s);
	}
	public String getName()
	{ return nm;}
	public void setName(String nm)
	{
		this.nm=nm;
		repaint();
	}
	
}
	



		 