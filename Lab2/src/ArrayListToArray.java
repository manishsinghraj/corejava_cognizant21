/**
 * Name:Manish Singh
 * Description:program to covert Arraylist to Array.
 * Date:03/17/21
 */
import java.util.ArrayList;
public class ArrayListToArray {
	
	  public static void main(String[] args) {
	    ArrayList<String> tech = new ArrayList<>();

	    tech.add("Java");
	    tech.add("Python");
	    tech.add("JavaScript");
	    System.out.println("ArrayList: " + tech);

	    String[] arr = new String[tech.size()];
	    
	    tech.toArray(arr);
	    System.out.print("Array: ");
	    for(String item:arr) {
	      System.out.print(item +", ");
	    }
	  }
}
