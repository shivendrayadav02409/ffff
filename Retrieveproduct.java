package Practice2;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import java.sql.Connection; 

import java.sql.ResultSet; 
import java.sql.Statement;
public class Retrieveproduct {
	private static final String url = "jdbc:mysql://localhost:3306/db1";
    private static final String user = "root";
    private static final String password = "12345";
    
    private static Connection conct;
    private static Statement stmnt;
    private static PreparedStatement prpSt;
    private static ResultSet rs;
   
	public static void main(String[] args) throws SQLException
	{
		
		Retrieveproduct re=new Retrieveproduct();
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("           product chart          ");
        System.out.println("1: insert the new product record"); 
        System.out.println("2: retrive the product Record");
        System.out.println("                                       ");
    	System.out.println("Enter the choice from (1 or 2): ");
    	
    	int number = input.nextInt();
    	System.out.println("You entered option" + number);
    	
    	switch(number)
    	{
    	case 1: re.insertProductrecord();
    	        break;
    	
    	case 2: re.retriveProductrecord();
    	        break;
    	default:
    	        System.out.println("invalid data");
    	        
    	}	
        	
	}
		
	public void insertProductrecord() throws SQLException
	{
		String query = "INSERT INTO db1.product (product_id, product_name, product_price) \n" + 
                        " VALUES (?, ?, ?);";
		 try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            conct = DriverManager.getConnection(url, user, password);
		        prpSt = conct.prepareStatement(query);
		
               Scanner input = new Scanner(System.in);  
                 System.out.print("Enter the product ID");
                 int prdid = input.nextInt();
                 System.out.println();

                 System.out.print("Enter the productname");
                 String prdname = input.next();
                 System.out.println();

                 
                 System.out.print("Enter the product price:  ");
                 int prdprice = input.nextInt();
                 System.out.println();

                prpSt.setInt(1, prdid);
                prpSt.setString(2, prdname);
                prpSt.setInt(3, prdprice);
                
                int count = prpSt.executeUpdate();

                //.. show product quantity..........
                
                    
         } 
		 catch (ClassNotFoundException e) { e.printStackTrace(); } 
		      catch (SQLException e) { e.printStackTrace(); } 
		 finally
		 {
              prpSt.close();
           	  conct.close();
             } 
    }
		 
		 public void retriveProductrecord() throws SQLException 
		 {
			 try 
			 {
				 Class.forName("com.mysql.cj.jdbc.Driver");
		         conct = DriverManager.getConnection(url, user, password);
		         Scanner sc=new Scanner(System.in);
		         System.out.println("Enter the product_id:");
		         int k=sc.nextInt();
		         stmnt = conct.createStatement();
			 String query1 = "select product_id, product_name, product_price from product where product_id="+k;
             ResultSet rs =  stmnt.executeQuery(query1);
             System.out.println("Product_Id    Product_Name    Product_price");

             while (rs.next()) 
             {
                int id = rs.getInt("product_id");
                String name = rs.getString("product_name");
                int prz = rs.getInt("product_price");
                System.out.println(id + "         " + name+"                    "+prz);
              }
			 } catch (Exception e) { e.printStackTrace(); }
			 finally
			 {
                		
                	    conct.close();
                	}
                }
}
