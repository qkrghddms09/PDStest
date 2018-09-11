package pds3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import pds3.DBClose;
import pds3.DBOpen;

public class PdsDAO {
	DBOpen dbopen=null;
	DBClose dbclose=null;
	Connection con=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	StringBuffer sql = null;
	
	public PdsDAO() {
		dbopen=new DBOpen();
		dbclose=new DBClose();
	}
	
}
