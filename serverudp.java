import java.net.*;
import java.io.*;
class serverudp
{
	public static DatagramSocket ds;
	public static int sp=101,cp=102;
	public static DatagramPacket p; 
	public static BufferedReader br;
	public static byte buffer[]=new byte[1234]; 
	public static void main(String args[]) throws Exception
	{
		ds=new DatagramSocket(sp);
		br=new BufferedReader(new InputStreamReader(System.in));
		InetAddress i=InetAddress.getByName("localhost");
		while (true)
		{
			String str=br.readLine();
			if((str==null)||str.equals("end"))
			break;
			buffer=str.getBytes();
			p=new DatagramPacket(buffer,buffer.length,i,cp);
			ds.send(p);
		}
	}
}
			
		
	
		
			