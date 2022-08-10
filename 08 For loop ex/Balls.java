package ForLoopPr;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
       int red = 0;
       int orange = 0;
       int yellow = 0;
       int white = 0;
       int black = 0;
       double points = 0;
       int others = 0;
        for (int i = 1; i <= n ; i++) {
            String colour = scanner.nextLine();
            switch (colour){
                case"red":
                    red += 1;
                    points += 5;
                    break;
                case"orange":
                    orange  += 1;
                    points += 10;
                    break;
                case "yellow":
                    yellow += 1;
                    points +=15;
                    break;
                case "white":
                    white += 1;
                    points += 20;
                    break;
                case"black":
                    points = Math.floor(points/2);
                    black += 1;
                    break;
                default:
                    others += 1;
                    break;

            }

        }
        System.out.printf("Total points: %.0f%n",points);
        System.out.printf("Red balls: %d%n",red);
        System.out.printf("Orange balls: %d%n",orange);
        System.out.printf("Yellow balls: %d%n",yellow);
        System.out.printf("White balls: %d%n",white);
        System.out.printf("Other colors picked: %d%n",others);
        System.out.printf("Divides from black balls: %d",black);
    }
}
