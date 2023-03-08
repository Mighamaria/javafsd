/**
 * 
 */
package target;

/**
 * @author Administrator
 *
 */
import java.util.*;
public class TargetPrgm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a;
		int count=0;
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();//Creating arraylist   
		for(int i=0;i<5;i++) {
			a=sc.nextInt();
		     list.add(a);
		}
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<5;j++) {
				if((list.get(i)+list.get(j)) ==25){
					count++;
					
				}
			}
		}
		if(count==1) {
			System.out.println("present");
					
			}
		else {
			System.out.println("not");
		}
		
		

	}
	

}
