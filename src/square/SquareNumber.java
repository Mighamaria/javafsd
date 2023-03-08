/**
 * 
 */
package square;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
public class SquareNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> a= Arrays.asList(9,8,7,4);
		// square the number only
//		List<Integer> a1= a.stream().map(t->t*t).collect(Collectors.toList());
		
		// first find even numbers and then square that even numbers only
		List<Integer> a1= a.stream().filter(t->t%2==0).map(t->t*t).collect(Collectors.toList());
		
System.out.println(a);
		
		System.out.println(a1);
		}

}