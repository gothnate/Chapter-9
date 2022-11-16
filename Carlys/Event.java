class Event
{
   public final static double HIGH_GUEST_PRICE = 35.00;
   public final static double LOW_GUEST_PRICE = 32.00;
   public final int LARGE_EVENT = 50;
   private String eventNumber;
   boolean isLarge = false;
   public int guests;
   public String contactPhoneNumber;
   public double pricePerGuest;
   public double priceForEvent;
   public int eventType;
   public static String EVENT_TYPE_NAMES[] = { "Wedding", "Baptism", "Birthday", "Corporate", "Other" };

   public Event()
   {
      this("A000", 0);
   }

   public void setContactPhoneNumber(String phoneNum) {
      contactPhoneNumber = phoneNum;
      String phoneFormat = "";
      for (int i = 0; i < phoneNum.length(); i++) {
         if (Character.isDigit(phoneNum.charAt(i))) {
            phoneFormat += phoneNum.charAt(i);
         }
      }
      if (phoneNum.length() < 10 || phoneNum.length() > 10) {
         contactPhoneNumber = "0000000000";
      } else {
         contactPhoneNumber = phoneFormat;
      }
   }

   public String getContactPhone() {
      String phone;
      phone = "(" + contactPhoneNumber.substring(0, 3) + ") " + contactPhoneNumber.substring(3, 6) + "-"
            + contactPhoneNumber.substring(6, 10);
      return phone;
   }

   public Event(String num, int guestAmount)
   {
      eventNumber = num;
      guests = guestAmount;
   }

   public void setEventNumber(String num)
   {
      eventNumber = num;
      if (((num.length() == 4) && ((Character.isAlphabetic(num.charAt(0))) && (Character.isDigit(num.charAt(1))) && (Character.isDigit(num.charAt(2))) && (Character.isDigit(num.charAt(3)))))) {
         eventNumber = num;
         eventNumber = Character.toUpperCase(num.charAt(0)) + num.substring(1);
      } else {
         eventNumber = "A000";
      }
   }

   public void setGuests(int guestAmount)
   {
      guests = guestAmount;
      if (isLargeEvent()) {
         pricePerGuest = LOW_GUEST_PRICE;
      } else {
         pricePerGuest = HIGH_GUEST_PRICE;
      }
      priceForEvent = guests * pricePerGuest;
   }

   public void setEventType(int eventTypeNum) {
      eventType = eventTypeNum;
      if (eventTypeNum < EVENT_TYPE_NAMES.length) {
         eventType = eventTypeNum;
      } else {
         eventType = EVENT_TYPE_NAMES.length;
      }
   }

   public String getEventName(int i) {
      return EVENT_TYPE_NAMES[i];
   }

   public String getEventNumber()
   {
      return eventNumber;
   }

   public int getNumberOfGuests()
   {
      return guests;
   }

   public double getPriceForEvent()
   {
      return priceForEvent;
   }

   public double getPricePerGuest()
   {
      return pricePerGuest;
   }

   public int getEventType() {
      return eventType;
   }

   public Boolean isLargeEvent() {
      if (guests >= LARGE_EVENT) {
          isLarge = true;
      } else {
      }
      return isLarge;
  }

   public int getGuests() {
      return guests;
   }
}