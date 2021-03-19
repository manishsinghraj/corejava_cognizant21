/**
 * Name:Manish Singh
 * Description:To find a specific value in a string given.
 * Date:03/17/21
 */
public class SpecificValue {
	public static void main(String args[]){
	      String[] arr = {"Java", "Sql", "Python", 	"C/C++"};
	      String Find = "Python";

	      for(int i = 0; i<arr.length; i++){
	         if(Find == arr[i]){
	            System.out.println("Array contains the given element");
	         }
	      }
	   }

}
