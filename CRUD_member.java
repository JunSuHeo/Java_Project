package Cook_recipe;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CRUD_member {
	public void UpdateLog(String table, String id)
	{
		Statement stmt = null;
		Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        final String uid = "root";
        final String pwd = "Gjwns266255!";
        final String url = "jdbc:mysql://localhost:3306/test_db?serverTimezone=UTC";
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // JDBC 드라이버 로드
        conn = DriverManager.getConnection(url, uid, pwd);//URL,UID,PWD     
        
        Date d = new Date();
		//날짜와 시간을 받아온다.
		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datetime = form.format(d).toString();
        
        //여기부터 수정 (로그인을 하면 마지막 로그인 시간을 변경한다.)
        String query = "UPDATE " + table + " SET mem_lastlog = '" + datetime + "' WHERE mem_id = '" + id + "';";
        pstmt = conn.prepareStatement(query);
        
        pstmt.executeUpdate();
        }
        catch(ClassNotFoundException ce){
        	ce.printStackTrace();  
        }
        catch(SQLException se){
        	se.printStackTrace();  
        }
        catch(Exception e){
        	e.printStackTrace();  
        }
        
        finally{
        	try{ // 연결 해제(한정돼 있으므로)
                if(rs!=null){        rs.close();            }
                if(pstmt!=null){    pstmt.close();        }
                if(stmt!=null){    stmt.close();        }
                if(conn!=null){    conn.close();        }
            }
        	catch(SQLException se2){
                se2.printStackTrace();
            }
        }
	}
	
	
	public boolean LogIn(String table, String id, String psw)
	{
		Statement stmt = null;
		Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        final String uid = "root";
        final String pwd = "Gjwns266255!";
        final String url = "jdbc:mysql://localhost:3306/test_db?serverTimezone=UTC";
        boolean complete = false;
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // JDBC 드라이버 로드
        conn = DriverManager.getConnection(url, uid, pwd);//URL,UID,PWD        
        
        //여기부터 SELECT (id와 password가 일치하는 것을 찾는다.)
        String query = "SELECT mem_id,mem_password FROM " + table + ";";
        stmt = conn.createStatement();
        
        rs = stmt.executeQuery(query);
        
        while(rs.next())	//한줄씩 받아온다.
        {
        	String id_row = rs.getString("mem_id");
        	String psw_row = rs.getString("mem_password");
        	
        	String[] arr = id_row.split(",");
        	String[] arr1 = psw_row.split(",");
        	
        	for(int i = 0; i < arr.length; i++) {	//id와 password가 같은 부분을 찾음
        		if(id.equals(arr[i]) && psw.equals(arr1[i])) {
        			complete = true;
        			break;
        		}
        	}
        }
        
        }
        
        catch(ClassNotFoundException ce){
            complete = false;          
        }
        catch(SQLException se){
        	complete = false;   
        }
        catch(Exception e){
        	complete = false;
        }
        
        finally{
        	try{ // 연결 해제(한정돼 있으므로)
                if(rs!=null){        rs.close();            }
                if(pstmt!=null){    pstmt.close();        }
                if(stmt!=null){    stmt.close();        }
                if(conn!=null){    conn.close();        }
            }
        	catch(SQLException se2){
        		complete = false;
            }
        }
        return complete;
	}
	
	public boolean JoinMember(String table, String id, String name, String birth, String psw)
	{
		Statement stmt = null;
		Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        final String uid = "root";
        final String pwd = "Gjwns266255!";
        final String url = "jdbc:mysql://localhost:3306/test_db?serverTimezone=UTC";
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // JDBC 드라이버 로드
        conn = DriverManager.getConnection(url, uid, pwd);//URL,UID,PWD        
        
        //여기부터 삽입 (회원가입 할때 필요한 정보들을 입력시킨다.)
        String query = "INSERT INTO " + table + " (mem_id, mem_name, mem_birth, "
        		+ "mem_password, mem_joindate, mem_lastlog) VALUES (?, ?, ?, ?, ?, ?);";
        pstmt = conn.prepareStatement(query);
        
        Date d = new Date();
		//가입시간과 초기 로그인 시간을 현재 시간으로 설정한다.
		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datetime = form.format(d).toString();
        
        
        pstmt.setString(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, birth);
        pstmt.setString(4, psw);
        pstmt.setString(5, datetime);
        pstmt.setString(6, datetime);
        
        int count = pstmt.executeUpdate();
        
        
        if(count == 0)
        	System.out.println("입력실패");
        else
        	System.out.println("입력 성공");
        }
        
        catch(ClassNotFoundException ce){
        	return false;          
        }
        catch(SQLException se){
            return false;
        }
        catch(Exception e){
        	return false;
        }
        
        finally{
        	try{ // 연결 해제(한정돼 있으므로)
                if(rs!=null){        rs.close();            }
                if(pstmt!=null){    pstmt.close();        }
                if(stmt!=null){    stmt.close();        }
                if(conn!=null){    conn.close();        }
            }
        	catch(SQLException se2){
                se2.printStackTrace();
                return false;
            }
        }
        return true;
	}
	
	/*public void DeleteMember(String table, String id)
	{
		Statement stmt = null;
		Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        final String uid = "root";
        final String pwd = "Gjwns266255!";
        final String url = "jdbc:mysql://localhost:3306/test_db?serverTimezone=UTC";
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // JDBC 드라이버 로드
        conn = DriverManager.getConnection(url, uid, pwd);//URL,UID,PWD        
        
        //여기부터 삭제
        String query = "DELETE FROM " + table + " WHERE mem_id = " + id + ");";
        pstmt = conn.prepareStatement(query);
        
        
        int count = pstmt.executeUpdate();
        if(count == 0)
        	System.out.println("삭제 실패");
        else
        	System.out.println("삭제 성공");
        }
        
        catch(ClassNotFoundException ce){
            ce.printStackTrace();            
        }
        catch(SQLException se){
            se.printStackTrace();    
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        finally{
        	try{ // 연결 해제(한정돼 있으므로)
                if(rs!=null){        rs.close();            }
                if(pstmt!=null){    pstmt.close();        }
                if(stmt!=null){    stmt.close();        }
                if(conn!=null){    conn.close();        }
            }
        	catch(SQLException se2){
                se2.printStackTrace();
            }
        }
        System.out.println("연결 해제");
	}
	
	public void Select(String table)	//음식의 재료가 한개씩 나온다.
	{
		Statement stmt = null;
		Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        final String uid = "root";
        final String pwd = "Gjwns266255!";
        final String url = "jdbc:mysql://localhost:3306/test_db?serverTimezone=UTC";
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // JDBC 드라이버 로드
        conn = DriverManager.getConnection(url, uid, pwd);//URL,UID,PWD        
        
        //여기부터 SELECT (회원 재료를 가져온다)
        String query = "SELECT ingredient FROM " + table + ";";
        stmt = conn.createStatement();
        
        rs = stmt.executeQuery(query);
        
        while(rs.next())	//한줄씩 받아온다.
        {
        	String ingredient = rs.getString("ingredient");
        	
        	System.out.println(ingredient);
        }
        
        }
        
        catch(ClassNotFoundException ce){
            ce.printStackTrace();            
        }
        catch(SQLException se){
            se.printStackTrace();    
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        finally{
        	try{ // 연결 해제(한정돼 있으므로)
                if(rs!=null){        rs.close();            }
                if(pstmt!=null){    pstmt.close();        }
                if(stmt!=null){    stmt.close();        }
                if(conn!=null){    conn.close();        }
            }
        	catch(SQLException se2){
                se2.printStackTrace();
            }
        }
        System.out.println("연결 해제");
	}*/
	
	public String GetIngredient(String table, String id, String column)
	{
		Statement stmt = null;
		Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        final String uid = "root";
        final String pwd = "Gjwns266255!";
        final String url = "jdbc:mysql://localhost:3306/test_db?serverTimezone=UTC";
        String mem_ingredient = "";
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // JDBC 드라이버 로드
        conn = DriverManager.getConnection(url, uid, pwd);//URL,UID,PWD        
        
        //여기부터 SELECT (회원이 가지고 있는 재료들을 전부 가져온다.)
        String query = "SELECT " + column + " FROM " + table + " WHERE mem_id = '" + id + "';";
        stmt = conn.createStatement();
        
        rs = stmt.executeQuery(query);
        
        rs.next();
        mem_ingredient = rs.getString(column);
        }
        
        catch(ClassNotFoundException ce){
            ce.printStackTrace();       
        }
        catch(SQLException se){
        	se.printStackTrace();
        }
        catch(Exception e){
        	e.printStackTrace();
        }
        
        finally{
        	try{ // 연결 해제(한정돼 있으므로)
                if(rs!=null){        rs.close();            }
                if(pstmt!=null){    pstmt.close();        }
                if(stmt!=null){    stmt.close();        }
                if(conn!=null){    conn.close();        }
            }
        	catch(SQLException se2){
        		se2.printStackTrace();
            }
        }
        
        return mem_ingredient;
	}
}
