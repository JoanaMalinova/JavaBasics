package WhileLoopPractice;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        String stop = scanner.nextLine();
        int totalPieces = width*length;
        int piecesGiven = 0;
        int diff = 0;
        boolean cakeLeft = true;
        while (!stop.equals("STOP")) {
            int pieces = Integer.parseInt(stop);
            piecesGiven += pieces;
            diff = Math.abs(totalPieces - piecesGiven);
            if (piecesGiven >= totalPieces) {
                cakeLeft = false;
                System.out.printf("No more cake left! You need %d pieces more.", diff);
                break;
            }
            stop = scanner.nextLine();
        }
        if(diff>0&&cakeLeft) {

            System.out.printf("%d pieces are left.",diff);
        }
    }
}
