package dept.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import dept.dto.DeptDto;
import test.util.DBConnect;

public class DeptDao {
	public boolean insert(DeptDto dto) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		int rowCount = 0;
		
		
		try {
			conn = new DBConnect().getConn();
			String sql = "INSERT INTO dept"
					+ " (deptno, dname, loc)"
					+ " values(?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, dto.getDeptno());
			pstmt.setString(2, dto.getDname());
			pstmt.setString(3, dto.getLoc());
			rowCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
		if (rowCount > 0){
			return true;
		} else{
			return false;
		}
		
	}
}
