package ustbatchnumber3.junit5testcases;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
		
	int count=0;
		//System.out.println("enter a string");
////		String s=sc.next();
		String s= "Migha";
		for(int i=0;i<s.length();i++) {
			char ch=Character.toLowerCase(s.charAt(i));
		if (ch=='a' || ch=='e' || ch=='i'|| ch== 'o'|| ch=='u')
		count++;
			
	}
	System.out.println(count);	
	}
}


//	}
	
	
	//functions using in main program
/*public static int vowelscount(String b)
		{
		int count =0;
		for(int i=0;i<b.length();i++)
		{
			char a = b.charAt(i);
			if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
			{
				count+=1;
			}
		}
		return count;

	}
		public static void main(String[] args) {
			System.out.println(vowelscount("Migha"));
		}
	}

 * 
 * 
 */

	


