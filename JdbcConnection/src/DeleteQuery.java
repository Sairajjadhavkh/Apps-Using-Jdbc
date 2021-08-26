import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteQuery {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name you want to delete");
		String sname=sc.next();
		try {
			//register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");    
			
			//connection object
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdactest","root","cdac");
			
			//Statement
			Statement stm=con.createStatement();
			//execute query
			stm.executeUpdate("delete from students where name= '"+sname+"' ");
			System.out.println("deleated sucessfully");
			//conection close
			con.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
