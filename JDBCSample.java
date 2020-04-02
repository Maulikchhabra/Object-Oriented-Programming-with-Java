import java.sql.*;

public class JDBCSample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        String url,uname,pass,query;
        url ="jdbc:mysql://localhost:3307/aliens";
        uname="root";
        pass="";
        query="select username from student where userid=3";
		
		
		Class.forName("com.mysql.jdbc.Driver"); //class forname
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		rs.next(); //because the pointer is before the value
		String name =rs.getString("username"); //rs has getString() and getInt() functions to get the values from database
		
		System.out.println(name);
		
		st.close();
		con.close();
		
		
	}

}
