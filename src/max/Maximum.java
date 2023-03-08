/**
 * 
 */
package max;

/**
 * @author Administrator
 *
 */
public class Maximum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,8,1,7,2};
		int l=a.length;
		int temp = a[0];
	
		for(int i=0;i<l;i++) {
			
			if (a[i] > temp) {
				temp=a[i];
			}
			
		}
			System.out.println(temp);
			
			
		}
	}


