import java.nio.channels.SelectableChannel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.BlobFromLocator;

public class pavanjdbcc {
	
	
	static String name1;
	static String email1;
	static String pass;
	static String gender1;
	static String city1;
    static Connection con ;
    static Scanner sc;

	    void insert() throws Exception{
		  
		    sc =new Scanner(System.in);
		    System.out.print("\n Enter student name :"); 
			name1 = sc.next(); 
			System.out.print("\n Enter gmail id :"); 
			 email1 = sc.next(); 
			System.out.print("\n Enter password :"); 
			 pass= sc.next(); 
			sc.nextLine(); 
			System.out.print(" Enter gender");
			 gender1= sc.next();
				sc.nextLine(); 
			System.out.print("Enter city");
			 city1 = sc.next();
			 
			 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
			 PreparedStatement pStatement =	con.prepareStatement("insert into register values('"+name1+"','"+email1+"','"+pass+"','"+gender1+"','"+city1+"')");		 
				int i =	 pStatement.executeUpdate();
					 
					 if(i>0) {
						 System.out.println("sucess yor data is submited!!!!");
					 }
					 else {
						 
						 System.out.println("fail");
					 }	 	
	    }
	 void update() throws SQLException {
		 
		 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
		 Statement stmt =con.createStatement();
		 sc =new Scanner(System.in);
		 
		 System.out.println("Enter your password which data you update!!!!");
	     String pass = sc.next();
		    System.out.print("\n Enter student name :"); 
			name1 = sc.next(); 
			System.out.print("\n Enter gmail id :"); 
			 email1 = sc.next(); 
			 
			sc.nextLine(); 
			System.out.print(" Enter gender");
			 gender1= sc.next();
				sc.nextLine(); 
			System.out.print("Enter city");
			 city1= sc.next();
			
			 String sqlString =" UPDATE register SET  name='"+name1+"' ,email=' "+email1+"',gender=' "+ gender1 +" ',city=' "+ city1 + "' WHERE password= '" +pass+ "' " ;	
			         
				int count =	stmt.executeUpdate(sqlString);
					 if(count>0) {
						 System.out.println("sucessfully your data is Upadate!!!!");
					 }
					 else {
						 
						 System.out.println("fail");
					 }		 	
		  con.close();	 
	 }
	 
 void Delete()throws SQLException {
		 
	 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
	 sc =new Scanner(System.in);
	 Statement stmt =con.createStatement();
	 System.out.println("Enter your password and Delete your data!!!!");
     String pass = sc.next();
     String deleteQuery = "DELETE FROM register WHERE password ='" +pass+ "' ";
	    
     int count =stmt.executeUpdate(deleteQuery);
	 if(count>0) {
		 System.out.println("sucessfully your data is daleted!!!!");
	 }
	 else {
		 
		 System.out.println("Enter your right password and try again!!!");
	 }
	 	
con.close();
		 
		 
	 }
 
 void show() {
	 
	 try {
		 
		 
		 
		 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
		 Statement stmt  = con.createStatement();
		 
		 ResultSet count = stmt.executeQuery("Select * from register");
		 
		 if(count.next()) {
			 
			String namep = count.getString("name");
			System.out.println("Name:"+namep);
			String emailp = count.getString("email");
			System.out.println("Email:"+emailp);
			String passwordp= count.getString("password");
			System.out.println("Password:"+passwordp);
			String genderp = count.getString("gender");
			System.out.println("Gender:"+genderp);
			String cityp = count.getString("city");
			System.out.println("City:"+cityp);	
			System.out.println("------------------------------------------"); 
			 System.out.println(namep +" "+ emailp + ""+passwordp +" "+ genderp + ""+cityp +" ");
		 }	
		 
		 else {
			System.out.println("no data record!!!!");
		}
	} catch (Exception e) {
		// TODO: handle exception
	}
	 
	 
 }
	 
	 
	
		 
	
}
