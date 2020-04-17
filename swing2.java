import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
//<applet code="swing2.class" height=200 width=200></applet>
public class swing2 extends JApplet
{
	JTabbedPane jt;
	JPanel p1,p2,p3;
	JLabel l1,l2,l3;
	Container cp=getContentPane();
	public void init()
	{
		jt=new JTabbedPane();
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		l1=new JLabel("this is mango");
		l2=new JLabel("this is apple");
		l3=new JLabel("this is banana");
		p1.add(l1);
		p2.add(l2);
		p3.add(l3);
		jt.addTab("mango",p1);
		jt.addTab("apple",p2);
		jt.addTab("banana",p3);
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		JScrollPane jsp=new JScrollPane(jt,v,h);
		cp.add(jsp);
	}
}
		
	