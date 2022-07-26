package phase1.project;
import java.util.ArrayList;
import java.util.Scanner;
public class Validation {
	public static void main(String[] args) 
    
    {
        
        ArrayList<String> emailID = new ArrayList<String>();
        
        emailID.add("Raman.singh@xms.com");
        emailID.add("deepansh.yadav@axisbank.com");
        emailID.add("Raju.kumar@yahoo.com");
        emailID.add("Ankita.shrivastav@blast.com");
        emailID.add("ashish.tripathi@gmail.com");
        emailID.add("Ramesh.bagel@rsht.com");
        emailID.add("Aman.kumar@rediffmail.com");
        
         
        String searchEmail = null;
      
        System.out.println("Enter the email to search");
         
        try (Scanner input = new Scanner(System.in))
         
         {
			System.out.println("Enter email Id : ");
            searchEmail = input.nextLine(); 
		 }
        
        
         if(emailID.contains(searchEmail))
            	 
           {
            	 
            System.out.println("email ID " + searchEmail + " found");
            
           }
         
         else
    	  
           {
    	  
             System.out.println( "email ID " + searchEmail + " not found");
          
           }   
             
        }

}
