import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
import java.awt.event.*;
//<applet code="jtree.class" height=200 width=200></applet>
public class jtree extends JApplet
{
	JTree jt;
	DefaultMutableTreeNode top,co,a,a1,it;
	Container cp=getContentPane();
	public void init()
	{
		top=new DefaultMutableTreeNode("Option");
		co=new DefaultMutableTreeNode("Computer");
		a=new DefaultMutableTreeNode("A");
		a1=new DefaultMutableTreeNode("A1");
		a.add(a1);
		co.add(a);
		top.add(co);
		jt=new JTree(top);
		cp.add(jt);
	}
}

	
		
		