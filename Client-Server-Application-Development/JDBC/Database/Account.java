package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Account {

	/**
	 * @param args
	 */
	int bal,actid;
	String name;
	
	String str;
	Connection con;
	java.sql.Statement stmt;
	ResultSet rs;
	String sql;
	PreparedStatement psmt;
	public Account() {
		actid=1;
		/*try{
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@gnyanpeeth:1521:global","scott","seed");
			sql="select ename from emp";
			stmt=con.createStatement();
			sql="insert into account(accno,name,bal) values(54,'ABC','9975')";
			int i=stmt.executeUpdate(sql);
			System.out.println("Records Inserted"+i);
			
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
		*/
		
	}
	public void moneyTransfer(Account from,Account to,int amount){
		try{
			con.setAutoCommit(false);
			from.bal=from.bal-amount;
			psmt=con.prepareStatement("update account set bal=? where accno=?");
			psmt.setInt(1,from.bal);
			psmt.setInt(2,from.actid);
			int i=psmt.executeUpdate();
			to.bal=to.bal+amount;
			psmt=con.prepareStatement("update account set bal=? where accno=?");
			psmt.setInt(1,to.bal);
			psmt.setInt(2,to.actid);
			i=psmt.executeUpdate();
			con.commit();
			System.out.println("Money Tranferred successfully");
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public Account(int bal, int actid, String name) {
		//super();
		this.bal = bal;
		this.actid = actid;
		this.name = name;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con=DriverManager.getConnection("jdbc:oracle:thin:@gnyanpeeth:1521:global","scott","seed");
			/*sql="select ename from emp";
			stmt=con.createStatement();
			sql="insert into account values(actid,name,bal)";
			int i=stmt.executeUpdate(sql);*/
			psmt=con.prepareStatement("insert into account values(?,?,?)");
			psmt.setInt(1,actid);
			psmt.setString(2,name);
			psmt.setInt(3,bal);
			int i = psmt.executeUpdate();
			System.out.println("Records Inserted"+i);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account from=new Account(10000,57,"CCC");
		Account to=new Account(10000,56,"DDD");
		//Account t=new Account();
		from.moneyTransfer(from, to, 3333);
	}

}
