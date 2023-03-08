/**
 * 
 */
package tour;

/**
 * @author Administrator
 *
 */
public class City {
	String bud;
	@Override
	public String toString() {
		//return "City [bud=" + bud + ", proof=" + proof + ", name=" + name + ", email=" + email + ", loc=" + loc + "]";
		return "City [ proof=" + proof + ",  name=" + name + ", email=" + email + ", loc=" + loc + "]";
	}
	public String getBud() {
		return bud;
	}
	public void setBud(String bud) {
		this.bud = bud;
	}
	public String getProof() {
		return proof;
	}
	public void setProof(String proof) {
		this.proof = proof;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public City(String bud, String proof, String name, String email, String loc) {
		super();
		this.bud = bud;
		this.proof = proof;
		this.name = name;
		this.email = email;
		this.loc = loc;
	}
	String proof;
	String name;
String email;
String loc;


}
