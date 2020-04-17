import java.rmi.*;
import java.rmi.server.*;
public class StringImpl extends UnicastRemoteObject implements StringIntf
{
	public StringImpl() throws RemoteException
	{}
	public String con(String s1,String s2) throws RemoteException
	{
		return s1+s2;
	}
}