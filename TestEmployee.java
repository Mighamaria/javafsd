package ustbatchnumber3.sonarqube;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestEmployee {  
    public static void main(String[] args) {  
        List<Employee> eList = new ArrayList<Employee>();  
        //Adding Products  
        eList.add(new Employee(1,24,2, 25000f));  
        eList.add(new Employee(2,29,5,30000f));  
        eList.add(new Employee(3,35,6,28000f));  
        eList.add(new Employee(4,39,9,28000f));  
        eList.add(new Employee(5,45,14,90000f));  
        List<Employee> lis = eList.stream().peek
        		(k->{
        			if((k.getNoofyears()>=1)&&(k.getNoofyears()<=2))
					k.setSalary(k.getSalary()+(0.25)*k.getSalary());
				if((k.getNoofyears()>=3)&&(k.getNoofyears()<=6))
					k.setSalary(k.getSalary()+(0.05)*k.getSalary());
			if((k.getNoofyears()>=6)&&(k.getNoofyears()<=10))
					k.setSalary(k.getSalary()+(0.10)*k.getSalary());
			if((k.getNoofyears()>=12))
					k.setSalary(k.getSalary()+(0.12)*k.getSalary());
				}
  
			      ).toList();

                   // all elements printed
          System.out.println(eList);
          
                    //.forEach(System.out::println);  // iterating price  
          // elememts with increment salary only
   eList.forEach(t->System.out.println("Incremented Salary is   : "+t.getSalary() ));	
}

}
