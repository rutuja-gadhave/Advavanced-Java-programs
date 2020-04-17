import java.awt.*;
import java.swing.*;
import java.event.*;
class notepad extends Frame implements ActionListener
{
	Panel p;
	MenuBar mb;
	Menu m1,m2;
	MenuItem m11,m12,m21,m22;
	TextArea ta;
	public notepad()
	{
		super("New Version");
		p =new Panel();
		setVisible(true);
		setSize(1000,1000);
		add(BorderLayout.CENTER,ta);
		ta=new TextArea();
		mb=new MenuBar();
		m1=new Menu("File");
		m2=new Menu("Edit");
		m11=new MenuItem("New        Ctrl+N");
		m12=new MenuItem("Open        Ctrl+O");
		m21=new MenuItem("Cut      Ctrl+X");
		m22=new MenuItem("Paste        Ctrl+V");
		m1.add(m11);
		m1.add(m12);
		m2.add(m21);
		m2.add(m22);
		mb.add(m1);
		mb.add(m2);
		setMenuBar(mb);
		show();
		m21.addActionListener(this);
		m22.addActionListener(this);
	}
public void actionPerformed(ActionEvent ae)
{
	if(ae.getSource()==m21)
	{
		ta.cut();	
	}
	if(ae.getSource()==m22)
	{
		ta.paste();	
	}
}
public static void main(String args[])
{
	notepad n=new notepad();
}
}





