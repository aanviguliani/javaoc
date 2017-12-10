
public class Name 
{
	private String fname;
	private String lname;
	
	public void setFirstName(String firstName)
	{
		fname = firstName;
	}

	public void setLastName(String lastName)
	{
		lname = lastName;
	}
	
	public String getFN()
	{
		return fname;
	}

	public String getLN()
	{
		return lname;
	}
	
	
	public String getFullName()
	{
		return fname + " " + lname;
	
	}

}

