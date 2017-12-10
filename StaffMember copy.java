/**
 * This program implements the StaffMemeber class
 * Extends Employee Class
 * @author Aanvi Guliani
 * @version 1.0
 */
public class StaffMember extends Employee
{
	private String JobTitle;
	
	//Constructor
	public StaffMember()
	{
		this.JobTitle = null;
	}
	
	//Constructor
	public StaffMember(String name,String addr,String email, String phone, Date bdt, Double sal,Date hdt, String jtitle)
	{
		super(name,addr,email,phone,bdt, sal, hdt);
		JobTitle = jtitle;
		
	}
	
	//Setter
	public void setJobTitle(String jtitle)
	{
		JobTitle = jtitle;
	}
	
	//Getter
	public String getJobTitle()
	{
		return JobTitle;
	}
	
	public String toString()
	{
		String className = this.getClass().getName();
		return className;
	}
}
