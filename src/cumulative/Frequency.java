Cumulative sum in an array

Sharath Kumar wants to write Java program to find the cumulative sum of the array with a given set of values.Input consist of integers .If the size of an array is zero or lesser then display the message as "Invalid Range". Print the output in the format which is provided in sample output .
Assume maximum size of array is 20,

Sample Input 1:

Enter number of elements

5
Enter the elements

2

3

-5

7

1

Sample Output 2:

2 5 0 7 8

 

Sample Input 3:

Enter number of elements

0

Sample Output 3:

Invalid Range


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
