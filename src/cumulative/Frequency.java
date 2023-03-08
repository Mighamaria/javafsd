/**
 * 
 */
package cumulative;

/**
 * @author Administrator
 *
 */
import java.util.*;
public class Frequency{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum=0;
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of elements");
		int length=sc.nextInt();
		int arr[] = new int[length];
		int res[]= new int[length];
	if (length>0) {
		System.out.println("Enter the elements");
		for(int i= 0;i< length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Output is:");
for(int i=0;i<length;i++) {
	 sum= sum+arr[i];
	 res[i]=sum;
	
}
for(int i=0;i<length;i++) {
	System.out.print (res[i] + " ");
	}
	}
else {
		System.out.println("Invalid ranges");
	}
	}


}