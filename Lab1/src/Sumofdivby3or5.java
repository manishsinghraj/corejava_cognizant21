/**
*Name: Manish Singh
*Description: Sum of numbers which is divisible by 3 or 5
*Date: 3/14/2021
**/
public class Sumofdivby3or5 {
	
	public static int sumofdiv(int num) {
		int sum = 0,i;
		for(i=0; i<=num; i++)
		{
			if(i%3==0 || i%5==0) 
			{
				sum = sum+i;
			}
		}
		return sum;
 }

	public static void main(String[] args)
	{
		int result = sumofdiv(5);
		System.out.println(+result);
		
	}
	
}
