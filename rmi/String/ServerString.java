import java.net.*;
import java.rmi.*;
class SeverString 
{
	public ststic void main(String args[])
	{
		try{
			StringImpl impl=new StringImpl();
			Naming.rebind("ServerString",impl);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
 