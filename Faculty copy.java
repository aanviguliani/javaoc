/**
 * This program implements the Faculty class
 * Extends Employee Class
 * @author Aanvi Guliani
 * @version 1.0
 */
public class Faculty extends Employee
{
	private String OfficeHours;
	private String Rank;
	
	//Constructor
	public Faculty()
	{
		this.OfficeHours = null;
		this.Rank = null;
	}

	//Constructor
	public Faculty(String name,String addr,String email,String phone, Date bdt, Double sal,Date hdt, String offhrs, String rank)
	{
		super(name,addr,email,phone, bdt, sal, hdt);
		OfficeHours = offhrs;
		Rank = rank;
	}
	
	//Setter
	public void setOfficeHours(String offhrs)
	{
		OfficeHours = offhrs;
	}
	
	//Getter
	public String getOfficeHours()
	{
		return OfficeHours;
	}
	
	public String toString()
	{
		String className = this.getClass().getName();
		return className;
	}
}
