import java.net.*;
import java.rmi.*;
public class ClientString
{
	public static void main(String args[])
	{
		try{
		String url="rmi/"+args[0]+"/ServerString";
		StringIntf intf=(StringIntf)Naming.lookup(url);
		System.out.println("First string is:"+args[1]);
		String s1=String.valueOf(args[1]).StringValue();
		System.out.println("Second string is:"+args[2]);
		String s2=String.valueOf(args[2]).StringValue();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
	