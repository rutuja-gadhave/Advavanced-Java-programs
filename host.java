import java.net.*;
class host
{
	public static void main(String args[])
	{
		 InetAddress ia=new InetAddress("www.google.com");
		System.out.println("hostname is : "+ia.getByName());
	}
}
		

