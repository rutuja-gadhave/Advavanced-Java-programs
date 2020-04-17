import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
public class LayApp1 extends Applet implements ActionListener
{
	JFrame f;
	JPanel p;
	JLabel  l1;
	JButton b1;
	JTextArea t1;
	public LayApp1()
	{	
		f=new JFrame("LayApp");
		f.setSize(400,400);
		f.setVisible(true);
		p=new JPanel();
		b1.setBounds(30,100,80,30);
		t1.setBounds(100,100,80,30);
		f.add(p);
		
		l1=new JLabel("Welcome......!!!!!!");
		b1=new JButton("Login");
		
		FlowLayout f1=new FlowLayout(FlowLayout.CENTER);
		p.setLayout(f1);
		//BorderLayout br=new BorderLayout(BorderLayout.SOUTH);
		//p.setLayout(br);
		p.setLayout(new GridLayout(1,2));

		t1= new JTextArea();
		p.add(l1);
		p.add(b1);
		p.add(t1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			t1.setText("Hello all.......");
			p.setBackground(Color.YELLOW);
		}
	}
	public static void main(String args[])
	{	
		LayApp1 l=new LayApp1();
	}
}