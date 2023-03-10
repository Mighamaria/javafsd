/**
 * 
 */
package ustbatchnumber3.junit5testcases;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author Administrator
 *
 */
public class TestNumber {
	public void testeven() {
	int number=9;
	boolean result=isEven(number);
		assertTrue(result);
	}
	
@Test
		public void testodd() {
		int number=9;
		boolean result=isEven(number);
			assertFalse(result);
		}

	
	public boolean isEven(int number) {
		// TODO Auto-generated method stub
		return number%2==0;
	
	}

}
