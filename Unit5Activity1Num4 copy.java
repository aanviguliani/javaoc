import java.util.Random;

public class Unit5Activity1Num4 
{
	public static void main (String [] args)
	{
		System.out.println();
		int sixes = 0;
		int tens = 0;
		int fourteens = 0;
		int eighteens = 0;
		int twotwos = 0;
		
		for (int j = 1; j<= 20; j++)
		{
			Random rand = new Random();
			int n = rand.nextInt(5) + 1;
				switch(n)
				{
					case 1: sixes++;break;
					case 2: tens++; break;
					case 3: fourteens++; break;
					case 4: eighteens++; break;
					case 5: twotwos++; break;
				}
				
			
				if (n==1)
					{
						System.out.print("6 ");
					}
				else if (n==2)
					{
						System.out.print("10 ");
					}
				else if (n==3)
					{
						System.out.print("14 ");
					}
				else if (n==4)
					{
						System.out.print("18 ");
					}
				else if (n==5)
					{
						System.out.print("22 ");
					}
				
		}
		System.out.println();
		System.out.println("There are " + sixes + " 6's");
		System.out.println("There are " + tens + " 10's");
		System.out.println("There are " + fourteens + " 14's");
		System.out.println("There are " + eighteens + " 18's");
		System.out.println("There are " + twotwos + " 22's");
	}
}
