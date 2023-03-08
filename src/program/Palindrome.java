/**
 * 
 */
package program;

/**
 * @author Administrator
 *
 */
import java.util.*;
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int s=0;
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int temp=num;
		while(num>0) {
			int rem=num%10;
			s=(s*10)+rem;
			num=num/10;
		}
		System.out.println(s);
		if(s==temp) {
			System.out.println("yes");
		}
		else {
			System.out.println("NO");
		}
	}

}
