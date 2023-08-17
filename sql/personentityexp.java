package sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
class PersonEntity{
 int id;
 String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public PersonEntity(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
 
}
public class personentityexp {
	void insert(List<PersonEntity> personentities)throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student";
		Connection con=DriverManager.getConnection(url,"root","root@gunasheela9");
		String query="Insert into person(id,name) values(?,?)";
		
		PreparedStatement ps=con.prepareStatement(query);
		
		for(PersonEntity personentities1:personentities ) {
			
		ps.setInt(1, personentities1.getId());
		ps.setString(2, personentities1.getName());
		ps.addBatch();
		}
		ps.executeBatch();
		}
	
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
		List<PersonEntity> l=new ArrayList<>();
		l.add(new PersonEntity(1, "sharly"));
		l.add(new PersonEntity(2, "shalu"));


	
	}
	}
