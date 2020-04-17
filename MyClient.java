Myimport java.net.*;
import java.io.*;
import java.util.*;
public class MyClient
{
	Socket soc=null;
	BufferedReader br=null;
	String str;
	public MyClient()throws Exception
	{
		soc=new Socket("localhost",1234);
		br=new BufferedReader(new InputStreamReader(System.in));
		str=br.readLine();
		PrintWriter pw=new PrintWriter(soc.getOutputStream());
		pw.println(str);
		System.out.println(pw.checkError());
	}

		public static void main(String args[]) throws Exception
		{
			new MyClient();
		}
	
}