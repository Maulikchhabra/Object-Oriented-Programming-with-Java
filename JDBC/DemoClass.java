import java.sql.*;

public class DemoClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
        String url,uname,pass,query1, query2,query3,query4; //declarations
        
        url ="jdbc:mysql://localhost:3306/aliens"; //logging in to database
        uname="root";
        pass="3780";
        
        //Queries
        query1="select username from student where userid=3";
        query2="select * from student";
        query3="insert into student values (5,'Tony')";
        query4="insert into student values (?,?)"; //in case of prepared statement we can leave the values unknown as ? in the query initializing them later.
		
		
		Class.forName("com.mysql.jdbc.Driver"); //class forname
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query1);
		rs = st.executeQuery(query2); //executing other query from same ResultSet object
		
		rs.next(); //because the pointer is before the value
		String name =rs.getString("username"); //rs has getString() and getInt() functions to get the values from database
		String userData = rs.getInt(1) +" : "+rs.getString(2); //storing values in userData string
		
		
		System.out.println("Output for query1: "+name); //printing the name for query1
		
		System.out.println("Output for query2 without loop: "+userData); //printing user data for query2 (this will give only 1st entry in the database)
		
		while(rs.next()){
			//In this case it is not printing 1st entry cause we already did rs.next() one time before the loop
			userData = rs.getInt(1) +" : "+rs.getString(2);
			System.out.println("Output for query2 with loop: "+userData); //printing all the entries in database
		}
		
		/*
		int count1 = st.executeUpdate(query3); //inserting data to database through jdbc
		//System.out.println("Output for query3 (check in database) and number of rows affected: "+count1); //seeing how many rows got affected (added or deleted)
		//After running the program one time and running again this will give error says duplicate values not allowed for primary key as it is pushed one time in the database
		*/
		
		/*
		//Inserting values through Prepared Statement
		PreparedStatement pst = con.prepareStatement(query4); //prepared statement
		//Initializing values for query4
		pst.setInt(1, 6); //setting value of column 1 as 6 for query4
		pst.setString(2, "Steve"); //setting value of column 2 as Steve for query4
		int count2 =pst.executeUpdate();
		System.out.println("Output for query4 (check in database) and number of rows affected: "+count2);
		//After running the program one time and running again this will give error says duplicate values not allowed for primary key as it is pushed one time in the database
		*/
		
		st.close();
		con.close();
		
		
	}

}
