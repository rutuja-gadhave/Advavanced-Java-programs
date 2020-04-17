import java.awt.*;
import java.io.Serializable;
public class bean2 extends  Canvas implements Serializable
{	
	
	public bean2()
	{
		setSize(60,40);
		setBackground(Color.pink);
	}
	public static void main(String args[])
	{
		new bean2();
	}
}