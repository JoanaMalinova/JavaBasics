package CoditionalStPractical;

import java.util.Scanner;

public class ExtraFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hrsNeeded = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int workersExtraHrs = Integer.parseInt(scanner.nextLine());
        double daysLeft = days-0.1*days;
        double realHours = Math.floor(workersExtraHrs*2*days+8*daysLeft);
        if (realHours>=hrsNeeded){
            double left = realHours-hrsNeeded;
            System.out.printf("Yes!%.0f hours left.",left);
        }else {
            double needed =hrsNeeded- realHours;
            System.out.printf("Not enough time!%.0f hours needed.",needed);
        }
    }
}
