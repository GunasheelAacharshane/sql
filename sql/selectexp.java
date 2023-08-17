package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class selectexp {
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/student";
	Connection con=DriverManager.getConnection(url,"root","root@gunasheela9");
	System.out.println(con);
	
	System.out.println("Database student connection successfull");
	ResultSet rs=null;
	Connection c;
	Statement stmt =(Statement) c.createStatement();
	rs=stmt.executeQuery("select * from student");
	while(rs.next()) {
	System.out.println("roll :"+rs.getString("roll"));

	System.out.println("name :"+rs.getString("name"));


	System.out.println("class:"+rs.getString("class"));

	
	System.out.println();

	}

	}
	}


