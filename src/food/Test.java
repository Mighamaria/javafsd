create a curd application for messe food ,id,name,type of food and price and another list of meals
veg meals-80
fish curry meal-120
chappati+veg curry-40
chappati+chicken curry-120
veg.fried rice-60
chicken fried rice-150





package food;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import shop.Product;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("1.Create 2.Update 3.Retrieve 4.Delete");
//		int ch=sc.nextInt();
//	switch(ch)
		// TODO Auto-generated method stub
		System.out.println("enter uid");
		String uid=sc.nextLine();
		System.out.println("enter name");
		String name=sc.nextLine();

List<String> list1=Arrays.asList(uid,name);


List<Menu> list2= new ArrayList<Menu>();
list2.add(new Menu("Veg meals","80","2"+"\n"));
list2.add(new Menu("Fish curry meals","120","4" +"\n"));
list2.add(new Menu("Chappati wth veg curry","40","5"+"\n"));
list2.add(new Menu("Chappati wth chicken curry","120","6"+"\n"));
list2.add(new Menu("Veg fried rice","60","8"+"\n"));
list2.add(new Menu("chicken fried rice","150","9"+"\n"));
 System.out.print(list2);
 System.out.println("\n"+"Enter your choice");
String idfo=sc.nextLine();

List<String> choice= list2.stream().filter(val->val.getIdf().equals(idfo)).map(val->val.getIdf()).collect(Collectors.toList());
 System.out.println("Your choice is:"+ choice);

	}
}
