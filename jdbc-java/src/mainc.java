import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class mainc {
	
	
	 public static void main(String args[])throws Exception
	 {
		 

		Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root");
	    
	    while(true) 
	    {
	    System.out.println("1------insert");
	    System.out.println("2------update");
	    System.out.println("3------delete");
	    System.out.println("4------show");
	    System.out.println("5------Exit");
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your choice");
	    int choice = sc.nextInt();
	    pavanjdbcc obj = new pavanjdbcc();
	    switch (choice) {
		case 1: {
			
			 
			    obj.insert();
			    break;
		}
		
		case 2: {
			
			 
			    obj.update();
			    break;
		}
		
		case 3: {
			
			
			    obj.Delete();
			    break;
		}
		
		case 4: {
			
			
			    obj.show();
			    break;
		}
		case 5:
		{
			System.exit(0);
		}
			
		}
	    
	 	   
		 
	 }

}
}