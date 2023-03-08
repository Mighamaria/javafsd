/**
 * 
 */
package foodchoice;

/**
 * @author Administrator
 *
 */
public class Food {
	private String uid;
	private String name;
	@Override
	public String toString() {
		return "Food [uid=" + uid + ", name=" + name + "]";
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
	public Food(String uid, String name) {
		super();
		this.uid = uid;
		this.name = name;
	}

}
