import java.util.Scanner;
public class Majors {

    enum Major {ACC, CHEM, CIS, ENG, HIS, PHYS};

    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        String[] division = {"Business Division", "Science Division", "Humanities Division"};

        System.out.println("The majors offered are: ");
        for (Major major : Major.values()) {
            System.out.print(major + " ");
        }
        System.out.println();

        System.out.print("Enter major to see its division >> ");
        String user = input.nextLine().toUpperCase();
        System.out.print("You entered: " + user + "\n");
        input.close();

        if (user.equals("ACC") || user.equals("CIS")) {
            System.out.println(user + " is in the " + division[0]);
        }
        if (user.equals("CHEM") || user.equals("PHYS")) {
            System.out.println(user + " is in the " + division[1]);
        }
        if (user.equals("ENG") || user.equals("HIS")) {
            System.out.println(user + " is in the " + division[2]);
        }
    }
}