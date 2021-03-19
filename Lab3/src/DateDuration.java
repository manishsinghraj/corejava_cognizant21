 
/**
 * Name:Manish Singh
 * Description: To accept date and to print the Duration in days, months and years with regards to current system date.
 * Date:03/17/21
 */
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateDuration {

	 static void durationDifference(LocalDate start_date,LocalDate end_date) 
	    { 
	  
	        Period difference = Period .between(start_date, end_date); 
	  
	        System.out.print( "Duration diffrence between entered date and current date is: "); 
	  
	        
	        System.out.printf( "%d years %d months and %d days ", difference.getYears(), difference.getMonths(), difference.getDays()); 
	    } 
	  
	   
	    public static void main(String[] args) 
	    { 
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter date in dd<space>mm<space>yyyy Format :");
	        int date = sc.nextInt();
	        int month = sc.nextInt();
	        int year = sc.nextInt();
	        
	        LocalDate start_date = LocalDate.of(+year, +month, +date); 
	  
	        
	        LocalDate end_date  = java.time.LocalDate.now();
	        
	        durationDifference(start_date, end_date); 
	    } 
}