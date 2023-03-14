Write a java file  program to write into the file. 
/**
 * 
 */
package file;

import java.io.FileOutputStream;

/**
 * @author Administrator
 *
 */

public class FileProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
		// TODO Auto-generated method stub
		FileOutputStream fout= new FileOutputStream("D:\\a.txt");
String b="Wecome to java full stack";
byte [] dataByte = b.getBytes();
fout.write(dataByte);
fout.close();
System.out.println("Success");
	}
catch(Exception e) {
	System.out.println(e);
}
	}
	
}
