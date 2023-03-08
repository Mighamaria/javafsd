/**
 * 
 */
package hotel;

/**
 * @author Administrator
 *
 */
public class HotelCustomer {
	String registerid;
	String name;
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	@Override
	public String toString() {
		return "HotelCustomer [registerid=" + registerid + ", name=" + name + ", phnum=" + phnum + ", emailid="
				+ emailid + ", location=" + location + "]";
	}
	public String getRegisterid() {
		return registerid;
	}
	public void setRegisterid(String registerid) {
		this.registerid = registerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhnum() {
		return phnum;
	}
	public void setPhnum(String phnum) {
		this.phnum = phnum;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	String phnum;
	String emailid;
	String location;
	public HotelCustomer(String registerid, String name, String phnum, String emailid, String location) {
		super();
		this.registerid = registerid;
		this.name = name;
		this.phnum = phnum;
		this.emailid = emailid;
		this.location = location;
	}

}
