import java.net.*;
import java.rmi.*;
public class ServerString 
{
	public static void main(String args[])
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
 