import javax.swing.*;
import javax.awt.*;
//<applet code="menuTest.class" height=400 width=400></applet> 
class menuTest extends Jpanel
{
	Jpanel pn1=new Jpanel();
	Menubar mb=new Menubar();
	Menu m1=new Menu("File");
	Menu m2=new Menu("Edit");
	Menu m3=new Menu("Format");
	Menu m4=new Menu("View");
	Menu m5=new Menu("Help");
	pnl.add(mb);
	pnl.add(m1);
	pnl.add(m2);
	pnl.add(m3);
	pnl.add(m4);
	pnl.add(m5);
	public static void main(String args[])
	{
		menuTest m=new menuTest();
	}
}

