import java.rmi.*;
import java.rmi.server.*;
public class serverimpl extends UnicastRemoteObject implements intf
{
	public serverimpl() throws RemoteException
	{}
		public double add(double d1,double d2) throws RemoteException 
		{
			return d1+d2;
		}
	
}