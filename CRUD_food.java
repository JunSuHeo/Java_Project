package Cook_recipe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CRUD_food {

	public void UpdateFood(String table,String id, String ingredient, String column)
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
        
        //여기부터 수정 (회원의 재료 정보를 수정한다.)
        String query = "UPDATE " + table + " SET " + column + " = '" + ingredient + "' WHERE mem_id = '" + id + "';";
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
	
	
	
	public List<String> ReadFood(String table)
	{
		List<String> food_name = new ArrayList<String>();
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
        
        //여기부터 SELECT (모든 음식의 이름들을 읽어온다)
        String query = "SELECT food_name FROM " + table + ";";
        stmt = conn.createStatement();
        
        rs = stmt.executeQuery(query);
        
        while(rs.next())	//한줄씩 받아온다.
        {
        	food_name.add(rs.getString("food_name"));
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
		return food_name;
	}
	
	public String Readingredient(String table, String food_name)
	{
		String ingredient = "";
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
        
        //여기부터 SELECT (음식의 재료들을 가져온다)
        String query = "SELECT ingredient FROM " + table + " WHERE food_name = '" + food_name + "';";
        stmt = conn.createStatement();
        
        rs = stmt.executeQuery(query);
        
        rs.next();
        
        ingredient = rs.getString("ingredient");
        
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
		
		
		return ingredient;
	}
}
