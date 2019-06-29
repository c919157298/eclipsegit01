package ajax;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConn {
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver" ;
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String USER = "a1" ;
	private static final String PASSWORD = "a1" ;
	private static Connection conn = null ;
	
	static {
		try {
			Class.forName(DRIVER) ;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConn() {
		if (conn == null) {
			try {
				conn = DriverManager.getConnection(URL, USER, PASSWORD) ;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conn;
	}
	
}
