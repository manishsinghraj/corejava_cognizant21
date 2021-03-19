/**
 * Name:Manish Singh
 * Description:To get second smallest value in the array.
 * Date:03/17/21
 */
import java.util.Arrays;
import java.util.Scanner;

public class getSecondSmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr=new int[5];
		System.out.println("Enter the elements:");
		
		int i;
		for(i=0;i<5;i++){
			arr[i]=sc.nextInt();
		}
		
		Arrays.sort(arr);
		int result=getSecondSmallest(arr);
		System.out.println("Second Smallest Number is: "+result);

	}

	private static int getSecondSmallest(int[] arr) {
		
		int secondsmall = arr[1];
		return secondsmall;
	}

}