import java.util.Scanner;
public class MeanMedian2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create array
        int[] numbers = new int[20];
        int len = numbers.length;
        int sum = 0;
        int done = 9999;

        // User input
        for (int i = 0; i < len; i++) {
            System.out.print("Enter Number >> ");
            numbers[i] = input.nextInt();
            if (numbers[i] == done) {
                break;
            }
        }

        while (numbers[len - 1] == 0 || numbers[len - 1] == 9999) {
            --len;
        }

        // User output
        System.out.print("You entered: ");
        for (int j = 0; j < len; j++) {
            if (numbers[j] != 0 || numbers[j] != done)
            System.out.print(numbers[j] + " ");
        }

        //sum array
        for (int k = 0; k < len; k++) {
            sum += numbers[k];
        }

        // final output with mean calculation
        double res = medianCal(len, numbers);
        System.out.print("\nThe mean is " + sum / (float) len + " and the median is " + res);
        input.close();
    }

    // median calculation
    static double medianCal(int  n,int[] numbers) {
	double m = 0;
	if(n % 2 == 1) {
		m = numbers[((n + 1) / 2) - 1];
	} else {
		m = (numbers[n / 2 - 1] + numbers[n / 2]) / 2;
	}
    return m;
    }
}