package ustbatchnumber3.testng;

/**
 * Hello world!
 *
 */
public class Employee
{
  private String name;
  private int age;
  private String department;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", department=" + department + "]";
}
public void setAge(int age) {
	this.age = age;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public Employee(String name, int age, String department) {
	super();
	this.name = name;
	this.age = age;
	this.department = department;
}
}
