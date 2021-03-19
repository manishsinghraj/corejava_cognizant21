/**
*Name: Manish Singh
*Description: Find whether number is power of two or not
*Date: 3/14/2021
**/
import java.util.Scanner;
public class PowerofTwo {
	public static void main(String[] args)
	{

		System.out.println("Enter the Number");
		Scanner sc=new Scanner(System.in);
		int input =sc.nextInt();
		boolean result=checkNumber(input);
		if(result)
		{
			System.out.println(input+ " is a power of Two");
			
		}
		else
		{
		System.out.println( input+ " is not a power of Two");
		}
		
	}
	public static boolean checkNumber(int num)
	{
		return (num>0) && ((num & (num-1))==0);
	}

}