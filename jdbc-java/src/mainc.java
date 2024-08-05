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



 import java.awt.Choice;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {
	
	
	int no1;
	int no2;
	float sum;
	float sub;
	float div;
	float mult;
	int choice;
	
	
	
	Scanner scanner = new Scanner(System.in);
	
	
	   
	   void userinput() {
		   
		   try {
			   
			   System.out.println("Enter the num1");
			   no1=scanner.nextInt();
			   System.out.println("Enter the num2");
			   no2=scanner.nextInt();
			
		} catch (InputMismatchException e) {
			  System.out.println("*******************************************");
                    System.out.println("Enter only Number Value");
                    System.out.println("*******************************************");
		}
		  
		   
		   
	   }
	   
	   void  selection(){
		   
		   System.out.println("1----Addition");
		   System.out.println("2----sub");
		   System.out.println("3----Multiplication");
		   System.out.println("4----division");
		   System.out.println("Enter the choice");
		   
		   try {
			    choice = scanner.nextInt();
			   
		} catch (InputMismatchException e) {
			
			System.out.println("Enter Only Number Value!!!");
		}
			 
			  
			  if(choice==1) {
				  
				  sum=no1+no2;
				  
				  System.out.println("sum of "+ no1 +" "+"and"+no2+" "+":"+ sum);
			  }else if (choice==2) {
				  
				  sub=no1-no2;
				  System.out.println("sub of "+ no1 +" "+"and"+no2+" "+":"+ sub);
			}
           else if (choice==3) {
				  
				  mult=no1*no2;
				  
				  System.out.println("mult of "+ no1 +" "+"and"+no2+" "+":"+ mult);
				
			}
        else if (choice==4) {
	  
        	try {
        		 div=no1/no2;
        		    
     	        System.out.println("div of "+ no1 +" "+"and"+no2+" "+":"+ div);
     	
			} catch (ArithmeticException e) {
				
				System.out.println("Cant divided zero");
			}
	   
           }else {
			
        	   System.out.println("choice invalid!!!");
		}
		   
		   
	   }
	   
	   
	

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	    while(true) {
	    	
	    	System.out.println("***********************************************");
		
		  System.out.println("1----Basic calc");
		  System.out.println("2-----sintific clac");
		  System.out.println("Enter the choice");
		  int choice = scanner.nextInt();
		  
		  if(choice==1) {
			  
			  Calc aaCalc = new Calc();
			  aaCalc.userinput();
			  aaCalc.selection();
			  
			  
			  
		  }else if(choice==2) {
			  
			  Sclac aaSclac = new Sclac();
			  aaSclac.userinput();
			  aaSclac.selection();
			
		}
		  
		 
	    }
		
		
		
		

	}

}

=================
	import java.util.Scanner;

public class Sclac {

	double no1;
	
	double sin;
	double cos;
	double power;
	double sqrt;
	
	Scanner scanner=new Scanner(System.in);
	
	 void userinput() {
		   
		   System.out.println("Enter the num1");
		   no1=scanner.nextInt();
		   
		      
	   }
	 
	 
	 void selection() {
		 
		   System.out.println("1----sin");
		   System.out.println("2----cos");
		   System.out.println("3----sqrt");
		   System.out.println("4----power");
		   
		   
		   System.out.println("Enter the choice");
			  int choice = scanner.nextInt();
			  
			  if (choice==1) {
				  
				  
				  sin= Math.sin(no1);
				  System.out.println("sin of "+ no1+ " " +":"+ sin);
				  
				  
				
			} else if (choice==2) {
				  
				  cos=Math.cos(no1);
				  
				  System.out.println("cos of "+ no1+"and"+":"+ cos);
				
			}
			else if (choice==3) {
				  
				 sqrt =Math.sqrt(no1);
				  
				  System.out.println(sqrt);
				
			}
			  
			else if (choice==4) {
				
				System.out.println("Enter the num1");
				 int no2=scanner.nextInt();
				  
				 power =Math.pow(no1, no2);
				  
				  System.out.println(power);
				
			}else {
				System.out.println("invalid choice!!!");
			}
	 }

}

