package ustbatchnumber3.junit5testcases;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
public class TestFrequency {
	@Test
	public void countfrequency() {
		List<String> names=Arrays.asList("apple","orange","apple","mango","grapes","guva");
		List<String> targetname=Arrays.asList("apple","orange","mango","grapes","guva");
		List<Integer>expected=Arrays.asList(2,1,1,1,1);
		long actual=Frequency.countoffreq(names,targetname);
		assertEquals(expected,actual);
	}
	

}
