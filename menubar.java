import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class menubar implements ActionListener
{
	private Frame f;    
	private MenuBar mb;
	private Menu file,edit;
	private MenuItem open,cut,copy;
	 public static void main(String[] args)
 	 {
 		menubar m=new menubar();
 	 }

	private menubar()
	{
		 f=new Frame("Java");
		mb=new MenuBar();
		file=new Menu("File");
		edit=new Menu("Edit");
		open=new MenuItem("Open");
		cut=new MenuItem("Cut");
		copy=new MenuItem("Copy");
		file.add(open);
		edit.add(cut);
		edit.add(copy);
		mb.add(file);
		mb.add(edit);
		f.setMenuBar(mb);
		 f.setPreferredSize(new Dimension(400, 300));
		f.setVisible(true);
		f.pack();
		open.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		Samplebox sb=new Samplebox();
		sb.setModal(true);
		sb.setVisible(true);
	}
	private class Samplebox extends Dialog implements ActionListener
	{
		private Button b=new Button("Ok");
		private Samplebox()
		{
			super(f,"New dialog box",true);
			 Panel panel = new Panel(new FlowLayout());
     			 panel.add(b);
      			add(panel);
			b.addActionListener(this);
			pack();
			setPreferredSize(new Dimension(300, 200));
		}
		public void actionPerformed(ActionEvent ae)
		{
			setVisible(false);
		}
	}
}

	