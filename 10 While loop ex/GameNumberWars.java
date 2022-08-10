package WhileLoopPractice;

import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String player1 = scanner.nextLine();
        String player2 = scanner.nextLine();
        String end = scanner.nextLine();
        int pointsPl1 = 0;
        int pointsPl2 = 0;
        int diff = 0;
        String winner = "";
        int winnerPoints = 0;
        boolean numberWars = false;
        while (!end.equals("End of game")) {
            int cardPl1 = Integer.parseInt(end);
            end = scanner.nextLine();
            int cardPl2 = Integer.parseInt(end);
            diff = Math.abs(cardPl1 - cardPl2);
            if (numberWars) {
                if (cardPl1 > cardPl2) {
                    winner = player1;
                    winnerPoints = pointsPl1;
                    break;
                } else {
                    winner = player2;
                    winnerPoints = pointsPl2;
                    break;
                }
            } else {
                if (cardPl1 > cardPl2) {
                    pointsPl1 += diff;
                } else if (cardPl2 > cardPl1) {
                    pointsPl2 += diff;
                } else {
                    numberWars = true;
            }

            }
            end = scanner.nextLine();
        }
        if (numberWars){
            System.out.println("Number wars!");
            System.out.printf("%s is winner with %d points",winner,winnerPoints);

        }else {
            System.out.printf("%s has %d points%n",player1,pointsPl1);
            System.out.printf("%s has %d points",player2,pointsPl2);

        }
    }
}
