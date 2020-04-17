import java.net.*;
import java.rmi.*;
public class ClientString
{
	public static void main(String args[])
	{
		try{
		String url="rmi://"+args[0]+"/ServerString";
		StringIntf intf=(StringIntf)Naming.lookup(url);
		System.out.println("First string is:"+args[1]);
		String s1=args[1];
		System.out.println("Second string is:"+args[2]);
		String s2=args[2];
		System.out.println("Concatinated  string is:"+intf.con(s1,s2));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
	