package ustbatchnumber3.junit5testcases;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	int num;
    	num=sc.nextInt();
    	if(num%2==0) {
    		System.out.println( "Even Number" );
    	}
    	else {
        System.out.println( "Odd Number" );
    	}
    }

	 
}
