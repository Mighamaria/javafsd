/**
 * 
 */
package program1;

import java.util.Scanner;

/**
 * @author Administrator
 *
 */
import java.util.*;
import java.lang.String;
public class PalindromeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		String num=sc.next();
		String rev="";
		int l= num.length();
		for(int i=l-1;i>=0;i--) {
		 rev=rev+ num.charAt(i);
			
		}
System.out.println(rev);

if(num.equals(rev)) {
	System.out.println("yes");
}
else {
	System.out.println("no");
}
	}

	

}
