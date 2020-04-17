import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet code="awt1.class" height=400 width=400>
//</applet>
public class awt1 extends Applet
{
	Label l1;
	TextField t1;
	Choice ch;
	Checkbox cb1,cb2,cb3;
	CheckboxGroup cg1;
	Button b1;
	public void init()
	{
		l1=new Label("Enter name");
		t1=new TextField(10);
		ch=new Choice();
		ch.add("Pune");
		cb1=new Checkbox("Rose");
		cg1=new CheckboxGroup();
		cb2=new Checkbox("Male",cg1,false);
		cb3=new Checkbox("female",cg1,false);
		b1=new Button("Ok");
		add(l1);
		add(t1);
		add(ch);
		add(cb1);
		add(cb2);
		add(cb3);
		add(b1);
		t1.setText("0");
	}
}