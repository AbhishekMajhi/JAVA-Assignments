package doa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnection {
	
	  public static Connection connect() throws SQLException,ClassNotFoundException{

		String url = "jdbc:mysql://localhost:3306/booklib";
		String uname = "root";
		String pass = "852456";
		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con=DriverManager.getConnection(url,uname,pass);
	    System.out.println("Returning Connection Obj");
	    return con;
	}
}
