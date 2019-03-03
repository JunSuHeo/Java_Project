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
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // JDBC ����̹� �ε�
        conn = DriverManager.getConnection(url, uid, pwd);//URL,UID,PWD     
        
        Date d = new Date();
		//��¥�� �ð��� �޾ƿ´�.
		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String datetime = form.format(d).toString();
        
        //������� ���� (�α����� �ϸ� ������ �α��� �ð��� �����Ѵ�.)
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
        	try{ // ���� ����(������ �����Ƿ�)
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
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // JDBC ����̹� �ε�
        conn = DriverManager.getConnection(url, uid, pwd);//URL,UID,PWD        
        
        //������� SELECT (id�� password�� ��ġ�ϴ� ���� ã�´�.)
        String query = "SELECT mem_id,mem_password FROM " + table + ";";
        stmt = conn.createStatement();
        
        rs = stmt.executeQuery(query);
        
        while(rs.next())	//���پ� �޾ƿ´�.
        {
        	String id_row = rs.getString("mem_id");
        	String psw_row = rs.getString("mem_password");
        	
        	String[] arr = id_row.split(",");
        	String[] arr1 = psw_row.split(",");
        	
        	for(int i = 0; i < arr.length; i++) {	//id�� password�� ���� �κ��� ã��
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
        	try{ // ���� ����(������ �����Ƿ�)
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
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // JDBC ����̹� �ε�
        conn = DriverManager.getConnection(url, uid, pwd);//URL,UID,PWD        
        
        //������� ���� (ȸ������ �Ҷ� �ʿ��� �������� �Է½�Ų��.)
        String query = "INSERT INTO " + table + " (mem_id, mem_name, mem_birth, "
        		+ "mem_password, mem_joindate, mem_lastlog) VALUES (?, ?, ?, ?, ?, ?);";
        pstmt = conn.prepareStatement(query);
        
        Date d = new Date();
		//���Խð��� �ʱ� �α��� �ð��� ���� �ð����� �����Ѵ�.
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
        	System.out.println("�Է½���");
        else
        	System.out.println("�Է� ����");
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
        	try{ // ���� ����(������ �����Ƿ�)
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
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // JDBC ����̹� �ε�
        conn = DriverManager.getConnection(url, uid, pwd);//URL,UID,PWD        
        
        //������� ����
        String query = "DELETE FROM " + table + " WHERE mem_id = " + id + ");";
        pstmt = conn.prepareStatement(query);
        
        
        int count = pstmt.executeUpdate();
        if(count == 0)
        	System.out.println("���� ����");
        else
        	System.out.println("���� ����");
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
        	try{ // ���� ����(������ �����Ƿ�)
                if(rs!=null){        rs.close();            }
                if(pstmt!=null){    pstmt.close();        }
                if(stmt!=null){    stmt.close();        }
                if(conn!=null){    conn.close();        }
            }
        	catch(SQLException se2){
                se2.printStackTrace();
            }
        }
        System.out.println("���� ����");
	}
	
	public void Select(String table)	//������ ��ᰡ �Ѱ��� ���´�.
	{
		Statement stmt = null;
		Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        final String uid = "root";
        final String pwd = "Gjwns266255!";
        final String url = "jdbc:mysql://localhost:3306/test_db?serverTimezone=UTC";
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // JDBC ����̹� �ε�
        conn = DriverManager.getConnection(url, uid, pwd);//URL,UID,PWD        
        
        //������� SELECT (ȸ�� ��Ḧ �����´�)
        String query = "SELECT ingredient FROM " + table + ";";
        stmt = conn.createStatement();
        
        rs = stmt.executeQuery(query);
        
        while(rs.next())	//���پ� �޾ƿ´�.
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
        	try{ // ���� ����(������ �����Ƿ�)
                if(rs!=null){        rs.close();            }
                if(pstmt!=null){    pstmt.close();        }
                if(stmt!=null){    stmt.close();        }
                if(conn!=null){    conn.close();        }
            }
        	catch(SQLException se2){
                se2.printStackTrace();
            }
        }
        System.out.println("���� ����");
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
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance(); // JDBC ����̹� �ε�
        conn = DriverManager.getConnection(url, uid, pwd);//URL,UID,PWD        
        
        //������� SELECT (ȸ���� ������ �ִ� ������ ���� �����´�.)
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
        	try{ // ���� ����(������ �����Ƿ�)
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
