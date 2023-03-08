/**
 * 
 */
package food;

/**
 * @author Administrator
 *
 */
public class MesseFood {

	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//	
//
//	}
private String uid;
private String name;
//private String Reqfood;
public MesseFood(String uid, String name) {
	super();
	this.uid = uid;
	this.name = name;
	//Reqfood = reqfood;
}
public String getUid() {
	return uid;
}
public void setUid(String uid) {
	this.uid = uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
//public String getReqfood() {
//	return Reqfood;
//}
//public void setReqfood(String reqfood) {
//	Reqfood = reqfood;
//}
@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}
}