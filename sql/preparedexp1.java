package sql;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class preparedexp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver="com.mysql.cj.jdbc.Driver";
		String un="root";
		String pass="root@gunasheela9";
		String url="jdbc:mysql://localhost:3306/student";

		try {
		Class.forName(driver);
		java.sql.Connection conn=DriverManager.getConnection(url,un,pass);
		String query1="insert into stu values(?,?)";
		PreparedStatement ps=conn.prepareStatement(query1); //prepared statement we are using to add multiple records at a time
		ps.setInt(1, 2);
		ps.setString(2, "guna");
		ps.execute();
		
		System.out.println("Record inserted");
		}catch(Exception e) {
		System.out.println(e);
		}
	}

}
