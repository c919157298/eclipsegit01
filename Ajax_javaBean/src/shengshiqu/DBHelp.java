package shengshiqu;
import java.sql.Connection;
import java.sql.DriverManager;
 
public class DBHelp {
 
	private static Connection conn = null;
 
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // 加载MySQL数据库驱动
			System.out.println("数据库驱动加载成功！！");
			String url = "jdbc:mysql://localhost:3306/region"; // 定义与连接数据库的url
			String user = "root"; // 定义连接数据库的用户名
			String passWord = "root"; // 定义连接数据库的密码
			conn = DriverManager.getConnection(url, user, passWord); // 连接连接
			System.out.println("已成功的与MySQL数据库建立连接！！");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}