Write a java program to find the  common item in the array
/**
 * 
 */
package array;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Administrator
 *
 */
public class Common {
	public static void main(String args[]) {
		 HashSet<Integer> list1 = new HashSet<>();
		 HashSet<Integer> list2 = new HashSet<>();
		 Scanner sc=new Scanner(System.in);
		 int count=0;
		 int n=sc.nextInt();
		 
		 System.out.println("array1");
			for(int i=1;i<n;i++) {
					int b=sc.nextInt();
					list1.add(b);
			}
			System.out.println("array2");
			for(int j=1;j<n;j++) {
					int c=sc.nextInt();
					list2.add(c);
		   
		}
			/*for(int i=1;i<n;i++) {
				for( int j=i+1;j<n;j++) {
				if(list.get(i)==list.get(j)){
					count++;
				}
			}
			}
				if(count==1) {
					System.out.println("common value");
				}
				else {
					System.out.println("No common value");
				}*/
			if(list1.retainAll(list2)) {
				count++;
			}
			if(count==1) {
				System.out.println("present:"+list1);
			}
			else {
				System.out.println("not present");
			}
			}
	}


