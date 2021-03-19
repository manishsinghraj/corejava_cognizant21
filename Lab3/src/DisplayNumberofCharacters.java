/**
 * Name: Manish Singh
 * Description: To find number of lines,words,characters in a given string.
 * Date:03/18/21
 */
import java.util.Scanner;

public class DisplayNumberofCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string :");
		String str=sc.nextLine();
			
		int lineLength=str.split("\\.").length;
		int wordLength=str.split(" ").length+lineLength-1;
		int characterCount=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)!=' '&& str.charAt(i)!='.')
				characterCount++;
		}
			System.out.println("Number of lines : "+lineLength);
			System.out.println("Number of words : "+wordLength);
			System.out.println("Number of charecters : "+characterCount);
		
	}

}