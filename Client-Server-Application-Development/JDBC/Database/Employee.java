package Database;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Employee {

	/**
	 * @param args
	 */
	String str;
	Connection con;
	java.sql.Statement stmt;
	ResultSet rs;
	String sql;
	public Employee() {
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@gnyanpeeth:1521:global","scott","seed");
			sql="select ename from emp";
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString("ename"));
			}
			sql="insert into emp(empno,ename,sal,deptno) values(5446,'ABC','9975','10')";
			int i=stmt.executeUpdate(sql);
			System.out.println("Records Inserted"+i);
			
			sql="update emp set sal=15000 where empno=5445";
			int j=stmt.executeUpdate(sql);
			System.out.println("Records Inserted"+j);
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee();
	}


}
