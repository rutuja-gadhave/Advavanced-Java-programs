import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class jtabedpane extends JApplet
//<applet code="jtabbedpane.class" height=400 width=400></applet>
{
	JTabbedPane jt;
	JPanel p1,p2,p3;
	JLabel l1,l2,l3;
	Container cp=getContentPane();
	public void init()
	{	
		jt=new JTabbedPane();
		p1=new JPanel(l1);
		p2=new JPanel(l2);
		p3=new JPanel(l3);
		l1=new JLabel("This is Rose");
		l2=new JLabel("This is Lily");
		l3=new JLabel("This is Jasmin");
		jt.addTab("Rose",p1);
		jt.addTab("Lily",p2);
		jt.addTab("Jasmin",p3);
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp=new JScrollPane(jt,v,h);
		cp.add(jsp);
	}
}
	