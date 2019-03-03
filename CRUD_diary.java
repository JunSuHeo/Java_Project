package Cook_recipe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CRUD_diary {

	public void WriteDiary(String table, String id, String food_name, String ingredient, String my_recipe, String memo)
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
        //여기부터 삽입 (요리일기 내용을 새로 저장한다)
        String query = "INSERT INTO " + table + " VALUES (?, ?, ?, ?, ?, ?);";
        pstmt = conn.prepareStatement(query);
        
        Date d = new Date();
		
		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datetime = form.format(d).toString();
        
        
        pstmt.setString(1, id);
        pstmt.setString(2, datetime);
        pstmt.setString(3, food_name);
        pstmt.setString(4, ingredient);
        pstmt.setString(5, my_recipe);
        pstmt.setString(6, memo);
        
        int count = pstmt.executeUpdate();
        
        
        if(count == 0)
        	System.out.println("입력실패");
        else
        	System.out.println("입력 성공");
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
	
	public List<String> ReadTime(String table, String id)
	{
		List<String> time = new ArrayList<String>();
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
        
        //여기부터 SELECT (써놓은 요리일기의 시간을을 전부 가져온다)
        String query = "SELECT last_time FROM " + table + " WHERE id = '" + id + "';";
        stmt = conn.createStatement();
        
        rs = stmt.executeQuery(query);
        
        while(rs.next())	//한줄씩 받아온다.
        {
        	time.add(rs.getString("last_time"));
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
		return time;
	}
	
	public String ReadDiary(String table, String id, String last_time, String column)
	{
		String text = "";
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
        
        //여기부터 SELECT	(특정 시간과 아이디가 일치하는 요리일기를 가져온다)
        String query = "SELECT " + column + " FROM " + table + " WHERE last_time = '" + last_time + "' AND id = '" + id + "';";
        stmt = conn.createStatement();
        
        rs = stmt.executeQuery(query);
        
        rs.next();
        text = rs.getString(column);
        
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
		return text;
	}
	
	public void UpdateDiary(String table, String id, String last_time, String text, String column)
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
        
        //여기부터 수정	(작성했던 요리일기를 수정한다.)
        String query = "UPDATE " + table + " SET " + column + "= '" + text + "' WHERE id = '" + id + "' AND last_time = '" + last_time + "';";
        pstmt = conn.prepareStatement(query);
        
        pstmt.executeUpdate();
        System.out.println(text);
        System.out.println("수정됨");
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
                if(rs!=null){        rs.close();        }
                if(pstmt!=null){    pstmt.close();      }
                if(stmt!=null){    stmt.close();        }
                if(conn!=null){    conn.close();        }
            }
        	catch(SQLException se2){
                se2.printStackTrace();
            }
        }
	}
	
	public void DeleteDiary(String table, String id, String last_time)
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
        
        //여기부터 삭제	(작성했던 요리일기를 삭제한다.)
        String query = "DELETE FROM " + table + " WHERE id = '" + id + "' AND last_time = '" + last_time + "';";
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
	
	public List<String> ReadFoodName(String table, String id)
	{
		List<String> time = new ArrayList<String>();
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
        
        //여기부터 SELECT	(작성했던 요리 일기의 음식이름을 가져온다)
        String query = "SELECT food_name FROM " + table + " WHERE id = '" + id + "';";
        stmt = conn.createStatement();
        
        rs = stmt.executeQuery(query);
        
        while(rs.next())	//한줄씩 받아온다.
        {
        	time.add(rs.getString("food_name"));
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
		return time;
	}
}