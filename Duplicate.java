/**
 * 
 */
package ustbatchnumber3.junit5testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */

public class Duplicate {

	public static long countname(List<String> names, String targetname) {
		// TODO Auto-generated method stub
		return names.stream().filter(n->n.equalsIgnoreCase(targetname)).count();
	}

	/**
	 * @param args
	 * @return 
	 */
	


}
