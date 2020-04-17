import java.net.*;
import java.io.*;
class udpClient
{
	public static DatagramSocket ds;
	public static int sp=101,cp=102;
	public static byte buffer[]=new byte[1234]; 
	public static DatagramPacket p;
	public static void main(String args[]) throws Exception
	{
		ds=new DatagramSocket(cp);
		while(true)
		{
			p=new DatagramPacket(buffer,buffer.length);
			ds.receive(p);
			String str=new String(p.getData(),0,p.getLength());
			System.out.println(str);
		}
	}
}