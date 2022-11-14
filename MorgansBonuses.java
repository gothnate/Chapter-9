import java.util.*;
class MorgansBonuses
{
   public static void main(String[] args)
   {
        // your code here
        Scanner input = new Scanner(System.in);
        double[][] bonusData = { { 5.0, 9.0, 16.0, 22.0, 30.0 }, { 10.0, 12.0, 18.0, 24.0, 36.0 },
                { 20.0, 25.0, 32.0, 42.0, 53.0 }, { 32.0, 38.0, 45.0, 55.0, 68.0 }, { 46.0, 54.0, 65.0, 77.0, 90.0 },
                { 60.0, 72.0, 84.0, 96.0, 120.0 }, { 85.0, 100.0, 120.0, 140.0, 175.0 } };

        int weeks;
        int reviews;
        boolean done = false;

        while (!done){
            System.out.print("Enter number of weeks worked or 99 to quit: ");
            weeks = input.nextInt();
            if (weeks == 99){
                done = true;
            } else {
            System.out.print("Enter number of positive reviews: ");
            reviews = input.nextInt();
                switch (weeks) {
                    case 0:
                        MorgansBonuses.getBonus(bonusData, weeks, reviews);
                        break;
                    case 1:
                        MorgansBonuses.getBonus(bonusData, weeks, reviews);
                        break;
                    case 2:
                        MorgansBonuses.getBonus(bonusData, weeks, reviews);
                        break;
                    case 3:
                        MorgansBonuses.getBonus(bonusData, weeks, reviews);
                        break;
                    case 4:
                        MorgansBonuses.getBonus(bonusData, weeks, reviews);
                        break;
                    case 5:
                        MorgansBonuses.getBonus(bonusData, weeks, reviews);
                        break;
                    default:
                        MorgansBonuses.getBonus(bonusData, weeks, reviews);
                }
            }
        }
        input.close();
    }

    private static void getBonus(double[][] bonusData, int weeks, int reviews) {
        if (reviews > 4){
            reviews = 4;
        }
        System.out.println("Bonus to be awarded: " + bonusData[weeks][reviews]);
        System.out.println();
    }
}