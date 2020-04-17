import java.awt.*;
import java.applet.Applet;
import java.io.Serializable;
public class bean1 extends Applet implements Serializable
{
	TextField t1,t2,t3;
	Label l1,l2,l3;
	private String s,s1, nm="",branch="";
	private int no,no1;
	public void init()
	{
		t1=new TextField(10);
		t2=new TextField(10);
		t3=new TextField(10);
		l1=new Label("name");
		l2=new Label("branch");
		l3=new Label("roll no");
		GridLayout gl=new GridLayout(3,2,5,5);
		setLayout(gl);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
	}
	public void paint(Graphics g)
	{
		s=nm;
		s1=branch;
		no1=no;
		t1.setText(s);
		t2.setText(s1);
		t3.setText(String.valueOf(no1));
	}
	public String getName()
	{ return nm;}
	public void setName(String nm)
	{
		this.nm=nm;
		repaint();
	}
	public String getBranch()
	{ return branch;}
	public void setBranch(String branch)
	{
		this.branch=branch;
		repaint();
	}
	public int getNum()
	{ return no;}
	public void setNum(int no)
	{
		this.no=no;
		repaint();
	}
}
	



		 