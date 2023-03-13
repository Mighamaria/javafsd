package ustbatchnumber3.testng;


import org.testng.Assert;
import org.testng.annotations.Test;

import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class EmployeeforTest {
	@Test
	public void testforEmployees() {
		Employee e =new Employee("ram",34,"Cse");
		Assert.assertEquals(e.getName(),"ram");
	}
  
}
