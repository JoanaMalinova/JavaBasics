package CoditionalStPractical;

import java.util.Scanner;

public class ExtraPipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int volume = Integer.parseInt(scanner.nextLine());
        int debitPipe1 = Integer.parseInt(scanner.nextLine());
        int debitPipe2 = Integer.parseInt(scanner.nextLine());
        double hoursAway = Double.parseDouble(scanner.nextLine());
        double waterVlm = hoursAway*debitPipe1+hoursAway*debitPipe2;
        if (volume>=waterVlm){
            double waterVlmPercent =waterVlm/volume*100;
            double volumePipe1 = hoursAway*debitPipe1;
            double volumePipe2 = hoursAway*debitPipe2;
            double vlmPipe1Percent = volumePipe1/waterVlm*100;
            double vlmPipe2Percent = volumePipe2/waterVlm*100;
            System.out.println("The pool is "+waterVlmPercent+"% full. Pipe 1: "+vlmPipe1Percent+"%. Pipe 2: "+vlmPipe2Percent+"%.");
        } else {
            double overflow = waterVlm-volume;
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",hoursAway,overflow);
        }

    }
}
