Write a  java program to print the city  name  starting with  "t".
/**
 * 
 */
package city;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class CityNames {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print the cities names starting with t
		List<String> a= Arrays.asList("banglore","hydernad","mumbai", "tamilnadu","Thrissur");
		
		List<String> a1= a.stream().filter(t->t.startsWith("t")).collect(Collectors.toList());
		System.out.println(a1);
	}

}
