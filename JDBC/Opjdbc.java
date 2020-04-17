import java.sql.*;
import javax.sql.*;
import java.lang.*;
import java.util.*;

public class Opjdbc 
{
	public static void main(String args[])
	{
		int no,ch,i;
		PreparedStatement ps=null;
		ResultSet rs=null;
		String s,a;
		try
		{		
		//load driver
		Class.forName("oracle.jdbc.OracleDriver");
		//connection to DB
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","rutuja");
		System.out.println("connection to DB:"+con);
		Scanner sc=new Scanner(System.in);
		//save data
		do
		{
		System.out.println("Enter your choice:\n1:insert\n2:delete\n3:search\n4:update\n5:display all\n6:exit");
		
		ch=sc.nextInt();

		switch(ch)
		{
		case 1:
		//insert
			System.out.println("enter roll no ,name and address");
			no=sc.nextInt();
			s=sc.next();
			a=sc.next();
			ps=con.prepareStatement("insert into table1 values(?,?,?)");
			ps.setInt(1,no);
			ps.setString(2,s);
			ps.setString(3,a);
			i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Record saved");
			}
			break;
		case 2:
		//delete
			System.out.println("enter roll no to delete record");
			no=sc.nextInt();
			ps=con.prepareStatement("delete from table1 where no=?");
			ps.setInt(1,no);
			i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Record deleted");
			}
			break;
		case 3:
		//search
			System.out.println("enter roll no to search record");
			no=sc.nextInt();
			ps=con.prepareStatement("select * from table1 where no=?");
			ps.setInt(1,no);
			i=ps.executeUpdate();
			rs=ps.executeQuery();
			rs.next();
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			break;
		case 4:
		//update
			System.out.println("enter roll no to update record and enter updated name");
			no=sc.nextInt();
			s=sc.next();
			ps=con.prepareStatement("update table1 set s=? where no=?");
			ps.setString(1,s);
			ps.setInt(2,no);
			i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Record Updated");
			}
			break;
		case 5:
		//display all
			s="select * from table1";
			Statement st=con.createStatement();	
			rs=st.executeQuery(s);
			
			ResultSetMetaData rsmd=rs.getMetaData();
			System.out.println("\n-----------------------------------------------------------------------------------------");
			for(i=1;i<=rsmd.getColumnCount();i++)
			{
				System.out.print(rsmd.getColumnName(i)+"\t");
			}
			System.out.println("\n-----------------------------------------------------------------------------------------");
			while(rs.next())	
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
			break;
		case 6:
			break;
		default:
			System.out.println("you have entered wrong choice");
		}
		System.out.println("do you want to continue ........press 1");
		i=sc.nextInt();
		}while(i==1);
		}
		catch(Exception e)
		{
			System.out.println("exception is:"+e);
		}
	}
}
