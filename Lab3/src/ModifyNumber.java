/**
*Name: Mnaish Singh
*Description: Create a method that accepts a number and modifies it such that the each of the digit in the
 				newly formed number is equal to the difference between two consecutive digits in the original number.
				The digit in the units place can be left as it is.
*Date:03/17/21
*/
import java.util.Scanner;
import java.lang.Math;
public class ModifyNumber{

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int number=sc.nextInt();
		System.out.println("the modified number is :"+modifyNumber(number));
	}
    private static int modifyNumber(int pNumber){ 	
    	String str=Integer.toString(pNumber);
    	int output=0;
    	for(int i=0; i<str.length()-1; i++){
    		int diff=str.charAt(i)-str.charAt(i+1);
    		output=output*10+Math.abs(diff);
    	}
    	output=output*10+(str.charAt(str.length()-1))-48;
    	return output;
    }
}