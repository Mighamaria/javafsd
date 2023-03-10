package ustbatchnumber3.junit5testcases;

import java.util.Collections;
import java.util.List;

public class Frequency {

	public static long countoffreq(List<String> names, List<String> targetname) {
		// TODO Auto-generated method stub
//		return names.stream().count();
		int occurrences = Collections.frequency(names , targetname);
		return occurrences;
		
	}

}
