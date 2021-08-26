import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class GetDataFromMysql {

	public static void main(String[] args) {	
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cdactest","root","cdac");
				Statement stm=con.createStatement();
				ResultSet res=stm.executeQuery("select * from students");
				

				while(res.next()) {
					System.out.println(res.getInt("id")+" "+res.getString("name")+" "+res.getString("course"));
				}
				con.close();
			}catch (Exception e) {
				e.printStackTrace();
			}	
	}
}

