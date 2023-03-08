/**
 * 
 */
package collecations;



/**
 * @author Administrator
 *
 */
import java.util.*;
public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist    
	      list.add("Mango");//Adding object in arraylist    
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");    
	      //Printing the arraylist object   
	      list.add("Guvava");
	     // System.out.println(list);
	     // System.out.println("Returning element: "+list.get(1));//it will return the 2nd element, because index starts from 0  
	      //changing the element  
	      //list.set(1,"Dates");  
	      Collections.sort(list);  
	      //Traversing list  
	      for(String fruit:list)    
	        System.out.println(fruit);

	}

}
