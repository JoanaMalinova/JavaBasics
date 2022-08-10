package ForLoopPr;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournamentNum = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());
        int finalPoints = initialPoints;
        int win = 0;
        for(int i =1;i<=tournamentNum;i++){
            String tournamentStage = scanner.nextLine();
            switch (tournamentStage){
                case"W":
                    finalPoints += 2000;
                    win += 1;
                    break;
                case "F":
                    finalPoints += 1200;
                    break;
                case"SF":
                    finalPoints += 720;
                    break;
            }

        }
        double average =Math.floor(1.0*(finalPoints-initialPoints)/tournamentNum);
        double winPercent = 100.0* win/tournamentNum;
        System.out.printf("Final points: %d%n",finalPoints);
        System.out.printf("Average points: %.0f%n",average);
        System.out.printf("%.2f%%",winPercent);

    }
}
