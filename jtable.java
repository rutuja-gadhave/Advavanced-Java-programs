import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="jtable.class" width=400 height=400></applet>
public class jtable extends JApplet
{
	JPanel p;
	JTable jt;
	public void init()
	{
		p=new JPanel();
		final String[] info={"Name","Branch"};
		Object[][]data={{"Name","Branch"},{"Rutuja","Computer"},{"Neha","IT"},{"Vaibhav","Civil"}};
		 jt=new JTable(data,info);
		p.add(jt);
		add(p);
	}
}