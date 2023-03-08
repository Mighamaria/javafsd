/**
 * 
 */
package words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import collecations.Array;


/**
 * @author Administrator
 *
 */
import java.util.*;
public class WordProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
     System.out.println("Enter String:");
   	Scanner sc=new Scanner(System.in);
   	String r=sc.nextLine();
   	sc.nextLine();
   	
   	String v=r.replaceAll("[',!*@;']"," ");
   	String [] q=v.split(" ");
   	
   	List<String>a=Arrays.asList(q);
   	
   	List<String>w=a.stream().map(t->t.toLowerCase()).distinct().sorted().toList();
   	
   	System.out.println(w.size());//number of  unique words
   	System.out.println(a.size()); // number of words
   	w.forEach(System.out::println);
       
       
//       String[]words = str.split("[,:;?! ]");
//List<String> thewords=Arrays.stream(words)
//				.collect(Collectors.toList());
//List<String> theuniquewords= thewords.stream()
//				.map(val->val.toLowerCase())
//				.distinct()
//				.sorted()
//				.collect(Collectors.toList());		       
//   
//        System.out.println("Number of words:"+ thewords.size());
//        System.out.println("Number of unique words:"+ theuniquewords.size());
//        System.out.println(theuniquewords);
        }
       
}
