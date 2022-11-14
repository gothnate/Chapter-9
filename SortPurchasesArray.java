import java.util.*;
public class SortPurchasesArray {

	public static void main(String[] args) {
		double salesAmount;
        int invoiceNumber;
        char option;
		Scanner input  = new Scanner(System.in);
		Purchase[] items = new Purchase[5];

        for (int i = 0; i < items.length; i++) {
            System.out.print("Invoice Number >> ");
            invoiceNumber = input.nextInt();
            System.out.print("Sales amount >> ");
            salesAmount = input.nextDouble();

            items[i] = new Purchase();
            items[i].setInvoiceNumber(invoiceNumber);
            items[i].setSaleAmount(salesAmount);
        }

        System.out.println("Sort Purchases by (I)nvoice number, (S)ale amount, or (Z) to quit? ");
        option = input.next().charAt(0);
        while (option != 'Z') {
            if (option == 'I') {
                sortInvoice(items);
            } else if (option == 'S') {
                sortSales(items);
            }
            System.out.println("Sort Purchases by (I)nvoice number, (S)ale amount, or (Z) to quit? ");
            option = input.next().charAt(0);
        }
        input.close();
	}
	public static void sortInvoice(Purchase[] items) {
        for (int i = 1; i < items.length; i++) {
            for (int j = 0; j < items.length - i; j++) {
                if (items[j].getInvoiceNumber() > items[j + 1].getInvoiceNumber()) {
                    Purchase temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < items.length; i++) {
            items[i].display();
		}
	}
	public static void sortSales(Purchase[] items) {
        for (int i = 1; i < items.length; i++) {
            for (int j = 0; j < items.length - i; j++) {
                if (items[j].getSaleAmount() > items[j + 1].getSaleAmount()) {
                    Purchase temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < items.length; i++) {
            items[i].display();
		}
	}
}