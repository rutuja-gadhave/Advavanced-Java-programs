import java.net.*;
import java.io.*;
import java.util.Date;
class url1
{
	public static void main(String args[]) throws Exception
	{
		URL u=new URL("http://www.google.com/downloads");
		System.out.println("Protocol:"+u.getProtocol());
		System.out.println("Protocol:"+u.getHost());
		System.out.println("Protocol:"+u.getFile());
		System.out.println("Protocol:"+u.toExternalForm());

		URLConnection c=u.openConnection();
		long d=c.getDate();
		System.out.println("Date is :"+new Date(d));
		d=c.getExpiration();
		System.out.println("Expiration Date is :"+new Date(d));
		d=c.getLastModified();
		System.out.println(" last modified Date is :"+new Date(d));
		int l=c.getContentLength();
		System.out.println("Content length is :"+l);
	}
}