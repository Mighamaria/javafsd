package ustbatchnumber3.sonarqube;

public class Employee {
	
	 private  int empnumber;
	  private  int age;
	  private  int noofyears;
	  private  double salary;
	@Override
	public String toString() {
		return "Employee [empnumber=" + empnumber + ", age=" + age + ", nonofyears=" + noofyears + ", salary=" + salary
				+ "]";
	}
//	private  int nonofyears;
//	  private  float salary;
	public Employee(int empnumber, int age, int noofyears, double salary) {
		super();
		this.empnumber = empnumber;
		this.age = age;
		this.noofyears = noofyears;
		this.salary = salary;
	}
	
//	 Employee(int empnumber2, int age2, int noofyears2, float salary2) {
//		// TODO Auto-generated constructor stub
//	}public
	public int getEmpnumber() {
		return empnumber;
	}
	public void setEmpnumber(int empnumber) {
		this.empnumber = empnumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNoofyears() {
		return noofyears;
	}
	public void setNoofyears(int nonofyears) {
		this.noofyears = nonofyears;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double d) {
		this.salary = d;
	}
	
	}

