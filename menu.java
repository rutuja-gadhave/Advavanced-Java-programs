import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class menu implements Runnable, ActionListener
{
  private JFrame frame;
  private JMenuBar menuBar;
  private JMenu fileMenu;
  private JMenu editMenu;
  private JMenuItem openMenuItem;
  private JMenuItem cutMenuItem;
  private JMenuItem copyMenuItem;
  private JMenuItem pasteMenuItem;

  public static void main(String[] args)
  {
    SwingUtilities.invokeLater(new menu());
  }

  public void run()
  {
    frame = new JFrame("Java");
    menuBar = new JMenuBar();
   
    // build the File menu
    fileMenu = new JMenu("File");
    openMenuItem = new JMenuItem("Open");
    openMenuItem.addActionListener(this);
    fileMenu.add(openMenuItem);

    // build the Edit menu
    editMenu = new JMenu("Edit");
    cutMenuItem = new JMenuItem("Cut");
    copyMenuItem = new JMenuItem("Copy");
    pasteMenuItem = new JMenuItem("Paste");
    editMenu.add(cutMenuItem);
    editMenu.add(copyMenuItem);
    editMenu.add(pasteMenuItem);

 
    menuBar.add(fileMenu);
    menuBar.add(editMenu);

    frame.setJMenuBar(menuBar);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setPreferredSize(new Dimension(400, 300));
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
  public void actionPerformed(ActionEvent ev)
  {
    SampleDialog dialog = new SampleDialog();
    dialog.setModal(true);
    dialog.setVisible(true);
  }

  private class SampleDialog extends JDialog implements ActionListener
  {
    private JButton okButton = new JButton("OK");

    private SampleDialog()
    {
      super(frame, "Sample Dialog", true);
      JPanel panel = new JPanel(new FlowLayout());
      panel.add(okButton);
      getContentPane().add(panel);
      okButton.addActionListener(this);
      setPreferredSize(new Dimension(300, 200));
      pack();
      setLocationRelativeTo(frame);
    }

    public void actionPerformed(ActionEvent ev)
    {
      setVisible(false);
    }
  }
}