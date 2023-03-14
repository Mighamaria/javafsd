Write a java program to read the elements from it.
/**
 * 
 */
package fileread;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Administrator
 *
 */
public class FileReadProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// TODO Auto-generated method stub
			FileInputStream fin= new FileInputStream("D:\\b.txt");
			int i=0;
			while((i=fin.read())!= -1) {
				System.out.print((char)i);
				
			}
	
	fin.close();
	System.out.println("Success");
		}
	catch(Exception e) {
		System.out.println(e);
	}

	}
}
