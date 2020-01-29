import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class jdbecconnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port ="3306";
		Class.forName("com.mysql.jdbc.Driver");

	Connection connect =DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/Demo", "root", "Barca12345$");
	java.sql.Statement s= connect.createStatement();
	ResultSet rs =s.executeQuery("select * from empinfo where empname ='sam'");
	rs.next();
	System.out.println(rs.getString("location"));
	System.out.println(rs.getInt("id"));
	System.out.println(rs.getInt("age"));

	}

}
