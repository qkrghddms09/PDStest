package pds3;

import java.sql.*;
/* import java.sql.Connection
 * import java.sql.PreparedStatement
 * import java.sql.ResultSet */


public class DBClose {
	public void close(Connection conn, PreparedStatement pstmt) {
		try {
			if(pstmt != null) {
				pstmt.close();
			}
		}catch(Exception e) {}
		try {
			if(conn != null) {
				conn.close();
			}
		}catch(Exception e) {}
	}
	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(pstmt != null) {
				pstmt.close();
			}
		}catch(Exception e) {}
		try {
			if(conn != null) {
				conn.close();
			}
		}catch(Exception e) {}
		try {
			if(rs != null) {
				rs.close();
			}
		}catch(Exception e) {}
	}
}
