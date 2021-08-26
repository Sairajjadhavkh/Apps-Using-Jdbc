import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class Updatequery {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the course");
		String scourse=sc.next();
		System.out.println("enter name ");
		String sname=sc.next();
		
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdactest","root","cdac");
				Statement stm=con.createStatement();
				
				int i= stm.executeUpdate("update students set name='"+sname+"' where course='"+scourse+"' ");

				System.out.println("table updated sucessfully");
				con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}	

	}

}
