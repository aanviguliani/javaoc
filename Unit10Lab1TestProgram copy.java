/**
 * This program tests the Inheritance
 * creates a Person, Student, Employee, Faculty, and Staff object,
 * and invokes their toString() methods
 * @author Aanvi Guliani
 * @version 1.0
 */
public class Unit10Lab1TestProgram 
{
	public static void main( String [] args )
	{
		//create person object
		Date birthdate1 = new Date(1,2,2000);
		
		Person person1 = new Person("Sam", "123 Main Street San Diego, CA 92037", "sam@gmail.com", "123-456-7890", birthdate1);
		
		String Class1name = person1.toString();
		
		System.out.println("Output of Person: ");
		System.out.println("Name : " + person1.getName());
		System.out.println("Class Name : " + Class1name);
		
		System.out.println();
		
		//create student object
		Date birthdate2 = new Date(2,2,2004);
		Student student1 = new Student("Sam Student", "123 Main Street San Diego, CA 92037", "sam@gmail.com", "123-456-7890", birthdate2,
				"Freshman");
		String Class2name = student1.toString();
		
		System.out.println("Output of Student: ");
		System.out.println("Name : " + student1.getName());
		System.out.println("Class Name : " + Class2name);
		System.out.println();
		
		//create employee object
		Date birthdate3 = new Date(2,2,2006);
		Date hiredate3 = new Date(2,2,2015);
		Employee emp1 = new Employee("Sam Employee", "123 Main Street San Diego, CA 92037", "sam@gmail.com", "123-456-7890", birthdate3,
				12345.12 , hiredate3 );
		String Class3name = emp1.toString();
		
		System.out.println("Output of Employee: ");
		System.out.println("Name : " + emp1.getName());
		System.out.println("Class Name : " + Class3name);
		System.out.println();
		
		//create faculty object
		Date birthdate4 = new Date(2,12,1996);
		Date hiredate4 = new Date(2,2,2016);
		Faculty faculty1 = new Faculty("Sam Faculty", "123 Main Street San Diego, CA 92037", "sam@gmail.com", "123-456-7890", birthdate4,
				  12345.12 , hiredate4, "10AM - 2PM", "professor");
		
		String Class4name = faculty1.toString();
		
		System.out.println("Output of Faculty: ");
		System.out.println("Name : " + faculty1.getName());
		System.out.println("Class Name : " + Class4name);
		System.out.println();
	
		//create Staff member object
		Date birthdate5 = new Date(7,12,1996);
		Date hiredate5 = new Date(2,2,2012);
		StaffMember staff1 = new StaffMember("Sam Staff", "123 Main Street San Diego, CA 92037", "sam@gmail.com", "123-456-7890",birthdate5,
				12345.12 ,hiredate5, "janitor");
		String Class5name = staff1.toString();
		
		System.out.println("Output of Staff Member: ");
		System.out.println("Name : " + staff1.getName());
		System.out.println("Class Name : " + Class5name);
		System.out.println();
	
	
	}
}
