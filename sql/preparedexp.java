package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class preparedexp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student";
		Connection con=DriverManager.getConnection(url,"root","root@gunasheela9");
		System.out.println("Database student connection successfull");
       
		String Query="insert into stu values(?,?)";
		//String Query1="delete from stu where id=1";
        
        PreparedStatement ps=con.prepareStatement(Query);
          
        ps.setInt(1,2);
        ps.setString(2,"guna");
      

      System.out.println("record added");


	}

}
