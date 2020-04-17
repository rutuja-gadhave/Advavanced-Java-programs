import java.awt.*;
import javax.swing.*;
public class  Jform extends JFrame
{
	JLabel l1;
	JTextField t1;
	//JChoice ch;
	//JCheckbox cb1,cb2,cb3,cb4;
	//JCheckboxGroup cg1;
	JButton b1;
	JRadioButton r1,r2;
	JFrame f;
	JPanel p;
	public Jform ()
	{
		super("Form");
		f=new JFrame();
		p=new JPanel();
        		f.setSize(700, 700);  
		  f.setVisible(true);  
		l1=new JLabel("Enter name");
		t1=new JTextField(10);
		//ch=new JChoice();
		//ch.add("Pune");
		//ch.add("Mumbai");
		//cb1=new JCheckbox("java");
		//cb4=new JCheckbox("c++");
		//cg1=new JCheckboxGroup();
		//cb2=new JCheckbox("Male",cg1,false);
		//cb3=new JCheckbox("female",cg1,false);
		r1=new JRadioButton("first year");
		r2=new JRadioButton("Second Year");
		b1=new JButton("Ok");
		p.add(l1);
		p.add(t1);
		//p.add(ch);
		/*p.add(cb1);
		p.add(cb4);
		p.add(cb2);
		p.add(cb3);*/
		p.add(r1);
		p.add(r2);
		p.add(b1);
		f.add(p);
		t1.setText("0");
	}
	public static void main(String args[])
	{
		new Jform();
	} 
}