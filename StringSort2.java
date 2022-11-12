import java.util.*;
public class StringSort2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] user = new String[15];
        int size = 0;
        int i;
        String value;
        String quit = "zzz";

        System.out.print("Enter string or 'zzz' to quit >> ");
        value = input.nextLine();
        while (!value.equalsIgnoreCase(quit)) {
            user[size] = value;
            size++;
            System.out.print("Enter string or 'zzz' to quit >> ");
            value = input.nextLine();
        }

        input.close();

        for (i = 0; i < size; i++) {
            if (user != null) {
                Arrays.sort(user, 0, size, String.CASE_INSENSITIVE_ORDER);
                System.out.println(user[i]);
            }
        }
    }
}