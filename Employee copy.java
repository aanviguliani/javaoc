/**
 * This program implements the Employee class
 * Extends Person Class
 * @author Aanvi Guliani
 * @version 1.0
 */


public class Employee extends Person
{
	private Double Salary;
	private Date HireDate;
	
	//Constructor
	public Employee()
	{
		this.Salary = null;
		this.HireDate = null;
	}

	//Constructor
	public Employee(String name,String addr,String email,String phone, Date bdt, Double sal, Date hdt)
	{
		super(name,addr,email,phone,bdt);
		this.Salary = sal;
		this.HireDate = hdt;
	}
	
	//Setter
	public void setSalary(double sal)
	{
		Salary = sal;
	}
	
	//Getter
	public Double getSalary()
	{
		return Salary;
	}
	
	//Getter
	public Date getHireDate()
	{
		return HireDate;
	}
	
	public String toString()
	{
		String className = this.getClass().getName();
		return className;
	}

}

