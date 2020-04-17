import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.tree.*;
//<applet code="swing1.class" height=200 width=200></applet>
public class swing1 extends JApplet
{
	JTree tr;
	DefaultMutableTreeNode co,a,a1,top;
	Container cp=getContentPane();
	public void init()
	{
		
		top=new DefaultMutableTreeNode("Options");
		co=new DefaultMutableTreeNode("Computer");
		a=new DefaultMutableTreeNode("A");
		a1=new DefaultMutableTreeNode("A1");
		a.add(a1);
		co.add(a);
		top.add(co);
		tr=new JTree(top);
		cp.add(tr);
	}
}

		
