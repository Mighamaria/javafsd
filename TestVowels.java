package ustbatchnumber3.junit5testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestVowels {
	@Test
	public void vowelstest() {
		String s="Migha";
		int excepted=2;
		int actual=TestVowels.CountVowels(s);
		//int actual=Vowels.vowelscount(s);
		assertEquals(excepted,actual);
	}

	private static int CountVowels(String s) {
		int count=0;
		// TODO Auto-generated method stub
		for(int i=0;i<s.length();i++) {
			char ch=Character.toLowerCase(s.charAt(i));
			if (ch=='a' || ch=='e' || ch=='i'|| ch== 'o'|| ch=='u')
			count++;
			
		}
		return count;
	}
	
	
	
}


