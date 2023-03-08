/**
 * 
 */
package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import collecations.Array;

/**
 * @author Administrator
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> p= new ArrayList<Product>();
		p.add(new Product(1,"iron box",7000));
		p.add(new Product(2,"Grinder",70000));
		p.add(new Product(3,"Microoven",75000));
	
		
//		p.add(p1);
//		p.add(p2);
//		p.add(p2);
		
		List<Integer> a= p.stream().filter(t->t.pdtPrice>10000).map(t->t.pdtPrice).collect(Collectors.toList());
		
		System.out.println(a);
	}

}
