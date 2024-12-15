 import java.util.Scanner;

public class IT24104200Lab5Q3 {
		
		//Constants
		public static final double ROOM_CHARGE_PER_DAY = 48000.00;
		public static final double DISCOUNT_3_4_DAYS = 0.10;
		public static final double DISCOUNT_5_OR_MORE_DAYS = 0.20;

           public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Input start date and end date
		System.out.print("Enter Start Date (1-31) : ");
		int StartDate = input.nextInt();
		
		System.out.print("Enter End Date (1-31) : ");
		int EndDate = input.nextInt();
  
        
           //Validations 
     if (StartDate < 1 || StartDate > 31 || EndDate < 1 || EndDate > 31 ) 
   {
    System.out.println("Error : Dates must be between 1 and 31.");
   return;
   }
     if (StartDate >= EndDate )
  {
	  System.out.println("Error : Start date must be less than the end date.");
	  return;
  }	

    //Calculate the number of days reserved
         int daysReserved = EndDate - StartDate;
   
	//Determine discount rate based on number of days reserved
	double discountRate =0;
	if (daysReserved >=3 && daysReserved <= 4)
	{
		discountRate = DISCOUNT_3_4_DAYS;
	}else if (daysReserved>= 5)
	{
		discountRate = DISCOUNT_5_OR_MORE_DAYS;
	}else 
	{
		discountRate = 0;
	}

     //Calculations
    double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
    
    double discountAmount = totalAmount * discountRate;

    double AmountToPay = totalAmount - discountAmount;
  
     //Output results
     System.out.println("\nRoom Charge Per Day : " + ROOM_CHARGE_PER_DAY);
     System.out.println("Number of Days Reserved : " + daysReserved);
     System.out.println("Total Amount to be Paid : " + AmountToPay);

   input.close();
	}
}

  
	
		
		