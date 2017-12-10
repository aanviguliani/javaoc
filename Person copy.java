/**
 * This program implements the Person class
 * @author Aanvi Guliani
 * @version 1.0
 */
public class Person 
{
	private String Name;
	private String Address;
	private String Email;
	private String Phone;
	private Date Birthdate;
	
	//Constructor
	public Person()
	{
		this.Name = null;
		this.Address = null;
		this.Email = null;
		this.Phone = null;
		this.Birthdate = null;
	}
	
	//Constructor
	public Person(String name, String addr, String email, String phone, Date bdate)
	{
		this.Name = name;
		this.Address = addr;
		this.Email = email;
		this.Phone = phone;
		this.Birthdate = bdate;
	}
	
	//Setter
	public void setName(String name)
	{
		Name = name;
	}
	
	//Getter
	public String getName()
	{
		return Name;
	}
	
	//Setter
	public void setAddress(String addr)
	{
		Address = addr;
	}
	
	//Getter
	public String getAddress()
	{
		return Address;
	}
	
	//Setter
	public void setPhone(String phone)
	{
		Phone = phone;
	}
	
	//Getter
	public String getPhone()
	{
		return Phone;
	}

	//Getter
	public Date getBirthdate()
	{
		
		return Birthdate;
	}
	
	
	
	public String toString()
	{
		String className = this.getClass().getName();
		return className;
	}

}

