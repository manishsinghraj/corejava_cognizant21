/**
*Name: Manish Singh
*Description: Find whether the number is an increasing or decreasing.
*Date: 3/14/2021
**/
import java.util.Scanner;
public class NumIncreasingOrder {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc =new Scanner(System.in);
		int input =sc.nextInt();
		boolean answer =checkNumber(input);
		System.out.println(  answer+ " ,it is an Increasing Number");

	}
	public static boolean checkNumber(int n)
	{
		boolean result = false;
		while(n>0)
		{
			int lastdigit= n%10;
			n=n/10;
			int nextlastdigit=n/10;
			if(nextlastdigit<=lastdigit)
			{
			  result = true;
			}
			else
			{
				result = false;
			}
		
		}
		return result;
	}

}