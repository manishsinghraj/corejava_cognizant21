import java.util.Scanner;

/**
 * Description : Display prime numbers upto nth term
 * Name: Manish Singh
 * Date:3/14/2021
 */
public class PrimeNumbers {

	public static void main(String[] args) {
		String primeNumber=" ";
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number : ");
		int number=sc.nextInt();
		int i=0, num=0;
		for(i=1; i<=number ;i++) {
			int count=0;
			for(num=i; num>=1; num--) {
				if(i%num==0) {
					count=count+1;
				}
			}
		    if(count==2) {
			    primeNumber = primeNumber +i +" ";
		    }
		}
		System.out.println("Prime numbers are :");
		System.out.println(primeNumber);
     }
}