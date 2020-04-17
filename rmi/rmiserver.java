import java.rmi.*;
import java.net.*;
public class rmiserver
{
	public static void main(String args[])
	{
		try{
			
			serverimpl  impl=new serverimpl();
			Naming.rebind("rmiserver",impl);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}