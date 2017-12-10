
public class ContactInfo {
	int id;
	private String name;
	private String phone;
	private String email;
	
	public ContactInfo()
	{
		id = 0;
		name = null;
		phone = null;
		email = null;
	}
	
	public ContactInfo( int i, String nm, String ph, String em)
	{
		id = i;
		name = nm;
		phone = ph;
		email = em;
	}
	
	public int getid()
	{
		return id;
	}
	
	public String getname()
	{
		return name;
	}
	
	public String getphone()
	{
		return phone;
	}
	
	public String getemail()
	{
		return email;
	}
}
