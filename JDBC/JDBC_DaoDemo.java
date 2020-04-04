import java.sql.*;


//DAO means Data Access Objects 

class Student{
	int rollno;
	String sname;
}

class StudentDAO{
	
	public Student getStudent(int rollno){
		try {
			String query = "select username from student where userid="+rollno;
			Student s = new Student();
			s.rollno = rollno;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/aliens","root","3780");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			rs.next();
			String name  = rs.getString(1);
			s.sname = name;
			return s;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;		
	}
	
	
}

public class JDBC_DaoDemo {

	public static void main(String args[]){
		
		StudentDAO dao = new StudentDAO();
		Student s1 = dao.getStudent(4);
		System.out.println(s1.sname);
	}
}
