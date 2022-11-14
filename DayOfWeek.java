import java.util.Scanner;
public class DayOfWeek {
        enum Day {SUN, MON, TUE, WED, THU, FRI, SAT};

    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        String[] hours = { "11-5", "9-9", "10-6" };

        System.out.println("The days are: ");
        for (Day days : Day.values()) {
            System.out.print(days + " ");
        }
        System.out.println();

        System.out.print("Enter the day code to find our hours >> ");
        String user = input.nextLine().toUpperCase();
        System.out.println("You entered " + user);
        input.close();

        if (user.equals("SUN")) {
            System.out.println("On " + user + " our hours are " + hours[0]);
        }
        if (user.equals("MON") || user.equals("TUE") || user.equals("WED") || user.equals("THU") || user.equals("FRI")) {
            System.out.println("On " + user + " our hours are " + hours[1]);
        }
        if (user.equals("SAT")) {
            System.out.println("On " + user + " our hours are " + hours[2]);
        }
    }
}