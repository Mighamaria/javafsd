package ustbatchnumber3.sonarqube;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import ustbatchno3.sonarcube.Sample;


/**
 * @author Administrator
 *
 */
public class Testsample {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			List<Sample> employees = new ArrayList<>();
			employees.add(new Sample(25,"Sanju",2,30000));
			employees.add(new Sample(48,"raju",8,80000));
			employees.add(new Sample(39,"zahr",12,100000));
			employees.add(new Sample(54,"luhu",4,50000));
			
			List<Sample> lis = employees.stream()
					.peek(t->{
					if(t.getExp() >=1 && t.getExp()<=2)
						t.setSalary(t.getSalary()+0.25*t.getSalary());
					else if(t.getExp() >=3 && t.getExp()<=6)
						t.setSalary(t.getSalary()+0.05*t.getSalary());
					else if(t.getExp() >=6 && t.getExp()<=10)
						t.setSalary(t.getSalary()+0.1*t.getSalary());
					else
						t.setSalary(t.getSalary()+0.12*t.getSalary());
						}
				      ).toList();      
			
//			System.out.println(lis);
			
			employees.forEach(t->System.out.println("Incremented Salary is   : "+t.getSalary()));	

//			employees.forEach(e -> System.out.println("Incremented Salary is     " +e.getSalary()));
	    	
		
	}
	

}
