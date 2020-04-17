import java.sql.*;
import javax.sql.*;
class TestJdbcApplication 
{
	public static void main(String args[])
throws Exception
	{
		//load driver- step1
		Class.forName("oracle.jdbc.OracleDriver");
		//connection to db-step2
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","rutuja");
		System.out.println("connection:"+con);
		
		//save data
		PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?) ");
		ps.setInt(1,101);
		ps.setString(2,"Rutuja");
		ps.setString(3,"neha");
		int i=ps.executeUpdate();
		if(i>0)
		{
			System.out.println("Record Save.......!!!!!!");
		}
	}
}
