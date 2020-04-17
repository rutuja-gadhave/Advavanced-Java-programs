import java.net.*;
import java.io.*;
public class MyServer
{
	ServerSocket ss;
	Socket soc;
	BufferedReader br;
	public MyServer() throws Exception
	{
		ss=new ServerSocket(1234);
		System.out.println("Server is started................ waiting for  client");
		while(true)
		{
			soc=ss.accept();
			System.out.println("Got client :"+soc.getInetAddress().toString());
			br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
			String str=br.readLine();
			System.out.println("Client : "+str);
		}
	}
		public static void main(String args[]) throws Exception
		{
			new MyServer();
		}
	
}
			
