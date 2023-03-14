Write a java file program  to read elements from the file.

/**
 * 
 */
package fileprogram;

import java.io.FileInputStream;

/**
 * @author Administrator
 *
 */
public class FileWriteRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// TODO Auto-generated method stub
			FileInputStream fin= new FileInputStream("D:\\b.txt");
			int i=0;
			int count=0;
			while((i=fin.read())!= -1) {
				System.out.print((char)i);
				if((char)i== ' ')
					count++;
				
			}
	System.out.println(count);
	fin.close();
	System.out.println("Success");
		}
	catch(Exception e) {
		System.out.println(e);
	}


	}

}
