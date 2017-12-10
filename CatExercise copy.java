
/**
 * This program overloads methods from the Cat class
 * @author Aanvi Guliani
 * @version 1.0
 */


public class CatExercise 
{
	public static void main(String [] args)
	{
		System.out.println();
		
		//create cat objects
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		
		//set breeds
		c1.setBreed("Siamese");
		c2.setBreed("Persian");
		
		//set age
		c1.setAge(3);
		c2.setAge(7);
		
		//set weight
		c1.setWeight(20.9);
		c2.setWeight(50.7);
		
		//set sex
		c1.setSex('m');
		c2.setSex('m');
		
		//set name
		c1.setName("Hunter");
		c2.setName("Barry");
		
		//overload strings
		String e = c1.eat("Munch, Munch, Munch");
		String m = c1.meow("Mewwwwooooow");
		
		//Display info about Cat One
		System.out.println(c1.getName() + " is Cat 1.");
		System.out.println(c1.getName() + " is a " + c1.getBreed() + " cat.");
		System.out.println(c1.getName() + " is " + c1.getAge() + " years old.");
		System.out.println(c1.getName() + " weighs " + c1.getWeight() + " pounds.");
		System.out.println("Sex of " + c1.getName() + " is: " + c1.getSex());
		System.out.println(c1.getName() + " says " + c1.eat(e));
		System.out.println(c1.getName() + " says " + c1.meow(m));
		
		System.out.println();
		
		//Display info about Cat Two
		System.out.println(c2.getName() + " is Cat 2.");
		System.out.println(c2.getName() + " is a " + c2.getBreed() + " cat.");
		System.out.println(c2.getName() + " is " + c2.getAge() + " years old.");
		System.out.println(c2.getName() + " weighs " + c2.getWeight() + " pounds.");				
		System.out.println("Sex of " + c2.getName() + " is: " + c2.getSex());
		System.out.println(c2.getName() + " says " + c2.eat(e));
		System.out.println(c2.getName() + " says " + c2.meow(m));
		
		
		
	}
}
