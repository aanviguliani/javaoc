/**
 * This program implements the Student class
 * Extends Person Class
 * @author Aanvi Guliani
 * @version 1.0
 */
public class Student extends Person
{
	private String ClassStatus;
	
	//Constructor
	public Student()
	{
		this.ClassStatus = null;
	}

	//Constructor
	public Student(String name,String addr,String email,String phone, Date bdt, String cstatus )
	{
		super(name,addr,email,phone, bdt);
		ClassStatus = cstatus;
	}

	
	//Setter
	public void setClassStatus(String cstatus)
	{
		ClassStatus = cstatus;
	}
	
	//Getter
	public String getClassStatus()
	{
		return ClassStatus;
	}
	
	public String toString()
	{
		String className = this.getClass().getName();
		return className;
	}
}
