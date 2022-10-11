/* name:Vincent Goeijenbier
   student number:L00170175
   Creating a tester for an AirBnB Booking*/
import java.util.*;
public class AirBnbBookingTester{
   public static void main(String[] args){
   //Create scanner class for user input
   Scanner keyboardIn = new Scanner(System.in);
   
   int option;   	
   
	System.out.println("Please enter the date of your booking: ");
   	String bookingDate = keyboardIn.nextLine();
   	System.out.println("Please enter the number of nights: ");
  	int numNights = keyboardIn.nextInt();
	while(numNights < 0){
      	System.out.println("Invalid number. Please enter the number of nights: ");
      	numNights = keyboardIn.nextInt();  
      }
	System.out.println("Please enter the address: ");
   	String address = keyboardIn.next();
	System.out.println("Please enter the number of guests: ");	
	int numGuests = keyboardIn.nextInt();
	while(numGuests > 20 || numGuests < 0){
		System.out.println("Sorry. Minumum 1 guests and maximum 20");
       	System.out.println("Please enter the number of guests: ");
       	numGuests = keyboardIn.nextInt();
	  }
	System.out.println("Please enter the cost per night: ");
    double costPerNight = keyboardIn.nextDouble();
	while(costPerNight < 0.0){
        System.out.println("Please enter the cost per night: "); 
        costPerNight = keyboardIn.nextDouble();
      }
	System.out.println("Property type. apartment or house");
    String property = keyboardIn.next();
	System.out.println("Pets? Please enter Yes or No");
    String pets = keyboardIn.next();
   
   	AirBnbBooking air = new AirBnbBooking(bookingDate, numNights, address, numGuests, costPerNight, property, pets);
   
   	do{
  	 System.out.println("1. View Booking Details");
   	System.out.println("2. Change Number of Nights");
   	System.out.println("3. View Price Per Guest");
   	System.out.println("4. View Total Price");
   	System.out.println("5. Check if Pets are Allowed");  
   	System.out.println("0. Exit");
   	option = keyboardIn.nextInt();
  
   switch(option)
   {
      case 1:
      System.out.println("Your booking details are: "+air);
      break;
     
      case 2:
      //asking user to enter the number of nights
      System.out.println("Enter the number of nights: ");
      numNights = keyboardIn.nextInt();
      //adding in a check to see if user entered a negative value
      if(numNights < 0){
         System.out.println("You can't add in a negative number");       
         while(numNights < 0){
            System.out.println("Enter the number of nights: ");
            numNights = keyboardIn.nextInt();
            air.setNumNights(numNights);
         }
      }     
      else{
      air.setNumNights(numNights);
      }     
      break;   
      case 3:
      System.out.println("The price per guest is: "+air.pricePerGuest());
      break;     
      case 4:
      System.out.println("The total price is: "+air.totalBookingPrice());
      break;     
      case 5:
      System.out.println("Pets allowed: ");
      break;    
   }
   }while(option != 0);
   }
}

   

