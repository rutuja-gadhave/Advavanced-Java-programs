import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.applet.*;
//<applet code="testtable.class" width=400 height=400></applet>

public class testtable extends JApplet
{
	JPanel p;
	JTable t;
	public void init()
	{
		p=new JPanel();
		final String[] cm={"Name","Branch"};
		Object[][] data={{"Name","Branch"},{"Rutuja","Computer"},{"Neha","IT"},{"Vaaibhav","Mechanical"}};
		t = new JTable(data, cm);
		p.add(t);
		add(p);
	}
}