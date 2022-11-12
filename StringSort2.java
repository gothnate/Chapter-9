import java.util.*;
public class StringSort2 {
    public static void main(String[] args) {

        String[] user = new String[15];
        int i;
        String done = "zzz";

        for (i = 0; i < 15; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter String >> ");
            user[i] = input.nextLine();
            if (user[i].equalsIgnoreCase(done)) {
                break;
            }
            input.close();
        }

        System.out.println("You entered: ");
        for (i = 0; i < 15; i++) {
            if (user[i] != null && !user[i].equals(done)) {
                Arrays.sort(user, Comparator.nullsLast(Comparator.naturalOrder()));
                System.out.println(user[i]);
            }
        }
    }

}