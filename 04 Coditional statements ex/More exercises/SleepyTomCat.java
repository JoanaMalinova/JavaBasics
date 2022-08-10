package CoditionalStPractical;

import java.util.Scanner;

public class ExtraSleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int holidays = Integer.parseInt(scanner.nextLine());
        int workdays = 365- holidays;
        int playtime = workdays*63+holidays*127;
        if (playtime>30000){
            double excessPlaytime = playtime - 30000;
            double hours = excessPlaytime/60;
            double hours1 =Math.floor(hours);
            double minutes =(hours-hours1)*60;
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play",hours1,minutes);
        } else {
            double lessPlaytime = 30000-playtime;
            double hours = lessPlaytime/60;
            double hours1 =Math.floor(hours);
            double minutes =(hours-hours1)*60;
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play", hours1, minutes);
        }
    }
}
