import java.sql.*;
import javax.sql.*;
import java.sql.*;
import java.util.*;
import java.lang.*;
public class jdbc
{
	public static void main(String args[]) throws Exception
	{	int ch,i1=1,i,id;
		String nm,s;
		PreparedStatement ps;
		ResultSet rs=null; 
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","rutuja");
		System.out.println("Connection established!!");
		Scanner sc=new Scanner(System.in);
	do{
		System.out.println("\n1-Insert\n2-delete\n3-update\n4-search\n5-Show all");
		ch=sc.nextInt();
		switch(ch)
		{
			case 1:
			System.out.println("Enter name and id :");
			nm=sc.next();
			id=sc.nextInt();
			ps=con.prepareStatement("insert into form values(?,?)");
			ps.setString(1,nm);
			ps.setInt(2,id);
			i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Record saved");
			}
			break;
			
			case 2:
			System.out.println("Enter id to delete record: ");
			id=sc.nextInt();
			ps=con.prepareStatement("delete from form where id=?");
			ps.setInt(1,id);
			i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Record deleted");
			}
			break;

			case 3:
			System.out.println("Enter id to update record and enter updated name: ");
			id=sc.nextInt();
			nm=sc.next();
			ps=con.prepareStatement("update  form set name=? where id=?");
			ps.setString(1,nm);
			ps.setInt(2,id);
			 i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("Record Updated");
			}
			break;
			
			case 4:
			
			System.out.println("Enter id to search record: ");
			id=sc.nextInt();
			ps=con.prepareStatement("select * from form where id=?");
			ps.setInt(1,id);
			rs=ps.executeQuery();
			rs.next();
			System.out.println("name-"+rs.getString(1)+"\t id-"+rs.getInt(2));
			break;

			case 5:
			 ps=con.prepareStatement("select * from form");
			rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println("name-"+rs.getString(1)+"\t id-"+rs.getInt(2));
			}
			break;
		}
	System.out.println("do you want to continue ........press 1");
		i1=sc.nextInt();
		}while(i1==1);
	}
}