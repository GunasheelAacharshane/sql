package sql;

public class getsetexp {

	public static void main(String[] args) {
		String sql1
        = "CREATE TABLE STUDENT(STUDENTID VARCHAR2(10) PRIMARY KEY,NAME VARCHAR2(20),DEPARTMENT VARCHAR2(10))";

   
    String sql2
        = "INSERT INTO STUDENT VALUES('S101','JEAN','CSE')";
    String sql3
        = "INSERT INTO STUDENT VALUES('S102','ANA','CSE')";
    String sql4
        = "INSERT INTO STUDENT VALUES('S103','ROBERT','ECE')";
    String sql5
        = "INSERT INTO STUDENT VALUES('S104','ALEX','IT')";
    String sql6
        = "INSERT INTO STUDENT VALUES('S105','DIANA','IT')";
    Object s;
	s.addBatch(sql1);
    s.addBatch(sql2);
    s.addBatch(sql3);		
    s.addBatch(sql4);
    s.addBatch(sql5);
    s.addBatch(sql6);

   s.executeBatch();

	}

}
