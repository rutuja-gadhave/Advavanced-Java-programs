import java.rmi.*;
public class rmiclient
{
	public static void main(String args[])
	{
		try{
			String url="rmi://"+args[0]+"/rmiserver";
			intf itr=(intf)Naming.lookup(url);
			System.out.println("first number :"+ args[1]);
			double d1=Double.valueOf(args[1]).doubleValue();
			System.out.println("second number :"+ args[2]);
			double d2=Double.valueOf(args[2]).doubleValue();
			System.out.println ("The sum is: "+itr.add(d1,d2));
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}