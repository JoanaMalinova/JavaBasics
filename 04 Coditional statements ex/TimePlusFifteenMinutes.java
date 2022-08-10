package CoditionalStPractical;

import java.util.Scanner;

public class TimePlusFifteenMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int hour1=0;
        int minutes1=0;

        if (minutes>=45){
            hour1=hour+1;
            minutes1=Math.abs(60-(minutes+15));
        }else { minutes1 = minutes+15;
            hour1=hour;
        }
        int hour2=0;
        if (hour1>=24){
            hour2= Math.abs(24-hour1);
        }else {
             hour2 = hour1;
        }
        System.out.printf("%d:%02d",hour2,minutes1);
        }
}
