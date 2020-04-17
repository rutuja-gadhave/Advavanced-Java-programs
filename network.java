import java.net.*;
class network
{
	public static void main(String args[]) throws UnknownHostException
	{
		InetAddress i=InetAddress.getLocalHost();
		System.out.println("Localhost is :"+i);
		i=InetAddress.getByName("google.com");
		System.out.println("Name  is :"+i);		
		InetAddress sa[]=InetAddress.getAllByName("www.nba.com");
		for(int j=0;j<sa.length;j++)
		{
			System.out.println("All by name is :"+sa[j]);
		}
		System.out.println(" host Name  is :"+i.getHostName());
		System.out.println(" host address  is :"+i.getHostAddress());
	}
}