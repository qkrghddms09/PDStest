package pds3;

import java.sql.*;
import java.util.*;

public class DBOpen {
	public Connection getConnection() {
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String id = "scott";
		String passwd = "tiger";
		
		Connection conn = null;
		Statement stmt = null;
		
		
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(url, id, passwd);
			
		}catch(ClassNotFoundException e) {
			System.out.println("오라클 jdbc 드라이버를 찾지 못했습니다.");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
}
