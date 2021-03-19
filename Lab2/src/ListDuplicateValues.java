/**
 * Name:Manish Singh
 * Description:Listing out duplicate values in an array.
 * Date:03/17/21
 */
public class ListDuplicateValues {
	public static void main(String[] args) {      
           
        int [] arr = {2, 3, 45, 88, 88, 99, 99, 45, 6, 2};   
        System.out.println("Duplicate elements in given array: ");   
        
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  