import java.util.Scanner;

public class IT24104200Lab5Q2 {
	
	public static void main(String[] args)
	{
		//Create an object called input to Scanner class
		Scanner input = new Scanner(System.in);
		
		//Take user input 
		System.out.print ("Enter the number of new members introduced : ");
		int newMembers =input.nextInt();
               System.out.println(" ");
		
		
		String prize;
		 if (newMembers < 0 )
		 {
			 System.out.println("Input must be a number 0 or greater ");
		 }
		 else 
		
		switch (newMembers)
		{
			case 0:
			 System.out.println("Prize is a : No Prize");
			break;
			case 1:
			System.out.println( "Prize is a : Pen");
			break;
			case 2:
			System.out.println( "Prize is a : Umbrella");
			break;
			case 3:
			 System.out.println("Prize is a : Bag");
			break;
			case 4:
			 System.out.println("Prize is a : Travelling Chair");
			break;
			default:
			 System.out.println("Prize is a : Headphone");
		}
	}
}
			
		
		