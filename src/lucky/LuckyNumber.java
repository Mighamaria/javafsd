/**
 * 
 */
package lucky;

/**
 * @author Administrator
 *
 */
import java.util.*;
public class LuckyNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Number is:");
		int n= sc.nextInt();
		int count1 =0;
		int count2 =0;
		int count3 =0;
		
		while (n>0) {
			int num=n%10;
			if(num==3 ) {
				count1=1;
			}
			if(num==6 ) {
				count2=1;
			}
			if(num==9 ) {
				count3=1;
			}
			n=n/10;
		}


		if (count1==1 && count2==1 && count3==1 ) {
			System.out.println("yes");
		}
			else {
				System.out.println(" no ");
	
		
		
		}

	}

}
