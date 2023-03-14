Write a  java program  to find whether particular  word present  in it or not.
/**
 * 
 */
package hashmap;

import java.util.HashMap;

/**
 * @author Administrator
 *
 */
public class HashmapProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creation of hashmap
		HashMap<String,Integer> map=new HashMap<>();
		map.put("Ram", 67);
	map.put("raju",89);
			map.put("remiya", 30);
			
			// dispalying hashmap
			System.out.println(map);
			
			// retriving elements in hashmap
			int age1=map.get("remiya");
			System.out.println("age of remiya"+age1);
			
			// check if key present or not
			boolean containram=map.containsKey("Ram");
			System.out.println("ram contains "+containram);
			
			//remove a key vale pair
			map.remove("raju");
			
			//iteration 
			for(String name:map.keySet()) {
				int val=map.get(name);
				System.out.println("name:"+name);
			}
			
	}

}
