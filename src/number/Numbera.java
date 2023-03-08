/**
 * 
 */
package number;

/**
 * @author Administrator
 *
 */
public class Numbera {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
int a[]= {4,-4,6,8,-9,0,4,-7,56};
int flag1=0;
int flag2=0;
for(int i=0;i<a.length;i++) {
	if(a[i]>0) {
		flag1++;
	}

else if(a[i]<0) {

	flag2++;
}
else {
	System.out.println("0 is neutral");
}

}
System.out.println("+ve:"+ flag1);
System.out.println("-ve:"+ flag2);
	}
	

}