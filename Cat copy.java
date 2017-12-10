/**
 * This program modifies the cat class and
 * creates a variety of methods about cat attributes
 * @author Aanvi Guliani
 * @version 1.0
 */

public class Cat 
{
	
	
	private String breed;
	private int age;
	private double weight;
	private char sex;
	private String name;
	
	public String eat(String e)
	{
		e = "Munch,Munch,Munch";
		return e;
	}
	
	public String meow(String m)
	{
		m = "Meeeeeeeoww";
		return m;
	}
	
	public String getBreed()
	{
		return breed;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public char getSex()
	{
		return sex;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setBreed(String b)
	{
		breed = b;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public void setWeight(double w)
	{
		weight = w;
	}

	public void setSex(char s)
	{
		 sex = s;
		
	}
	
	public void setName(String n)
	{
		name = n;
	}

}

