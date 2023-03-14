Write a java program to find the frequency of each word in the array.
/**

 * 
 */
package count;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */

public class Countfrequency {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> a= Arrays.asList("banglore","hydernad","mumbai", "mumbai","Thrissur");
		
//		List<String> a1= a.stream().filter(i->Collections.frequency(a,i)>1).collect(Collectors.toList()));
		long total=a.stream().count();
		
			//	System.out.println(a1);
	}

}
