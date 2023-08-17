package sql; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class sqlconnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/student";
Connection con=DriverManager.getConnection(url,"root","root@gunasheela9");
System.out.println("Database student connection successfull");
Statement stmt = con.createStatement();
String query1= "INSERT INTO student values('mca1','guna','mca')";
		stmt.executeUpdate(query1);
System.out.println("Record inserted");
		
	
	}

}
