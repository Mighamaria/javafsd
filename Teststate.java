package ustbatchnumber3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class Teststate{

	@Test
 public void test() {
		List expected=Arrays.asList("Tamilnadu","KALLAR");
		String no="TN05BM6767";
		List actual1=State.sdataset(no);
		System.out.println(actual1);
		 assertEquals(expected,actual1);
		
	}
	 
	

}
