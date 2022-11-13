import java.util.*;

public class SalespersonDatabase {

    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        Salesperson[] salespeople = new Salesperson[20];
        int count = 0;
        char option;

        System.out.print("Do you want to (A)dd, (D)elete, or (C)hange a record, or (Q)uit >> ");
        option = input.nextLine().charAt(0);
        while (option != 'Q') {
            if (option == 'A') {
                count = addOption(salespeople, count);
            } else {
                if (option == 'D') {
                    count = deleteOption(salespeople, count);
                } else {
                    if (option == 'C') {
                        changeOption(salespeople, count);
                    } else {
                        System.out.println("Invalid Entry");
                    }
                }
            }
            System.out.print("Do you want to (A)dd, (D)elete, or (C)hange a record, or (Q)uit >> ");
            option = input.nextLine().charAt(0);
        }
    }

    public static int addOption(Salesperson[] array, int count) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int id;
        double sales;
        boolean alreadyEntered;
        if (count == array.length) {
            System.out.println("Sorry - array is full -- cannot add a record");
        } else {
            System.out.print("Enter salesperson ID >> ");
            id = input.nextInt();
            alreadyEntered = false;
            for (int x = 0; x < count; x++) {
                if (array[x].getId() == id) {
                    System.out.println("Sorry -- ID number already exists");
                    alreadyEntered = true;
                }
            }
            if (!alreadyEntered) {
                System.out.print("Enter sales >> ");
                sales = input.nextDouble();
                array[count] = new Salesperson(id, sales);
                count++;
            }
        }
        display(array, count);
        input.nextLine();
        return count;
    }

    public static int deleteOption(Salesperson[] array, int count) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int id;
        int position = 0;
        if (count == 0) {
            System.out.println("Cannot delete - no records in database");
        } else {
            System.out.print("Enter ID to delete >> ");
            id = input.nextInt();
            boolean exists = false;
            for (int x = 0; x < count; x++) {
                if (array[x].getId() == id) {
                    exists = true;
                    position = x;
                }
            }
            if (!exists) {
                System.out.println("Sorry - ID #" + id + " does not exist in the database");
            } else {
                for (int x = position; x < count - 1; x++) {
                    array[x] = array[x + 1];
                }
            }
            if (exists) {
                count--;
            }
            input.nextLine();
            display(array, count);
        }
        return count;
    }

    public static void changeOption(Salesperson[] array, int count) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        int position = 0;
        int id;
        double sales;
        if (count == 0) {
            System.out.println("Database is empty -- cannot change record");
        } else {
            System.out.print("Enter ID to change >> ");
            id = input.nextInt();
            boolean exists = false;
            for (int x = 0; x < count; x++) {
                if (array[x].getId() == id) {
                    exists = true;
                    position = x;
                }
            }
            if (!exists) {
                System.out.println("Sorry - ID #" + id + " does not exist in the database");
            } else {
                System.out.print("Enter sales >> ");
                sales = input.nextDouble();
                array[position].setSales(sales);
            }
            input.nextLine();
            display(array, count);
        }
    }

    public static void display(Salesperson[] array, int count) {
        // Write your code here
        int a, b;
        Salesperson temp;
        int highSubscript = count - 1;

        for (a = 0; a < highSubscript; a++) {
            for (b = 0; b < highSubscript; b++) {
                if (array[b].getId() > array[b + 1].getId()) {
                    temp = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = temp;
                }
            }
            System.out.println("\nCurrent database:");
            for (a = 0; a < count; a++) {
                System.out.println("ID #" + array[a].getId() + " $" + array[a].getSales());
            }
            System.out.println();
        }
    }
}