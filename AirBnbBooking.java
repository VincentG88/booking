/* name:Vincent Goeijenbier
   student number:L00170175
   Creating a class for an AirBnB Booking*/
  
public class AirBnbBooking{

	private String bookingDate;
	private int numNights;
	private String address;
	private int numGuests;
	private double costPerNight;
	private String property;
	private String pets;
	private double totalBookingPrice;
    private double pricePerGuest;
	
	public AirBnbBooking()
    {
      bookingDate = "";
	  numNights = 0;
	  address = "";
	  numGuests = 0;
	  costPerNight = 0.0;
	  
	}
	
	public AirBnbBooking(String bookingDate, int numNights, String address, int numGuests, double costPerNight, String property, String pets) //second constructor
    {
    this.bookingDate = bookingDate;
	this.numNights = numNights;
	this.address = address;
	this.numGuests = numGuests;
	this.costPerNight = costPerNight;
	this.property = property;
	}
	   public String getBookingDate() {
      return bookingDate;
   }
   public void setBookingDate(String bookingDate) {
      this.bookingDate = bookingDate;
   }
   public int getNumNights() {
      return numNights;
   }
   public void setNumNights(int numNights) {
      this.numNights = numNights;
   }
   public String getAddress() {
      return address;
   }
   public void setAddress(String address) {
      this.address = address;
   }
   public int getNumGuests() {
      return numGuests;
   }
   public void setNumGuests(int numGuests) {
      this.numGuests = numGuests;
   }
   public double getCostPerNight() {
      return costPerNight;
   }
   public void setCostPerNight(double costPerNight) {
      this.costPerNight = costPerNight;
   }
   public void setPropertyType(String propertyType) {
      this.property = property;
   }
   public String isPets() {
      return pets;
   }
   public void setPets(String pets) {
      this.pets = pets;
   }
   public double totalBookingPrice()
   {
      return costPerNight * numGuests;   
   }
   public double pricePerGuest()
   {
      double pricePerGuest;
      pricePerGuest = totalBookingPrice / numGuests;  
      return pricePerGuest;
   }
	 @Override
   public String toString()
   {
      return "Booking date: "+bookingDate+
             " Number of nights: "+numNights+
             " Address: "+address+
             " Number of guests: "+numGuests+
             " Cost per night: "+costPerNight+
             " Property type: "+property+
             " Pets allowed: "+pets;
   }

}