import java.util.Scanner;
public class MeanMedian {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            //int line = 1;
            System.out.println("Enter Number " + i);
            numbers[i] = input.nextInt();
        }
        System.out.print("You entered: ");
        for (int j = 0; j < 8; j++) {
            System.out.print(numbers[j] + ", ");
        }
        System.out.print(numbers[8]);
        System.out.println();

        //sum array
        for (int k = 0; k < 9; k++) {
            sum += numbers[k];
        }

        System.out.print("The mean is " + sum/(float)9 + " and the median is " + numbers[4]);
        input.close();
    }
}