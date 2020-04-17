
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="awtctrl.class" height=500 width=200>
</applet>*/
public class awtctrl extends Applet implements ActionListener
{
	TextField t1,t2,t3;
	Label l1,l2,l3,l4,l5,l6,l7,l8;
	Button b1,b2;
	TextArea ta;
	Choice ch;
	Checkbox cb1,cb2,cb3,cb4,cb5,cb6;
	CheckboxGroup cg1;
	public void init()	
	{
		t1=new TextField(8);
		t2=new TextField(8);
		//t2.setEchoChar("*");
		t3=new TextField(20);
		l1=new Label("Registration  Form    ");
		l2=new Label("User Name :");
		l3=new Label("User Password :");
		l4=new Label("Age");
		l5=new Label("Favourite Cars");
		l6=new Label("Gender");	
		l7=new Label("Blood Group");
		l8=new Label("Result Report");
		b1=new Button("Check Age");
		b2=new Button("Submit");
		cg1=new CheckboxGroup();
		cb1=new Checkbox("Oddi");
		cb2=new Checkbox("Swift Dezire");
		cb3=new Checkbox("BMW");
		cb4=new Checkbox("Alto");
		cb5=new Checkbox("Male",cg1,true);
		cb6=new Checkbox("Female",cg1,false);
		ch=new Choice();
		ch.add("A Positive/Negative");
		ch.add("B Positive/Negative");
		ch.add("AB Positive/Negative");
		ch.add("O Positive/Negative");

		ta=new TextArea();
		t1.setText("0");
		t2.setText("0");
		t3.setText("0");
		add(l1);
		add(l2);
		add(t1);
		add(l3);
		add(t2);
		add(l4);
		add(t3);
		add(b1);
		add(l5);
		add(cb1);
		add(cb2);
		add(cb3);
		add(cb4);
		add(l6);
		add(cb5);
		add(cb6);
		add(ch);
		add(b2);
		add(ta);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		int x=Integer.parseInt(t3.getText());
		if(e.getSource()==b1)
		{
			if(x<0)
			{
				t3.setText("Age Cannot be less than 0");
			}
		}
		if(e.getSource()==b2)
		{
			String str="Welcome "+t1.getText();
			str=str+"\nYour Age is:"+t3.getText();
			str=str+"\nYour Favorite cars are : ";
			if(cb1.getState())
			{
			str=str+"  Oddi";
			}
			if(cb2.getState())
			{
			str=str+", Swift Dezire";
			}
			if(cb3.getState())
			{
			str=str+", BMW";
			}
			if(cb4.getState())
			{
			str=str+",  Alto";
			}
			str=str+"\nGender is :";
			if(cb5.getState())
			{
			str=str+" Male";
			}
			else if(cb6.getState())
			{
			str=str+" Female";
			}
			str=str+"\nYour Blood group is : "+ch.getSelectedItem();
			ta.setText(str);
		}
	}
}