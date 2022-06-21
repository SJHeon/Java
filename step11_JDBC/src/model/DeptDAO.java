package model;

import java.sql.Connection;
//import java.sql.DriverManager; util로 빠짐
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.domain.Dept;
import model.domain.DeptDTO;
import util.DBUtil;

public class DeptDAO {

	// step01 * util로 뺀다
	// Driver 로딩
//	static {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}

	// 모든 부서 검색 메소드
	// Query : "select * from dept;"
	public static ArrayList<DeptDTO> getAllDept() throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rset = null;
		ArrayList<DeptDTO> allData = null;

		try {
			// step02 * util로 뺀다
			// DB 연결
			// ip주소, DB 이름, 계정 이름/비밀번호, ...

//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			conn = DBUtil.getConnection(); // 메소드로 만들었다!

			// step03
			// SQL 문장 객체

			stmt = conn.createStatement();

			// step04
			// SQL 문장 객체 실행
			rset = stmt.executeQuery("select * from dept");

			// step05
			// Data 활용
			allData = new ArrayList<DeptDTO>();
			while (rset.next()) {
				allData.add(new DeptDTO(rset.getInt("deptno"), rset.getString("dname"), rset.getString("loc")));
			}
			conn.setAutoCommit(false);
			conn.commit();

			// step06 * util로 뺀다
			// DB 종료
		} finally {
			// close 순서 -> 가장 최근에 사용한 순서로 close
//			rset.close();
//			stmt.close();
//			conn.close();
			DBUtil.close(rset, stmt, conn); // 메소드로 만들었다!
		}

		return allData;
	}

	// (부서명)으로 특정 부서 검색 메소드
	// Query : " select * from dept where dname = "ACCOUNTING"; "
	public static DeptDTO getDept(String dname) throws SQLException {
		DeptDTO selectDept = null;
		Connection conn = null;
		// Statement
// 		Statement stmt = null;

		// PreparedStatement
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		try {
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			conn = DBUtil.getConnection();
			// Statement
//			stmt = conn.createStatement();
//			rset = stmt.executeQuery("select * from dept where dname = " + '"' + dname + '"');

			// PreParedStatement
			pstmt = conn.prepareStatement("select * from dept where dname = ?");
			pstmt.setString(1, dname); // 첫번째 ? 에 dname!
			rset = pstmt.executeQuery();

			selectDept = new DeptDTO();

			while (rset.next()) {
				selectDept = new DeptDTO(rset.getInt("deptno"), rset.getString("dname"), rset.getString("loc"));
			}

			conn.setAutoCommit(false);
			conn.commit();

		} finally {
//			rset.close();
			// Statement
//			stmt.close();
			// PreparedStatement
//			pstmt.close();
//			conn.close();
			DBUtil.close(rset, pstmt, conn); // preparedStatement는 Statement를 상속 받아서 가능!
		}
		return selectDept;
	}

	// 부서 생성 메소드
	// Query : insert into dept values(deptno, dname, loc); -> psmt
	public static boolean insertDept(DeptDTO dept) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("insert into dept values(?, ?, ?)");
			pstmt.setInt(1, dept.getDeptno());
			pstmt.setString(2, dept.getDname());
			pstmt.setString(3, dept.getLoc());

			int r = pstmt.executeUpdate();
			if (r != 0) {
				return true;
			}

		} finally {
//			pstmt.close();
//			conn.close();
			DBUtil.close(pstmt, conn);
		}

		return false;
	}

	// 부서 수정 메소드
	// Query : update dept set loc = "loc" where deptno = 50
	public static boolean updateDept(int dnum, String dloc) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("update dept set loc = ? where deptno = ?");
			pstmt.setString(1, dloc);
			pstmt.setInt(2, dnum);

			int r = pstmt.executeUpdate();
			if (r != 0) {
				return true;
			}

		} finally {
//			pstmt.close();
//			conn.close();
			DBUtil.close(pstmt, conn);
		}
		return false;
	}

	// 부서 삭제 메소드
	// Query : delete from dept where deptno = 50
	public static boolean deleteDept(int dnum) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scott", "scott", "tiger");
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("delete from dept where deptno = ?");
			pstmt.setInt(1, dnum);

			int r = pstmt.executeUpdate();
			if (r != 0) {
				return true;
			}
		} finally {
//			pstmt.close();
//			conn.close();
			DBUtil.close(pstmt, conn);
		}

		return false;
	}

	// Self Challenge innerJoin>?
	// Query : select emp.ename, emp.job, dept.loc from emp, dept where emp.deptno =
	// dept.deptno;

////	public static ArrayList <DeptDTO> getJoinEmpDept() throws SQLException {
////		Connection conn = null;
////		Statement stmt = null;
////		ResultSet rset = null;
////		ArrayList<DeptDTO> allJoinData = null;
////		try {
////			conn = DBUtil.getConnection();
////			stmt = conn.createStatement();
////			rset = stmt.executeQuery("select emp.ename, emp.job, dept.loc from emp, dept where emp.deptno = dept.deptno");
////			
////			allJoinData = new ArrayList<DeptDTO>();
////			while (rset.next()) {
////				allJoinData.add(new DeptDTO(rset.getInt("deptno"), rset.getString("dname"),rset.getString("loc")));
////			
////			}
////			conn.setAutoCommit(false);
////			conn.commit();
////			
////		} finally {
////			
////		}
//		
//		
//	}

	public static void main(String[] args) {
		try {
//			// 모든 부서 검색
//			System.out.println("--- 모든 부서 검색 ---");
//			for (DeptDTO dept : getAllDept()) {
//				System.out.println(dept);
//			}
//
//			System.out.println();
//			// (부서명)으로 특정 부서를 검색
//			System.out.println("--- 부서명으로 특정 부서 검색 ---");
//			System.out.println(getDept("ACCOUNTING"));
//			System.out.println(getDept("SALES"));
//
//			System.out.println();
//			// 부서 생성
//			System.out.println("--- 부서 생성 ---");
//			// boolean insertDept(Dept dept);
////			System.out.println(insertDept(new DeptDTO(50, "PROGRAMMING", "BUSAN")));
//
//			System.out.println();
//			// (부서 번호)로 검색한 해당 부서의 위치 수정
//			System.out.println("--- 부서 수정 ---");
//			// updateDept(50, "SEOUL") -> 50 "BUSAN" -> 50 "SEOUL"
//			System.out.println(updateDept(50, "SEOUL")); // true
//
//			System.out.println();
//			// (부서 번호)로 검색한 해당 부서 삭제
//			System.out.println("--- 부서 삭제 ---");
//
//			System.out.println(deleteDept(50)); // true
//
//			// join으로 불러와보자 (emp dept)
//
			for (DeptDTO dept : getAllDept()) {
				System.out.println(dept);
			}
			Dept deptBuilder = new Dept.Builder().deptno(50).dname("PROGRAMMING").loc("BUSAN").build();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
