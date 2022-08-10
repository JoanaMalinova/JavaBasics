package ConditionalStAdvPrActice;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMin = Integer.parseInt(scanner.nextLine());
        int examTime = 60*examHour+examMin;
        int arrivalTime = 60*arrivalHour+arrivalMin;
        int difference = Math.abs(examTime-arrivalTime);
        int diffHour = difference/60;
        int diffMin = difference%60;
        if(examTime==arrivalTime||(examTime>arrivalTime && examTime-arrivalTime<=30)){
            System.out.println("On time");
            if (examTime-arrivalTime>=1){
                System.out.printf("%d minutes before the start",diffMin);
            }
        }else if(examTime>arrivalTime && examTime-arrivalTime>30){
            System.out.println("Early");
            if (examTime-arrivalTime>=60){
                System.out.printf("%d:%02d hours before the start",diffHour,diffMin);
            }else if (examTime-arrivalTime<60){
                System.out.printf("%d minutes before the start",diffMin);
            }

        }else if(examTime<arrivalTime){
            System.out.println("Late");
            if (arrivalTime-examTime<60){
                System.out.printf("%d minutes after the start",diffMin);
            }else if (arrivalTime-examTime>=60){
                System.out.printf("%d:%02d hours after the start",diffHour,diffMin);
            }
        }

    }
}
