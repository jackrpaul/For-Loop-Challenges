import java.util.Scanner;
public class ForLoopChallenges
	{
		static int lowbound, highbound;
		public static void main(String[] args)
			{
				challenge1();
				challenge2();
				challenge3();
				challenge4();
				challenge5();
				challenge6();
				extraCredit();
			}

		public static void challenge1()
			{
			for(int i = 0; i < 5; i++)
				{
				System.out.println("I love donuts!");
				}
			}
		public static void challenge2()
			{
			int j = 0;
			for (int i = 0; i < 5; i++)
				{
				j++;
				System.out.println(j);
				}
			for (int i = 5; i > 0; i--)
				{
				System.out.println(j);
				j--;
				}
			}
		public static void challenge3()
			{
			int multiples = 0;
			for (int i = 0; i < 100; i = i + 5)
				{
				multiples = multiples + 5;
				System.out.println(multiples);
				}
			}
		public static void challenge4()
			{
				int multiples = 0;
				int multiplecounter = 0;
				for (int i = 0; i < 100; i = i + 5)
					{
					multiples = multiples + 5;
					multiplecounter = multiplecounter + multiples;
					}
				System.out.println("The sum of these numbers is " + multiplecounter);
			}
		public static void challenge5()
			{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Give me a low number.");
			lowbound = userInput.nextInt();
			System.out.println("Give me a high number.");
			highbound = userInput.nextInt();
			int sum = 0;
			for (int i = lowbound + 1; i < highbound; i++)
				{
				sum = sum + i;
				}
			System.out.println("The sum of the numbers in between your low and high numbers is " + sum + ".");
			}
		public static void challenge6()
			{
			System.out.println("*********");
			for (int i = 0; i < 9; i++)
				{
				System.out.println("*            *");
				}
			System.out.println("*********");
			}
		public static void extraCredit()
			{
			int tens = 1 + 9;
			for (int i = 1-1; i < 5; i++)
				{
				System.out.println(tens);
				tens = tens + 11;
				tens--;
				}
			}
	}
