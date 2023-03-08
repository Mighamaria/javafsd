/**
 * 
 */
package employee;

/**
 * @author Administrator
 *
 */
 public class Salary implements Comparable<Salary> {
	 public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public Salary(String empid, String empname, double sal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.sal = sal;
	}

	String empid;
	 String empname;
	 double sal;

	@Override
	public int compareTo(Salary o) {
		// TODO Auto-generated method stub
		
		return 0;
		
	}

	@Override
	public String toString() {
		return "Salary [empid=" + empid + ", empname=" + empname + ", sal=" + sal + "]";
	}

}
