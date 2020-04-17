import java.awt.*;
import java.io.Serializable;
public class simpleBean extends  Canvas implements Serializable
{
	public simpleBean()
	{
		setSize(60,40);
		setBackground(Color.red);
	}
}