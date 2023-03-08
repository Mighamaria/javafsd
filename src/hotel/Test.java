/**
 * 
 */
package hotel;

import java.util.Arrays;
import java.util.List;

/**
 * @author Administrator
 *
 */
import java.util.*;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		HotelCustomer hc1= new HotelCustomer("123","Ram","6789096755","ram@gamil.com","tvm");
		HotelCustomer hc2= new HotelCustomer("456","Ran","6789096757","rani88@amil.com","ekm");
		HotelCustomer hc3= new HotelCustomer("789","Raju","6789096752","raju67@gamil.com","kz");
		String a=sc.nextLine();
		List<HotelCustomer> list=Arrays.asList(hc1,hc2,hc3);
		
		HotelCustomer at = list.stream()
		        .filter(findEmp -> a.equals(findEmp.getRegisterid())).findAny().orElse(null);
		System.out.println(at);
		

	}

}