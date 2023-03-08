/**
 * 
 */
package student;

/**
 * @author Administrator
 *
 */
import java.lang.String;

public class Rank {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		int sum=0;
		// TODO Auto-generated method stub
		String st[]= {"Alice","Bob","Charlie","David","Eva"};
		int[][] ma= {{80,75,90},{85,70,95}, {90,80,85},{75,85,90},{95,90,80}};
		int b[][]=new int[10][10];
		int s[][]= {{0},{0}};
		for(int i=0;i<5;i++) {
			for(int j=0;j<3;j++) {
				System.out.print( ma[i][j]+" ");
						}
			System.out.println( " ");
			
		}

					
		
	}

}
