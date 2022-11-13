import java.util.*;
public class SalespersonSort
{
   public static void main(String[] args)
   {
       // your code here
    Scanner input = new Scanner(System.in);
    Salesperson[] salesTraits = new Salesperson[7];
    int id;
    double sales;
    String order;

    for (int i = 0; i < salesTraits.length; i++) {
        System.out.print("Enter an ID number >> ");
        id = input.nextInt();
        System.out.print("Enter Sales Value >> ");
        sales = input.nextDouble();
        input.nextLine();
        Salesperson tempTraits = new Salesperson(i, sales);

        tempTraits.setId(id);
        tempTraits.setSales(sales);
        salesTraits[i] = tempTraits;
    }

    System.out.println("By which field do you want to sort?\n(I)d number or (S)ales");
    order = input.nextLine().toUpperCase();

    if (order.charAt(0) == 'I') {
        sortByID(salesTraits);
    } else {
        sortBySales(salesTraits);
    }
    input.close();

    String message = "";
    for (int i = 0; i < salesTraits.length; i++) {
        message = message + "\nID " + salesTraits[i].getId() + " Sales: " + salesTraits[i].getSales();
        System.out.println(message);
    }
   }

  private static void sortByID(Salesperson[] salesTraits) {
       int a;
       int b;
       Salesperson temp;
       Integer stringb;
       Integer stringbPlus;

       for (a = 0; a < salesTraits.length - 1; a++) {
            for (b = 0; b < salesTraits.length - 1; b++) {
                stringb = salesTraits[b].getId();
                stringbPlus = salesTraits[b + 1].getId();
                if (stringb.compareTo(stringbPlus) > 0) {
                    temp = salesTraits[b];
                    salesTraits[b] = salesTraits[b + 1];
                    salesTraits[b + 1] = temp;
                }
            }
       }
    }

    private static void sortBySales(Salesperson[] salesTraits) {
        int a;
        int b;
        Salesperson temp;
        Double stringb;
        Double stringbPlus;

        for (a = 0; a < salesTraits.length - 1; a++) {
            for (b = 0; b < salesTraits.length - 1; b++) {
                stringb = salesTraits[b].getSales();
                stringbPlus = salesTraits[b + 1].getSales();
                if (stringb.compareTo(stringbPlus) > 0) {
                    temp = salesTraits[b];
                    salesTraits[b] = salesTraits[b + 1];
                    salesTraits[b + 1] = temp;
                }
            }
        }
    }
}