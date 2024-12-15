import java.util.Scanner;

public class IT24104200Lab5Q1
{

    public static void main(String[] args)
	{
	Scanner input = new Scanner (System.in);

        int smallest_num , largest_num;

      
	  System.out.print("Enter the first integer :");
        int num1 = input.nextInt();
		
		System.out.print("Enter the second integer :");
        int num2 = input.nextInt();
		
		System.out.print("Enter the third integer :");
        int num3 = input.nextInt();
		
		//Find the smallest  number
		if (num1 < num2 && num1 < num3 ) 
		{
			smallest_num = num1;
		} 
                else if ( num2 < num1 && num2 < num3 )
		{
			smallest_num = num2;
		}
                else
		{
			smallest_num = num3;
		}
		
		//Find the largest number 
		if ( num1 > num2 && num1 > num3)
		{
			largest_num = num1;
		}
		else if ( num2 > num1 && num2 > num3 )
		{
			largest_num = num2;
		}
		else
		{
			largest_num = num3;
		}
		
		//Print the result
		System.out.println ("User entered number are : " +num1 +" " +num2 +" " + num3);
		
		System.out.println ("The Smallest number is : " + smallest_num );
		System.out.println ("The Largest number is : " + largest_num );
		
	}
}
		
		
		
		
		
		
        
		
		