/**
 * 
 */
package college;

import java.util.HashMap;

import java.util.Scanner;

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
		
		HashMap<Integer,Student> map =new HashMap<>();
		
		Student s1=new Student(345,"ram",19,"cse");
		Student s2=new Student(745,"raj",20,"ce");
		 Student s3= new Student(445,"ramu",18,"me");
		 
		map.put(1, s1);
		map.put(2, s2);
		map.put(3,s3);
		
//		map.put(2, new Student(445,"ramu",18,"me"));
//		map.put(3, new Student(745,"raj",20,"ce"));
//		Student age=map.get(1);
//		System.out.println("age"+age);
		//System.out.println(map.get(1));
		//map.get(1);
		int h=s2.hashCode();
		int h3=s1.hashCode();
		int h4=s3.hashCode();
		System.out.println(h+"  "+h3+" "+h4);

		
		}
	

}
