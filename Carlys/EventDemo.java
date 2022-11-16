import java.util.Scanner;
public class EventDemo
{
   public static void main(String[] args) {
      displayMotto();
      eventTypeMenu();
      int option;
      Event eventArray[] = new Event[8];
      for (int i = 0; i < eventArray.length; i++) {
         Event eventOne = new Event();
         eventOne.setEventNumber(getEventNumber());
         eventOne.setGuests(getGuests());
         eventOne.setContactPhoneNumber(getContactPhone());
         eventOne.setEventType(getEventType());
         eventArray[i] = eventOne;
      }

      do {
         System.out.println("Display Events:");
         option = getOption();
         if (option == 1) {
            sortByEventNumber(eventArray);
         }
         if (option == 2) {
            sortByGuests(eventArray);
         }
         if (option == 3) {
            sortByType(eventArray);
         }
      } while (option != 4);
   }

   private static void sortByType(Event[] events) {
      int a;
      int b;
      Event temp;
      int lena = events.length;
      int lenb = events.length - 1;

      for (a = 0; a < lenb; a++) {
         for (b = 0; b < lenb; b++) {
            if (events[b].getEventType() > events[b + 1].getEventType()) {
               temp = events[b];
               events[b] = events[b + 1];
               events[b + 1] = temp;
            }
         }
         for (a = 0; a < lena; a++) {
            displayDetails(events[a]);
         }
      }
   }

   private static void sortByEventNumber(Event[] events) {
      int a;
      int b;
      Event temp;
      String stringb;
      String stringbPlus;
      int len = events.length - 1;

      for (a = 0; a < len; a++) {
         for (b = 0; b < len; b++) {
            stringb = events[b].getEventNumber();
            stringbPlus = events[b + 1].getEventNumber();
            if (stringb.compareTo(stringbPlus) > 0) {
               temp = events[b];
               events[b] = events[b + 1];
               events[b + 1] = temp;
            }
         }
         for (a = 0; a < events.length; a++) {
            displayDetails(events[a]);
         }
      }
   }

   private static int getOption() {
      Scanner input = new Scanner(System.in);
      int option;
      System.out.println("---------------------------Sort by-----------------------------");
      System.out.println("1: Event Number | 2: Number of Guests | 3: Event Type | 4: Quit");
      option = input.nextInt();
      return option;
   }

   private static void sortByGuests(Event[] events) {
      int a;
      int b;
      Event temp;
      int lena = events.length;
      int lenb = events.length - 1;

      for (a = 0; a < lenb; a++) {
         for (b = 0; b < lenb; b++) {
            if (events[b].getGuests() > events[b + 1].getGuests()) {
               temp = events[b];
               events[b] = events[b + 1];
               events[b + 1] = temp;
            }
         }
         for (a = 0; a < lena; a++) {
            displayDetails(events[a]);
         }
      }
   }

   public static String getEventNumber() {
      String num;
      Scanner input = new Scanner(System.in);
      System.out.print("\nEnter event number >> ");
      num = input.nextLine();
      return num;
   }

   public static int getGuests() {
      int guests;
      Scanner input = new Scanner(System.in);
      do {
         System.out.print("Enter number of guests >> ");
         guests = input.nextInt();
         input.nextLine();
      } while (guests < 5 || guests > 100);
      return guests;
   }

   public static String getContactPhone() {
      String phone;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter your phone number >> ");
      phone = input.nextLine();
      return phone;
   }

   private static int getEventType() {
      int eventType;
      Scanner input = new Scanner(System.in);
      System.out.print("Event Type >> ");
      eventType = input.nextInt();
      return eventType;
   }

   public static void displayDetails(Event eventOne) {
      System.out.println();
      System.out.println("--EVENT DETAILS--");
      System.out.println("Event number is: " + eventOne.getEventNumber());
      System.out.println("Number of guests is: " + eventOne.getNumberOfGuests());
      System.out.println("Phone number is:  " + eventOne.getContactPhone());
      System.out.println("The event type is: " + eventOne.getEventName(eventOne.getEventType() - 1));
      System.out.println("The price per guest is $" + eventOne.getPricePerGuest());
      System.out.println("The total cost is: $" + eventOne.getPriceForEvent());
      System.out.println();
   }

   public static void displayMotto() {
      System.out.println("***************************************************************");
      System.out.println("*                                                             *");
      System.out.println("******** Carly's makes the food that makes it a party *********");
      System.out.println("*                                                             *");
      System.out.println("***************************************************************");
   }

   public static void eventTypeMenu() {
      System.out.println("------------------------EVENT TYPE MENU------------------------");
      System.out.println("1: Wedding | 2: Baptism | 3: Birthday | 4: Corporate | 5: Other");
   }
}