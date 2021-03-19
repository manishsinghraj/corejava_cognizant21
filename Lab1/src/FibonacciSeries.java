/**
*Name: Manish Singh
*Description: print fibonacci series upto nth term
*Date: 3/14/2021
**/
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int num1=0,num2=1,num3 = 0;
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int input=sc.nextInt();
	
		for(int i=2; i<input; ++i) {
			num3=num1+num2;
			System.out.println(" " +num3);
			num1=num2;
			num2=num3;
	}
}
}
