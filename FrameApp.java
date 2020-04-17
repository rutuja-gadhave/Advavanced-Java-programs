import java.awt.*;
import java.awt.event.*;
//import javax.swing.*;
import java.applet.*;
public class FrameApp extends Frame implements ActionListener
{
	
	Label l1;
	Button b;
	TextField t;
	public FrameApp()
	{
		super();
		t=new TextField();
		setTitle("Welcome");
		l1=new Label("GPP");
		b=new Button("click me");
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		b.setBounds(30,100,80,30);
		t.setBounds(100,100,80,30);
		
		add(l1);
		add(b);
		add(t);
		b.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b)
		{
			String str="hii";
			t.setText(str+t.getText());
		}
	}		
	public static void main(String args[])
	{	
		FrameApp f1=new FrameApp();
	}
}