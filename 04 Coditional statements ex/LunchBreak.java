package CoditionalStPractical;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String series = scanner.nextLine();
        double durationSeries = Double.parseDouble(scanner.nextLine());
        double durationBreak = Double.parseDouble(scanner.nextLine());
        double lunchBreak = durationBreak/8;
        double restBreak = durationBreak/4;
        double timeLeft = durationBreak -(lunchBreak+restBreak);

        if (timeLeft>=durationSeries){
            double freeTime = Math.ceil(timeLeft-durationSeries);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",series,freeTime);
        }else {
            double neededTime = Math.ceil(durationSeries-timeLeft);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.",series,neededTime);

        }




    }
}
