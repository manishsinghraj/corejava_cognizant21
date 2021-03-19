/**
*Name: Manish Singh
*Description: creating mirror image of string and to return 2 strings seperated by pipe(|) symbol.
*Date:03/17/21
*/

import java.util.Scanner;

public class MirrorImage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String: ");
		String str=sc.next();
		System.out.println("The Mirror image seperated by symbol(|) is: ");
		System.out.println(getImage(str));
		
	}
	
    private static String getImage(String pStr)
    {
    	StringBuffer reverseStr = new  StringBuffer(pStr);
    	reverseStr.reverse();
    	return pStr+"|"+reverseStr;
    
    }
}