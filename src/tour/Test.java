/**
 * 
 */
package tour;

/**
 * @author Administrator
 *
 */
import java.util.*;
import java.util.stream.Collectors;

import tour.City;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the price for  hotel");
		//int h=sc.nextInt();
		
		
		//System.out.println("enter user choice:");
		System.out.println("Enter the price for  hotel");
		String a=sc.nextLine();
		System.out.println("excepted  price is "+ a);
		
		
		
//		if(a<=2000) {
			System.out.println("1500, ginger " );
//		}
//		else if(a> 2000 && a <=5000) {
			System.out.println("4500 for hyctt  ");
//		}
//		else {
			System.out.println("7800 for maritt");
//		}
		
		City hc1= new City("1500","567890432112","ram","ram@gamil.com","tvm");
		City hc2= new City("4500","678909675790","Ran","rani88@amil.com","ekm");
		City hc3= new City("7800","6789096752","Raju","raju67@gamil.com","kz");
		
		
		List<City> list=Arrays.asList(hc1,hc2,hc3);
//		City at = list.stream()
//		        .filter(findEmp -> a.equals(findEmp.getBud())).findAny().orElse(null);
	List<City> at=list.stream().filter(val->val.getBud().equals(a)).collect(Collectors.toList());
		if(at.isEmpty())
		System.out.println("Not found");
		else
		System.out.println(at);
		

	}

}
