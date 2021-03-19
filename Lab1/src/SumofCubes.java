/**
*Name: Manish Singh
*Description: Sum of cubes of digits given
*Date: 3/14/2021
**/
public class SumofCubes {

	public static int cubesum(int num) 
	{
		int sum=0,i;
		while(num>0)
		{
		i = num%10;
		sum = sum +(i*i*i);
		num = num/10;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int result = cubesum(1234);
		System.out.println(+result);
		
	}
	
	

}
