/**
 * 
 */
package yzee;

/**
 * @author Administrator
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer   c=new Customer(2,"RAM","ram@gmail.com");
		SavingsAccount a= new SavingsAccount(1, c,25000,2000);
			System.out.println(a.withdraw(5000.0));
		

	}

}
