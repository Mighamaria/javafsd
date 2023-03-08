/**

 * 
 */
package  kgfb;

/**
 * @author Administrator
 *
 */
import java.util.*;
public class Main {

	/**
	 * @param args 
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("1.Saving Account");
		System.out.println("2.Current Account");
		System.out.println("Enter your choice:");
		int ch=sc.nextInt();
		System.out.println("Enter the account number:");
		String  num=sc.next();
		System.out.println("Enter the customer name");
		String name=sc.next();
		System.out.println("Enter the balance:");
		double bal=sc.nextDouble();
		System.out.println("Enter the no of years:");
		int noYear=sc.nextInt();
		
    MaintenanceCharge a=new Saving(num,name, bal);
    
    MaintenanceCharge b=new Current(num,name, bal);
    if(ch==1) {
    System.out.println(a.calcaulateMaintenaceCharge(noYear));
    }
    else
    System.out.println(b.calcaulateMaintenaceCharge(noYear));
   
    
	}

}
