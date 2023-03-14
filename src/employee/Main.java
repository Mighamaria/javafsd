Employee table has 3 parameters: string empid,string empname,double salary.sort the employee based on salaries.If the condition is above 50000,10% increment of previous salary,if salary moves above 100000 increment by 5%.Find the employee name and
current salary.
/**
 * 
 */
package employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Administrator
 *
 */
//public class Main {

	/**
	 * @param args
	 */
	//public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Salary num=new Salary("3","raju",800000);
//		List<Salary> a= Arrays.asList(num);
//		List<Integer> l1=a.stream().filter((t->t>50000) ?((10*50000)/100)+50000:50000).peek().sort().reserve().collect(Collectors.toList());
//		List<Integer> l2=a.stream().filter((t->t>100000) ?((5*100000)/100)+100000:100000).peek().sort().reserve().collect(Collectors.toList());
//	
//
//	//System.out.println(l1);
//	}
//	
//
//}
		
		//package salary;

		import java.util.Arrays;
		import java.util.Comparator;
		import java.util.List;


		public class Main {

			public static void main(String[] args) {
				Salary m1=new Salary("1203", "Ram", 280000);
				Salary m2=new Salary("7139", "Rani", 5000);
				Salary m3=new Salary("3103", "Kajal", 68000);
				List<Salary> list=Arrays.asList(m1,m2,m3);
				List<Salary> lis = list.stream().sorted(Comparator.comparing(Salary::getSal).reversed())
						.peek(k->{
						if((k.getSal()>=50000)&&(k.getSal()<100000))
							k.setSal(k.getSal()+(0.1)*k.getSal());
						else if(k.getSal()>=100000)
							k.setSal(k.getSal()+(0.05)*k.getSal());}
					      ).toList();
	
				System.out.println(lis);
				
			}

		}
