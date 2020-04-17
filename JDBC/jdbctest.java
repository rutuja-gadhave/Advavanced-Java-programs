import java.sql.*;	
import javax.sql.*;
import javax.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//<applet code="jdbctest.class" height=400 width=400></applet>
public class jdbctest implements ActionListener
{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1;
	Frame f;
	public void jdbctest()
	{
		f.setVisible(true);
		 l1=new JLabel("First name");
		l2 =new JLabel("Age");
		t1=new JTextField(10);
		t2=new JTextField(10);
		b1=new JButton("Submit");
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		b1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			PreparedStatement ps=null;
			ResultSet rs=null;
			int i;
			String s, a;
			s=t1.getText();
			a=String.valueOf(t2.getText());
		try
		{		
		//load driver
		Class.forName("oracle.jdbc.OracleDriver");
		//connection to DB
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","rutuja");
		System.out.println("connection to DB:"+con);
		System.out.println("enter roll no ,name and address");
			ps=con.prepareStatement("insert into info1 values(?,?,?)");
			ps.setString(1,s);
			ps.setString(2,a);
			i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Record saved");
			}
		}
		catch(Exception ei)	
		{
			System.out.println(ei);
		}
		}	
	}
	public static void main(String args[])
	{
		jdbctest j =new jdbctest();
	}
}
