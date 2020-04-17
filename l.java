import java.awt.event.*;
import java.awt.*;
import java.applet.*;
//<applet code=l.java width=500 height=500></applet>
public class l extends Applet //implements ActionListener
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	
	public void init()
	{	
		//FLOW LAYOUT
		
		/*setLayout(new FlowLayout(FlowLayout.RIGHT));
		b1=new Button("Submit");
		add(b1);*/
		
		
		
		
		//BORDER LAYOUT
	
		/*b2=setLayout(new BorderLayout(BorderLayout.SOUTH));
		//b2=new Button(b2,BorderLayout.SOUTH);
		add(b2);*/

		setLayout(new BorderLayout());
		
		b1=new Button("Ok");
		add(b1,BorderLayout.SOUTH);
		
		//GRID LAYOUT

		/*setLayout(new GridLayout(1,2));
		b1=new Button("Submit");
		add(b1);
		b2=new Button("Submit");
		add(b2);*/

		//CARD LAYOUT

		/*setLayout(new CardLayout(100,200));
		t1=new TextField(20);
		add(b1);*/
	
		/*t2=new TextField("Submit");
		add(b2);*/
		//b1.addActionListener(this);
				
		
	
			
		
	}
		}		