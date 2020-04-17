import java.awt.*;
import java.applet.*;
import java.awt.event.*;
//<applet code="awtevent.class" height=400 width=400>
//</applet>
public class awtevent extends Applet implements ItemListener
{
	char c;
	Label l1;
	TextField t1;
	Choice ch;
	Checkbox cb1,cb2,cb3,cb4;
	CheckboxGroup cg1;
	Button b1;
	TextArea ta;
	public void init()
	{
		ta=new TextArea();
		l1=new Label("Enter name");
		t1=new TextField(10);
		ch=new Choice();
		ch.add("Pune");
		ch.add("Mumbai");
		ch.add("Delhi");
		cb1=new Checkbox("Rose");
		cb4=new Checkbox("Lily");
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
		add(cb4);
		add(b1);
		add(ta);
		t1.setText("0");
		//b1.addActionListener(this);
		cb1.addItemListener(this);
		cb4.addItemListener(this);
		
		
	}
	public void itemStateChanged(ItemEvent ie)
	{
		repaint();
	}
	
	/*public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			String str="Welcome	"+t1.getText();
			if(cb1.getState())
			{str=str+"\n Rose";}
			if(cb4.getState())
			{str=str+"\nLily";}
			str=str+"\n Gender is:";
			if(cb2.getState())
			{str=str+"\n Male";}
			if(cb3.getState())
			{str=str+"\n Female";}
			str=str+"Selected city :"+ch.getSelectedItem();
			ta.setText(str);
		}
	}*/
	
	public void paint(Graphics g)
	{
		String msg="\nCurrent selected Item : ";
		msg+="Rose "+cb1.getState();
		g.drawString(msg,10,100);
		msg+="Lily "+cb4.getState();
		g.drawString(msg,50,120);
	
	}

}
		