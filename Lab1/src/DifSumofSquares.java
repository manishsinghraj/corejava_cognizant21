/**
*Name: Manish Singh
*Description:Difference btwn sum of square and square of sum 
*Date: 3/14/2021
**/
import java.util.Scanner;

public class DifSumofSquares {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		System.out.println("Difference btwn sum of square and square of sum is: "+calculateDifference(input));
		


	}

	private static int calculateDifference(int input) {
		int diff = 0;
		int sum= 0;
		int squareSum= 0;
		for (int i=1; i<=input; i++)
		{
			sum=sum+i;
		}
		for (int i=1;i<=input;i++)
		{
			squareSum = squareSum+i*i;
		}
		diff = squareSum-sum*sum;
		
		return diff;
	}

}




/**public class DifSumofSquares{ 
  
static int Square_Diff(int n){ 
  
int l, k, m; 
    // Sum of the squares of the 
    // first n natural numbers is 
    l = (n * (n + 1) * (2 * n + 1)) / 6; 
      
    // Sum of n naturals numbers 
    k = (n * (n + 1)) / 2; 
  
    // Square of k 
    k = k * k; 
      
    // Differences between l and k 
    m = Math.abs(l - k); 
      
    return m; 
  
} 
  
// Driver Code 
public static void main(String s[]) 
{ 
    int n = 10; 
    System.out.println(Square_Diff(n));      
      
} 
}  */