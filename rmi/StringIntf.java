import java.rmi.*;
public interface StringIntf extends Remote
{
	public String con(String s1,String s2) throws RemoteException;

}
